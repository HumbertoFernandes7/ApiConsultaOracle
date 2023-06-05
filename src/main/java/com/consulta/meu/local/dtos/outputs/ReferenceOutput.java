package com.consulta.meu.local.dtos.outputs;

import lombok.Data;

@Data
public class ReferenceOutput {

	private int id;
	
	private String Protocolo;
	
	private String DataCriacao;
	
	private String DataResposta;
	
	private String DataEncerramento;
	
	private String Assunto;
	
	private int IdAssunto;
	
	private String Servico;
	
	private int IdServico;
	
	private String Status;
	
	private String Fila;
	
	private int IdFila;
	
	private String TipoManifestacao;
	
	private String CanalEntrada;
	
	private String Sigiloso;
	
	private String anexoObrigatorio;
}
