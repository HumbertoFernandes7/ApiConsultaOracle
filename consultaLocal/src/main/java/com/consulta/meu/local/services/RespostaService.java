package com.consulta.meu.local.services;

import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.consulta.meu.local.dtos.inputs.ConsultaAnexoInput;
import com.consulta.meu.local.dtos.outputs.ConsultaAnexoOutput;
import com.consulta.meu.local.dtos.outputs.RespostaOutput;

import reactor.core.publisher.Mono;

@Service
public class RespostaService {


	public WebClient configWebClient(String url, String login, String senha) {
		WebClient webClient = WebClient.builder()
				.baseUrl(url)
				.defaultHeaders(h -> h.setBasicAuth(login, senha))
				.build();
		return webClient;
	}
	
	
	public RespostaOutput devolveResposta() {
		
		WebClient webClient = configWebClient(
				"https://oicbalcaounico-homolog-grynmqykxhtn-gr.integration.ocp.oraclecloud.com/ic/api/integration/v1/flows/rest/TESTE_HUMBERTO/1.0/",
				"agente.jucesp", "Jucesp@1234567");

		Mono<RespostaOutput> monoResposta = webClient.method(HttpMethod.GET).retrieve()
				.bodyToMono(RespostaOutput.class);

		RespostaOutput resposta = monoResposta.block();

		return resposta;
	}

	
	public ConsultaAnexoOutput devolveRespostaTeste(ConsultaAnexoInput consultaAnexoInput) {
		
		WebClient webClient = configWebClient(
				"https://integration-test-grg5hzhwviah-gr.integration.sa-saopaulo-1.ocp.oraclecloud.com/ic/api/integration/v1/flows/rest/CONSULTA_ANEXO/1.0/",
				"sergio.braun@apoioprodesp.sp.gov.br", "40Gbnopc@2GEP20211");
		
		ConsultaAnexoOutput response = webClient.method(HttpMethod.POST)
				.accept(MediaType.APPLICATION_JSON)
				.body(Mono.just(consultaAnexoInput), ConsultaAnexoInput.class)
				.retrieve()
				.bodyToMono(ConsultaAnexoOutput.class).block();

		return response;
	}
}
