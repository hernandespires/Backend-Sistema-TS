package br.com.api.tsagencia.tsagencia.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityFilterChainConfiguration {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http)
            throws Exception {
                http
                        .csrf(csrf -> csrf.disable())
                        .cors(Customizer.withDefaults())
                        .authorizeHttpRequests(auth -> auth
                                .requestMatchers(
                                        HttpMethod.POST, "/users/login"
                                ).permitAll()
                                .requestMatchers(
                                        HttpMethod.OPTIONS, "/**"
                                ).permitAll()
                                .anyRequest()
                                .authenticated()
                        );

        return http.build();
    }
}