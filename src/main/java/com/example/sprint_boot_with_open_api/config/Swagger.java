package com.example.sprint_boot_with_open_api.config;



import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@OpenAPIDefinition(

        info = @Info(
                contact = @Contact( name = "Joel" , email = "jvmpegna@yahoo.com"),
                description = "Product Rest-APi",
                title = "OpenApi  specification - Joel",
                termsOfService = " Terms of service"
        ),
          servers =    @Server(
                description = " DEV",
                url = "https://localhost:8080"
        )

)
@Configuration
public class Swagger {


}
