package com.ecommerce.core.adapters.in.rest.dto.request;

import lombok.Data;

@Data
public class LoginRequestDto {
    private String email;
    private String password;
}
