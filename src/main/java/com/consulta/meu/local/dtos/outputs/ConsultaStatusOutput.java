package com.consulta.meu.local.dtos.outputs;

import java.util.List;

import lombok.Data;

@Data
public class ConsultaStatusOutput {

	private Boolean isValid;
	
	private String msgErro;
	
	private List<DataConsultaStatusOutput> data;
}
