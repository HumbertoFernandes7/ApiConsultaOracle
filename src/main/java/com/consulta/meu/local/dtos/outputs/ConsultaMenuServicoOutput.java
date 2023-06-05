package com.consulta.meu.local.dtos.outputs;

import java.util.List;

import lombok.Data;

@Data
public class ConsultaMenuServicoOutput {

	private String isValid;
	
	private String msgErro;
	
	private List<DataConsultaMenuServicoOutput> data;
	
}
