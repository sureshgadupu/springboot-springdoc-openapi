package dev.fullstackcode.eis;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootSpringdocOpenapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSpringdocOpenapiApplication.class, args);
	}

	@Bean
	public OpenAPI springShopOpenAPI() {
		return new OpenAPI()
				.components(new Components().addSecuritySchemes("basicScheme",
						new SecurityScheme().type(SecurityScheme.Type.HTTP).scheme("basic")))
				.info(new Info().title("EIS API")
						.description("Employee Information System sample application")
						.version("v0.0.1")
						.license(new License().name("Apache 2.0").url("http://springdoc.org"))
						.description("SpringShop Wiki Documentation")
						.contact(new Contact().email("test@test.com").url("http://fullstackcode.dev")))
						;
	}

//	@Bean
//	public GroupedOpenApi publicApi() {
//		return GroupedOpenApi.builder()
//				.group("eis-user")
//				.pathsToMatch("/user/**")
//				.build();
//	}
//	@Bean
//	public GroupedOpenApi adminApi() {
//		return GroupedOpenApi.builder()
//				.group("eis-admin")
//				.pathsToMatch("/admin/**")
//				.build();
//	}

}
