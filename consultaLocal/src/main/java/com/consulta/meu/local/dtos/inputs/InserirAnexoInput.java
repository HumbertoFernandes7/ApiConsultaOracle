package com.consulta.meu.local.dtos.inputs;

import java.util.List;

import com.consulta.meu.local.dtos.outputs.ArquivosOutput;

import lombok.Data;

@Data
public class InserirAnexoInput {

	private int idProtocolo;
	
	private List<ArquivosOutput> arquivos;
	
}
