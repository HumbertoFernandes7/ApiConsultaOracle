package com.consulta.meu.local.dtos.outputs;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import lombok.Data;

@Data
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
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
