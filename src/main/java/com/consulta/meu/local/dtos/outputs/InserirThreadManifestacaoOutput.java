package com.consulta.meu.local.dtos.outputs;

import lombok.Data;

@Data
//@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class InserirThreadManifestacaoOutput {

	private String Protocolo;
	
	private String sucesso;
	
	private String erro;
}
