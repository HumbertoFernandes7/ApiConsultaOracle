package com.consulta.meu.local.dtos.outputs;

import java.sql.Date;

import lombok.Data;

@Data
public class ReturnOutput {

	private String fileName;
	
	private String base64;
	
	private Date DataCriacao;
	
}
