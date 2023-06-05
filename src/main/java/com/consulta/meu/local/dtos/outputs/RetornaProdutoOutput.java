package com.consulta.meu.local.dtos.outputs;

import lombok.Data;

@Data
public class RetornaProdutoOutput {

	private String isValid;
	
	private String msgErro;
	
	private String Produto;
	
	private Long idProduto;
}
