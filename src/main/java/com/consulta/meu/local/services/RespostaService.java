package com.consulta.meu.local.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.consulta.meu.local.dtos.inputs.ConsultaAnexoInput;
import com.consulta.meu.local.dtos.inputs.ConsultaManifestacaoCpfInput;
import com.consulta.meu.local.dtos.inputs.ConsultaMenuAssuntoInput;
import com.consulta.meu.local.dtos.inputs.ConsultaMenuServicoInput;
import com.consulta.meu.local.dtos.inputs.ConsultaThreadManifestacaoInput;
import com.consulta.meu.local.dtos.inputs.InserirAnexoInput;
import com.consulta.meu.local.dtos.inputs.RetornaProdutoInput;
import com.consulta.meu.local.dtos.outputs.ConsultaAnexoOutput;
import com.consulta.meu.local.dtos.outputs.ConsultaManifestacaoCpfOutput;
import com.consulta.meu.local.dtos.outputs.ConsultaMenuAssuntoOutput;
import com.consulta.meu.local.dtos.outputs.ConsultaMenuLocalCiretranOutput;
import com.consulta.meu.local.dtos.outputs.ConsultaMenuPeriodoOutput;
import com.consulta.meu.local.dtos.outputs.ConsultaMenuPostoPoupaTempoOutput;
import com.consulta.meu.local.dtos.outputs.ConsultaMenuServicoOutput;
import com.consulta.meu.local.dtos.outputs.ConsultaThreadManifestacaoOutput;
import com.consulta.meu.local.dtos.outputs.InserirAnexoOutput;
import com.consulta.meu.local.dtos.outputs.RespostaOutput;
import com.consulta.meu.local.dtos.outputs.RetornaProdutoOutput;

import reactor.core.publisher.Mono;

@Service
public class RespostaService {
	
	@Value("${consulta-api.usuario}")
	private String usuario;

	@Value("${consulta-api.senha}")
	private String senha;
	
	
	public RespostaOutput devolveResposta() {
		WebClient webClient = configWebClient(
				"https://oicbalcaounico-homolog-grynmqykxhtn-gr.integration.ocp.oraclecloud.com/ic/api/integration/v1/flows/rest/TESTE_HUMBERTO/1.0/",
				"agente.jucesp", "Jucesp@1234567");

		Mono<RespostaOutput> monoResposta = webClient.method(HttpMethod.GET).retrieve()
				.bodyToMono(RespostaOutput.class);

		return monoResposta.block();
	}

	
	public ConsultaAnexoOutput devolveConsultaAnexo(ConsultaAnexoInput consultaAnexoInput) {
		WebClient webClient = configWebClient(
				"https://integration-test-grg5hzhwviah-gr.integration.sa-saopaulo-1.ocp.oraclecloud.com/ic/api/integration/v1/flows/rest/CONSULTA_ANEXO/1.0/",
				usuario, senha);
		
		ConsultaAnexoOutput response = webClient.method(HttpMethod.POST)
				.accept(MediaType.APPLICATION_JSON)
				.body(Mono.just(consultaAnexoInput), ConsultaAnexoInput.class)
				.retrieve()
				.bodyToMono(ConsultaAnexoOutput.class).block();

		return response;
	}


	public ConsultaManifestacaoCpfOutput devolveConsultaManifestacaoCpf(ConsultaManifestacaoCpfInput consultaManifestacaoCpfInput) {
		WebClient webClient = configWebClient(
				"https://integration-test-grg5hzhwviah-gr.integration.sa-saopaulo-1.ocp.oraclecloud.com/ic/api/integration/v1/flows/rest/CONSULTA_MANIFEST_POR_CPF/1.0/",
				usuario, senha);
		
		ConsultaManifestacaoCpfOutput response = webClient.method(HttpMethod.POST)
				.accept(MediaType.APPLICATION_JSON)
				.body(Mono.just(consultaManifestacaoCpfInput), ConsultaManifestacaoCpfInput.class)
				.retrieve()
				.bodyToMono(ConsultaManifestacaoCpfOutput.class).block();

		return response;
	}


