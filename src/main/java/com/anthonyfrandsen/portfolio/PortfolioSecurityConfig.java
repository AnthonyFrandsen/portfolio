package com.anthonyfrandsen.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class PortfolioSecurityConfig {

    @Bean
    SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        return http
                .requiresChannel(channel ->
                        channel.anyRequest().requiresSecure()
                )
                .authorizeRequests(auth -> auth
                        .anyRequest().permitAll()
                )
                .build();
    }
}
