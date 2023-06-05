package com.consulta.meu.local.dtos.outputs;

import java.util.List;

import lombok.Data;

@Data
public class ConsultaAnexoOutput {

	private String msgErro;
	
	private List<ReturnOutput> Return;
}
