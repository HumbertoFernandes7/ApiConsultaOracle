package com.consulta.meu.local.dtos.outputs;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import lombok.Data;

@Data
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class RetornaProdutoOutput {

	private String isValid;
	
	private String msgErro;
	
	private String idProduto;
	
	private String Produto;
}
