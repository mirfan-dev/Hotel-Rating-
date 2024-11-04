package com.service.ApiGateway.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;


@Configuration
@EnableWebFluxSecurity
public class SecurityConfig {

    @Bean
    public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity httpSecurity) {

        return httpSecurity
                .authorizeExchange(authorize -> authorize
                        .anyExchange().authenticated()  // Authenticate all requests
                )
                .oauth2Client(withDefaults())  // OAuth2 client for login
                .oauth2ResourceServer(oauth2 -> oauth2
                        .jwt(withDefaults())  // JWT-based OAuth2 resource server
                )
                .build();





    }
}
