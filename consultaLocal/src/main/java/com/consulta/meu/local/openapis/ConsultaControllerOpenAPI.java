package com.consulta.meu.local.openapis;

import com.consulta.meu.local.dtos.outputs.RespostaOutput;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Consulta")
public interface ConsultaControllerOpenAPI {

	@Operation(summary = "Busca as informações", description = "Realiza a busca das informações necessárias")
	public RespostaOutput devolveResposta();
}