	public ConsultaMenuLocalCiretranOutput devolveConsultaMenuLocalCiretran() {
		WebClient webClient = configWebClient(
				"https://integration-test-grg5hzhwviah-gr.integration.sa-saopaulo-1.ocp.oraclecloud.com/ic/api/integration/v1/flows/rest/CONSULTA_MENU_LOCALCIRET/1.0/",
				usuario, senha);
		
		Mono<ConsultaMenuLocalCiretranOutput> monoResposta = webClient.method(HttpMethod.GET).retrieve()
				.bodyToMono(ConsultaMenuLocalCiretranOutput.class);

		return monoResposta.block();
	}
	
	
	public ConsultaMenuPeriodoOutput devolveConsultaMenuPeriodo() {
		WebClient webClient = configWebClient(
				"https://integration-test-grg5hzhwviah-gr.integration.sa-saopaulo-1.ocp.oraclecloud.com/ic/api/integration/v1/flows/rest/CONSULTA_MENU_PERIODO/1.0/",
				usuario, senha);
		
		Mono<ConsultaMenuPeriodoOutput> monoResposta = webClient.method(HttpMethod.GET).retrieve()
				.bodyToMono(ConsultaMenuPeriodoOutput.class);

		return monoResposta.block();
	}
	
	
	public ConsultaMenuPostoPoupaTempoOutput devolveConsultaMenuPostoPoupaTempoOutput() {
		WebClient webClient = configWebClient(
				"https://integration-test-grg5hzhwviah-gr.integration.sa-saopaulo-1.ocp.oraclecloud.com/ic/api/integration/v1/flows/rest/CONSULTA_MENU_PERIODO/1.0/",
				usuario, senha);
		
		Mono<ConsultaMenuPostoPoupaTempoOutput> monoResposta = webClient.method(HttpMethod.GET).retrieve()
				.bodyToMono(ConsultaMenuPostoPoupaTempoOutput.class);

		return monoResposta.block();
	}
	
	
	public InserirAnexoOutput devolveInserirAnexo(InserirAnexoInput inserirAnexoInput) {
		WebClient webClient = configWebClient(
				"https://integration-test-grg5hzhwviah-gr.integration.sa-saopaulo-1.ocp.oraclecloud.com/ic/api/integration/v1/flows/rest/INSERIR_ANEXO/1.0/",
				usuario, senha);
		
		InserirAnexoOutput response = webClient.method(HttpMethod.POST)
				.accept(MediaType.APPLICATION_JSON)
				.body(Mono.just(inserirAnexoInput), InserirAnexoInput.class)
				.retrieve()
				.bodyToMono(InserirAnexoOutput.class).block();

		return response;
	}
	
	
	public RetornaProdutoOutput devolveRetornoProduto(RetornaProdutoInput retornaProdutoInput) {
		WebClient webClient = configWebClient(
				"https://integration-test-grg5hzhwviah-gr.integration.sa-saopaulo-1.ocp.oraclecloud.com/ic/api/integration/v1/flows/rest/RETORNA_PRODUTO/1.0/",
				usuario, senha);
		
		RetornaProdutoOutput response = webClient.method(HttpMethod.POST)
				.accept(MediaType.APPLICATION_JSON)
				.body(Mono.just(retornaProdutoInput), RetornaProdutoInput.class)
				.retrieve()
				.bodyToMono(RetornaProdutoOutput.class).block();

		return response;
	}


	public ConsultaMenuAssuntoOutput devolveRetornaConsultaMenuAssunto(ConsultaMenuAssuntoInput consultaMenuAssuntoInput) {
		WebClient webClient = configWebClient(
				"https://integration-test-grg5hzhwviah-gr.integration.sa-saopaulo-1.ocp.oraclecloud.com/ic/api/integration/v1/flows/rest/CONSULTA_MENU_ASSUNTO/1.0/",
				usuario, senha);
		
		ConsultaMenuAssuntoOutput response = webClient.method(HttpMethod.POST)
				.accept(MediaType.APPLICATION_JSON)
				.body(Mono.just(consultaMenuAssuntoInput), ConsultaMenuAssuntoInput.class)
				.retrieve()
				.bodyToMono(ConsultaMenuAssuntoOutput.class).block();

		return response;
	}


	public ConsultaMenuServicoOutput devolveRetornaConsultaMenuServico(ConsultaMenuServicoInput consultaMenuServicoInput) {
		WebClient webClient = configWebClient(
				"https://integration-test-grg5hzhwviah-gr.integration.sa-saopaulo-1.ocp.oraclecloud.com/ic/api/integration/v1/flows/rest/CONSULTA_MENU_SERVICO/1.0/",
				usuario, senha);
		
		ConsultaMenuServicoOutput response = webClient.method(HttpMethod.POST)
				.accept(MediaType.APPLICATION_JSON)
				.body(Mono.just(consultaMenuServicoInput), ConsultaMenuServicoInput.class)
				.retrieve()
				.bodyToMono(ConsultaMenuServicoOutput.class).block();

		return response;
	}
	
	// metodos auxiliares
		public WebClient configWebClient(String url, String login, String senha) {
			WebClient webClient = WebClient.builder()
					.baseUrl(url)
					.defaultHeaders(h -> h.setBasicAuth(login, senha))
					.build();
			return webClient;
		}


		public ConsultaThreadManifestacaoOutput devolveRetornaConsultaThreadManifestacao(ConsultaThreadManifestacaoInput consultaThreadManifestacaoInput) {
			WebClient webClient = configWebClient(
					"https://integration-test-grg5hzhwviah-gr.integration.sa-saopaulo-1.ocp.oraclecloud.com/ic/api/integration/v1/flows/rest/CONSULTA_THREAD_MANIFESTAC/1.0/",
					usuario, senha);
			
			ConsultaThreadManifestacaoOutput response = webClient.method(HttpMethod.POST)
					.accept(MediaType.APPLICATION_JSON)
					.body(Mono.just(consultaThreadManifestacaoInput), ConsultaThreadManifestacaoInput.class)
					.retrieve()
					.bodyToMono(ConsultaThreadManifestacaoOutput.class).block();

			return response;
		}
}
