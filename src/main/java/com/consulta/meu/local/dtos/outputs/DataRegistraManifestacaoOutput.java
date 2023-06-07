package com.consulta.meu.local.dtos.outputs;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import lombok.Data;

@Data
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class DataRegistraManifestacaoOutput {

	private String refNo;

	private String sucesso;

	private String erro;
}
