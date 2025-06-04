# 🛒 ecommerce-core-app

![Java](https://img.shields.io/badge/Java-17-blue.svg)
![Spring Boot](https://img.shields.io/badge/Spring--Boot-3.2-green.svg)
![MySQL](https://img.shields.io/badge/MySQL-AWS--RDS-blue.svg)
![Security](https://img.shields.io/badge/JWT%20Auth-secure-orange.svg)
![License](https://img.shields.io/badge/license-MIT-lightgrey.svg)

> 💡 Plataforma backend modular para ecommerce, diseñada con buenas prácticas, lista para adaptarse a comercios locales.

---

## ✨ Características principales

- ✅ Arquitectura **Hexagonal (Ports & Adapters)**
- 🔐 Seguridad con **Spring Security + JWT**
- 🧾 **Documentación OpenAPI / Swagger**
- ☁️ **Integración con AWS** (S3 para imágenes, RDS para base de datos)
- 🛍️ Gestión de productos, stock, pedidos y clientes
- 💳 Soporte de pagos con **MercadoPago**
- 🧾 Integración con **AFIP (ARCA)** para facturación electrónica
- ♻️ Código mantenible, limpio y orientado a dominios

---

## 🧰 Tecnologías

| Categoría         | Tecnología                   |
|------------------|------------------------------|
| Lenguaje         | Java 17                      |
| Framework        | Spring Boot 3                |
| Seguridad        | Spring Security, JWT         |
| DB               | MySQL (RDS en AWS)           |
| Almacenamiento   | AWS S3                       |
| Documentación    | Springdoc OpenAPI (Swagger)  |
| Mapping          | MapStruct                    |
| Utilidades       | Lombok, Validation API       |
| Build Tool       | Maven                        |

---

## 📁 Estructura del proyecto (Hexagonal)

```ecommerce-core-app/
├── domain/ # Lógica del negocio (puertos, entidades)
├── application/ # Casos de uso (servicios, lógica)
├── adapters/
│ ├── in/ # Entradas (REST controllers)
│ └── out/ # Salidas (JPA, AWS S3, APIs externas)
├── config/ # Configuración de seguridad, beans, Swagger
├── dto/ # Clases de transferencia de datos
└── EcommerceApplication.java
```

## 🚀 Instalación local

### 📋 Requisitos

- Java 17
- Maven 3.8+
- Docker (para levantar MySQL local)
- Cuenta de AWS (S3 + RDS)
- Claves de MercadoPago y ARCA (AFIP)

---

### 🔧 Paso a paso

1. Clonar el repositorio:
    ```
   git clone https://github.com/tu-usuario/ecommerce-core-app.git
   cd ecommerce-core-app
   ```

2. Configurar el archivo application.yml con tus credenciales:
AWS S3,
Base de datos (MySQL / RDS),
JWT,
MercadoPago,
ARCA (AFIP)

3. Levantar la base de datos local (opcional, solo para desarrollo):
    ```
    docker run --name mysql-ecommerce \
    -e MYSQL_ROOT_PASSWORD=root \
    -e MYSQL_DATABASE=ecommerce \
    -p 3306:3306 \
    -d mysql:8
    ```

4. Ejecutar la aplicación:
    ``` 
    ./mvnw spring-boot:run
    ```

5. Acceder a la documentación Swagger:
http://localhost:8080/swagger-ui.html



### 📦 Endpoints iniciales

|Método	|Ruta |	Descripción|
| ------|:------:|:-------------:|
|POST	|/auth/register|	Registro de usuarios|
|POST	|/auth/login|	Login y generación de JWT|
|GET	|/products|	Listar productos públicos|



### 📬 Contacto
¿Ideas, bugs o sugerencias?
Abrí un issue o escribinos  a: sebas.teistore@gmail.com o valentinapescarav@gmail.com

⚖️ Licencia
MIT © 2025 