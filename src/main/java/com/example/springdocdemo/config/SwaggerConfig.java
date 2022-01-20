package com.example.springdocdemo.config;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * 配置
 *
 * @author yanni
 * @date 2022/01/21
 */
@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "a",
                version = "1.0",
                description = "a",
                contact = @Contact(name = "TOM")
        )
)

public class SwaggerConfig {
    @Bean
    public GroupedOpenApi docker() {
        return GroupedOpenApi.builder()
                .packagesToScan("com.example.springdocdemo.controller")
                .group("api")
                .pathsToMatch("/**").build();


    }


}