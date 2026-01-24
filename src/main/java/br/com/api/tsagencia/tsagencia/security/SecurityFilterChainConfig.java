package br.com.api.tsagencia.tsagencia.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration
@EnableWebSecurity
public class SecurityFilterChainConfig {
    @Bean
    public org.springframework.security.web.SecurityFilterChain securityFilterChain(HttpSecurity http)
            throws Exception {
                http
                        .csrf(csrf -> csrf.disable())
                        .cors(Customizer.withDefaults())
                        .authorizeHttpRequests(auth -> auth
                                .requestMatchers(HttpMethod.POST, "/users/login").permitAll()
                                .requestMatchers("/rh/**").permitAll()
                                .requestMatchers("/file/**").permitAll()
                                .requestMatchers(HttpMethod.OPTIONS, "/**").permitAll()
                                .anyRequest().authenticated()
                        );

        return http.build();
    }
}