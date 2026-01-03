package br.com.api.tsagencia.tsagencia.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfiguration {
    @Bean
    OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API oficial da agência Trajetória do Sucesso 🧡")
                            .version("0.0.1")
                                .description("Todos os acessos disponíveis para acessar na API da agência")
                );
    }
}