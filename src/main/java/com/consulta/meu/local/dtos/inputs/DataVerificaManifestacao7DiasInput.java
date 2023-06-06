package com.consulta.meu.local.dtos.inputs;

import lombok.Data;

@Data
public class DataVerificaManifestacao7DiasInput {

	private String cpf;
	
	private String servicoId;
	
	private String product;
	
	private String placaveiculo;
	
	private String renavam;
	
	private String chassi;
}
