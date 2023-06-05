package com.consulta.meu.local.dtos.inputs;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ConsultaManifestacaoCpfInput {

	@NotBlank(message = "CPF é Obrigatório")
	private String cpf;
}
