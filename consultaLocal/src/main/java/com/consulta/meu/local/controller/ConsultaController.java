package com.consulta.meu.local.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.consulta.meu.local.configs.ControllerConfig;
import com.consulta.meu.local.dtos.inputs.ConsultaAnexoInput;
import com.consulta.meu.local.dtos.outputs.ConsultaAnexoOutput;
import com.consulta.meu.local.dtos.outputs.RespostaOutput;
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
		return respostaService.devolveRespostaTeste(consultaAnexoInput);
	}
}
