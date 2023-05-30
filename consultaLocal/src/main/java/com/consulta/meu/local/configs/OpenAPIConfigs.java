package com.consulta.meu.local.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.tags.Tag;

@Configuration
public class OpenAPIConfigs {

	@Bean
	public OpenAPI springOpenAPI() {

		OpenAPI openAPI = new OpenAPI();

		Info info = new Info();
		info.title("Consulta Local");
		info.version("v0.0.1");
		openAPI.info(info);

		openAPI.addTagsItem(new Tag().name("Consulta").description("Consulta os dados necessários"));

		return openAPI;
	}
}
