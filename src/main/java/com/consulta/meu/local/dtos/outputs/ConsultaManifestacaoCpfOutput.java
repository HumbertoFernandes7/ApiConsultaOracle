package com.consulta.meu.local.dtos.outputs;

import java.util.List;

import lombok.Data;

@Data
public class ConsultaManifestacaoCpfOutput {

	private String isValid;
	
	private String msgErro;
	
	private List<ReferenceOutput> Reference;
}
