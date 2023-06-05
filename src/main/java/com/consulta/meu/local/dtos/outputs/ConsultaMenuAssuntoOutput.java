package com.consulta.meu.local.dtos.outputs;

import java.util.List;

import lombok.Data;

@Data
public class ConsultaMenuAssuntoOutput {

	private String isValid;
	
	private String msgErro;
	
	private List<DataMenuAssuntoOutput>data;
}