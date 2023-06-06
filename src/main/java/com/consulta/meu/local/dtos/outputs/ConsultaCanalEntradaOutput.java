package com.consulta.meu.local.dtos.outputs;

import java.util.List;

import lombok.Data;

@Data
public class ConsultaCanalEntradaOutput {

	private Boolean isValid;
	
	private String msgErro;
	
	private List<DataConsultaCanalEntradaOutput> data;
}
