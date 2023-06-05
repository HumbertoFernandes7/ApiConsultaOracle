package com.consulta.meu.local.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.consulta.meu.local.configs.ControllerConfig;
import com.consulta.meu.local.dtos.inputs.ConsultaAnexoInput;
import com.consulta.meu.local.dtos.inputs.ConsultaManifestacaoCpfInput;
import com.consulta.meu.local.dtos.inputs.ConsultaMenuAssuntoInput;
import com.consulta.meu.local.dtos.inputs.ConsultaMenuServicoInput;
import com.consulta.meu.local.dtos.inputs.ConsultaThreadManifestacaoInput;
import com.consulta.meu.local.dtos.inputs.InserirAnexoInput;
import com.consulta.meu.local.dtos.inputs.RegistraManifestacaoInput;
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
import com.consulta.meu.local.dtos.outputs.RegistraManifestacaoOutput;
import com.consulta.meu.local.dtos.outputs.RespostaOutput;
import com.consulta.meu.local.dtos.outputs.RetornaProdutoOutput;
import com.consulta.meu.local.openapis.ConsultaControllerOpenAPI;
import com.consulta.meu.local.services.RespostaService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(ControllerConfig.PRE_URL + "/")
public class ConsultaController implements ConsultaControllerOpenAPI {

	@Autowired
	private RespostaService respostaService;

	@GetMapping("busca")
	public RespostaOutput devolveResposta() {
		return respostaService.devolveResposta();
	}

	@GetMapping("consulta-anexo")
	public ConsultaAnexoOutput consultaAnexo(@RequestBody @Valid ConsultaAnexoInput consultaAnexoInput) {
		return respostaService.devolveConsultaAnexo(consultaAnexoInput);
	}
	
	
	@GetMapping("consulta-manifestacao-cpf")
	public ConsultaManifestacaoCpfOutput consultaManifestacaoCpf(@RequestBody @Valid ConsultaManifestacaoCpfInput consultaManifestacaoCpfInput) {
		return respostaService.devolveConsultaManifestacaoCpf(consultaManifestacaoCpfInput);
	}
	
	
	@GetMapping("consulta-menu-local-ciretran")
	public ConsultaMenuLocalCiretranOutput consultaMenuLocalCiretran() {
		return respostaService.devolveConsultaMenuLocalCiretran();
	}
	
	
	@GetMapping("consulta-menu-periodo")
	public ConsultaMenuPeriodoOutput consultaMenuPeriodo() {
		return respostaService.devolveConsultaMenuPeriodo();
	}
	
	
	@GetMapping("consulta-menu-posto-poupatempo")
	public ConsultaMenuPostoPoupaTempoOutput consultaMenuPostoPoupaTempo() {
		return respostaService.devolveConsultaMenuPostoPoupaTempoOutput();
	}
	
	
	@GetMapping("inserir-anexo")
	public InserirAnexoOutput inserirAnexo(@RequestBody InserirAnexoInput inserirAnexoInput) {
		return respostaService.devolveInserirAnexo(inserirAnexoInput);
	}
	
	
	@GetMapping("retorna-produto")
	public RetornaProdutoOutput retornaProduto(@RequestBody RetornaProdutoInput retornaProdutoInput) {
		return respostaService.devolveRetornoProduto(retornaProdutoInput);
	}
	
	
	@GetMapping("consulta-menu-assunto")
	public ConsultaMenuAssuntoOutput retornaConsultaMenuAssunto(@RequestBody ConsultaMenuAssuntoInput consultaMenuAssuntoInput) {
		return respostaService.devolveRetornaConsultaMenuAssunto(consultaMenuAssuntoInput);
	}
	
	
	@GetMapping("consulta-menu-servico")
	public ConsultaMenuServicoOutput retornaConsultaMenuServico(@RequestBody ConsultaMenuServicoInput consultaMenuServicoInput) {
		return respostaService.devolveRetornaConsultaMenuServico(consultaMenuServicoInput);
	}
	
	
	@GetMapping("consulta-thread-manifestacao")
	public ConsultaThreadManifestacaoOutput retornaConsultaThreadManifestacao(@RequestBody ConsultaThreadManifestacaoInput consultaThreadManifestacaoInput) {
		return respostaService.devolveRetornaConsultaThreadManifestacao(consultaThreadManifestacaoInput);
	}
	
//	@GetMapping("inserir-thread-manifestacao")
//	public ConsultaThreadManifestacaoOutput retornaConsultaThreadManifestacao(@RequestBody ConsultaThreadManifestacaoInput consultaThreadManifestacaoInput) {
//		return respostaService.devolveRetornaConsultaThreadManifestacao(consultaThreadManifestacaoInput);
//	}
	
	@GetMapping("registra-manifestacao")
	public RegistraManifestacaoOutput retornaRegistraManifestacao(@RequestBody RegistraManifestacaoInput registraManifestacaoInput) {
		return respostaService.devolveRegistraManifestacao(registraManifestacaoInput);
	}
	
}
