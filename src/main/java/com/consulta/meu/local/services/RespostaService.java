package com.consulta.meu.local.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.consulta.meu.local.configs.UriConfigs;
import com.consulta.meu.local.dtos.inputs.ConsultaAnexoInput;
import com.consulta.meu.local.dtos.inputs.ConsultaManifestacaoCpfInput;
import com.consulta.meu.local.dtos.inputs.ConsultaMenuAssuntoInput;
import com.consulta.meu.local.dtos.inputs.ConsultaMenuServicoInput;
import com.consulta.meu.local.dtos.inputs.ConsultaThreadManifestacaoInput;
import com.consulta.meu.local.dtos.inputs.InserirAnexoInput;
import com.consulta.meu.local.dtos.inputs.InserirThreadManifestacaoInput;
import com.consulta.meu.local.dtos.inputs.RegistraManifestacaoInput;
import com.consulta.meu.local.dtos.inputs.RetornaProdutoInput;
import com.consulta.meu.local.dtos.inputs.VerificaManifestacao7DiasInput;
import com.consulta.meu.local.dtos.outputs.ConsultaAnexoOutput;
import com.consulta.meu.local.dtos.outputs.ConsultaCanalEntradaOutput;
import com.consulta.meu.local.dtos.outputs.ConsultaManifestacaoCpfOutput;
import com.consulta.meu.local.dtos.outputs.ConsultaMenuAssuntoOutput;
import com.consulta.meu.local.dtos.outputs.ConsultaMenuLocalCiretranOutput;
import com.consulta.meu.local.dtos.outputs.ConsultaMenuPeriodoOutput;
import com.consulta.meu.local.dtos.outputs.ConsultaMenuPostoPoupaTempoOutput;
import com.consulta.meu.local.dtos.outputs.ConsultaMenuServicoOutput;
import com.consulta.meu.local.dtos.outputs.ConsultaStatusOutput;
import com.consulta.meu.local.dtos.outputs.ConsultaThreadManifestacaoOutput;
import com.consulta.meu.local.dtos.outputs.InserirAnexoOutput;
import com.consulta.meu.local.dtos.outputs.InserirThreadManifestacaoOutput;
import com.consulta.meu.local.dtos.outputs.RegistraManifestacaoOutput;
import com.consulta.meu.local.dtos.outputs.RespostaOutput;
import com.consulta.meu.local.dtos.outputs.RetornaProdutoOutput;
import com.consulta.meu.local.dtos.outputs.VerificaManifestacao7DiasOutput;

import reactor.core.publisher.Mono;

@Service
public class RespostaService {

	@Value("${consulta-api.usuario}")
	private String usuario;

	@Value("${consulta-api.senha}")
	private String senha;

	// metodo auxiliar
	public WebClient configWebClient(String url, String login, String senha) {
		WebClient webClient = WebClient.builder().baseUrl(url).defaultHeaders(h -> h.setBasicAuth(login, senha))
				.build();
		return webClient;
	}

	public <T> Mono<T> chamadaGET(Class<T> responseType, WebClient webClient) {
		return webClient.method(HttpMethod.GET).retrieve().bodyToMono(responseType);
	}

	public <T> Mono<T> chamadaPOST(Object requestBody, Class<T> responseType, WebClient webClient) {
		return webClient.post().contentType(MediaType.APPLICATION_JSON).bodyValue(requestBody).retrieve()
				.bodyToMono(responseType);
	}

	// metodos de serviço
	public RespostaOutput devolveResposta() {
		WebClient webClient = configWebClient(UriConfigs.uriDevolveResposta, "agente.jucesp", "Jucesp@1234567");

		return chamadaGET(RespostaOutput.class, webClient).block();
	}

	public ConsultaAnexoOutput devolveConsultaAnexo(ConsultaAnexoInput consultaAnexoInput) {
		WebClient webClient = configWebClient(UriConfigs.uriConsultaAnexo, usuario, senha);

		return chamadaPOST(consultaAnexoInput, ConsultaAnexoOutput.class, webClient).block();
	}

	public ConsultaManifestacaoCpfOutput devolveConsultaManifestacaoCpf(
			ConsultaManifestacaoCpfInput consultaManifestacaoCpfInput) {
		WebClient webClient = configWebClient(UriConfigs.uriConsultaManifestacaoCpf, usuario, senha);

		return chamadaPOST(consultaManifestacaoCpfInput, ConsultaManifestacaoCpfOutput.class, webClient).block();
	}

