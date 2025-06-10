package com.ecommerce.core.application.service;

import org.springframework.security.crypto.password.PasswordEncoder;

import com.ecommerce.core.adapters.in.rest.dto.request.LoginRequestDto;
import com.ecommerce.core.adapters.in.rest.dto.request.RegisterRequestDto;
import com.ecommerce.core.adapters.in.rest.dto.response.AuthResponseDto;
import com.ecommerce.core.domain.model.User;
import com.ecommerce.core.domain.port.out.UserRepository;
import com.ecommerce.core.infrastructure.security.JwtService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AuthService {


    private final UserRepository userRepository;
    private final JwtService jwtService;
    private final PasswordEncoder passwordEncoder;

    public AuthResponseDto register(RegisterRequestDto request) {
        User user = new User(null,
                request.getUsername(),
                request.getEmail(),
                passwordEncoder.encode(request.getPassword()),
                "USER");

        userRepository.save(user);
        String token = jwtService.generateToken(user.getEmail());
        return new AuthResponseDto(token);
    }

    public AuthResponseDto login(LoginRequestDto request) {
        User user = userRepository.findByEmail(request.getEmail())
                .orElseThrow(() -> new RuntimeException("User not found"));

        if (!passwordEncoder.matches(request.getPassword(), user.getPassword())) {
            throw new RuntimeException("Invalid credentials");
        }

        String token = jwtService.generateToken(user.getEmail());
        return new AuthResponseDto(token);
    }

}
