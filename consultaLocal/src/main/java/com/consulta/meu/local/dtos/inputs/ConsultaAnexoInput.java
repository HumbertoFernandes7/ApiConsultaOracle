package com.consulta.meu.local.dtos.inputs;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class ConsultaAnexoInput {

	@NotBlank(message = "idProtocolo é obrigatório")
	private String idProtocolo;
}