	public ConsultaMenuLocalCiretranOutput devolveConsultaMenuLocalCiretran() {
		WebClient webClient = configWebClient(UriConfigs.uriConsultaMenuLocalCiretran, usuario, senha);

		return chamadaGET(ConsultaMenuLocalCiretranOutput.class, webClient).block();
	}

	public ConsultaMenuPeriodoOutput devolveConsultaMenuPeriodo() {
		WebClient webClient = configWebClient(UriConfigs.uriConsultaMenuPeriodo, usuario, senha);

		return chamadaGET(ConsultaMenuPeriodoOutput.class, webClient).block();
	}

	public ConsultaMenuPostoPoupaTempoOutput devolveConsultaMenuPostoPoupaTempoOutput() {
		WebClient webClient = configWebClient(UriConfigs.uriConsultaMenuPostoPoupaTempo, usuario, senha);

		return chamadaGET(ConsultaMenuPostoPoupaTempoOutput.class, webClient).block();
	}

	public InserirAnexoOutput devolveInserirAnexo(InserirAnexoInput inserirAnexoInput) {
		WebClient webClient = configWebClient(UriConfigs.uriInserirAnexo, usuario, senha);

		return chamadaPOST(inserirAnexoInput, InserirAnexoOutput.class, webClient).block();
	}

	public RetornaProdutoOutput devolveRetornoProduto(RetornaProdutoInput retornaProdutoInput) {
		WebClient webClient = configWebClient(UriConfigs.uriRetornaProduto, usuario, senha);

		return chamadaPOST(retornaProdutoInput, RetornaProdutoOutput.class, webClient).block();
	}

	public ConsultaMenuAssuntoOutput devolveRetornaConsultaMenuAssunto(
			ConsultaMenuAssuntoInput consultaMenuAssuntoInput) {
		WebClient webClient = configWebClient(UriConfigs.uriConsultaMenuAssunto, usuario, senha);

		return chamadaPOST(consultaMenuAssuntoInput, ConsultaMenuAssuntoOutput.class, webClient).block();
	}

	public ConsultaMenuServicoOutput devolveRetornaConsultaMenuServico(
			ConsultaMenuServicoInput consultaMenuServicoInput) {
		WebClient webClient = configWebClient(UriConfigs.uriConsultaMenuServico, usuario, senha);

		return chamadaPOST(consultaMenuServicoInput, ConsultaMenuServicoOutput.class, webClient).block();
	}

	public ConsultaThreadManifestacaoOutput devolveRetornaConsultaThreadManifestacao(
			ConsultaThreadManifestacaoInput consultaThreadManifestacaoInput) {
		WebClient webClient = configWebClient(UriConfigs.uriConsultaThreadManifestacao, usuario, senha);

		return chamadaPOST(consultaThreadManifestacaoInput, ConsultaThreadManifestacaoOutput.class, webClient).block();
	}

	public RegistraManifestacaoOutput devolveRegistraManifestacao(RegistraManifestacaoInput registraManifestacaoInput) {
		WebClient webClient = configWebClient(UriConfigs.uriRegistraManifestacao, usuario, senha);

		return chamadaPOST(registraManifestacaoInput, RegistraManifestacaoOutput.class, webClient).block();
	}

	public VerificaManifestacao7DiasOutput devolveRegistraManifestacao7Dias(
			VerificaManifestacao7DiasInput verificaManifestacao7DiasInput) {
		WebClient webClient = configWebClient(UriConfigs.uriVerificaManifestacao7Dias, usuario, senha);

		return chamadaPOST(verificaManifestacao7DiasInput, VerificaManifestacao7DiasOutput.class, webClient).block();
	}

	public ConsultaCanalEntradaOutput devolveConsultaCanalEntrada() {
		WebClient webClient = configWebClient(UriConfigs.uriConsultaCanalEntrada, usuario, senha);

		return chamadaGET(ConsultaCanalEntradaOutput.class, webClient).block();
	}

	public ConsultaStatusOutput devolveConsultaStatus() {
		WebClient webClient = configWebClient(UriConfigs.ConsultaStatus, usuario, senha);

		return chamadaGET(ConsultaStatusOutput.class, webClient).block();
	}

	public InserirThreadManifestacaoOutput devolveInserirThreadManifestacao(
			InserirThreadManifestacaoInput inserirThreadManifestacaoInput) {
		return null;
	}
}
