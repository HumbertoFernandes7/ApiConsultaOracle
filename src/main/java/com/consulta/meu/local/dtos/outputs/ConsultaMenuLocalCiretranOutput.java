package com.consulta.meu.local.dtos.outputs;

import java.util.List;

import lombok.Data;

@Data
public class ConsultaMenuLocalCiretranOutput {

	//private Number id;
	
	private String Local;

	private List<testeOutput> array;
}
