package com.consulta.meu.local.dtos.outputs;

import lombok.Data;

@Data
public class ReturnVerificaManifestacao7DiasOutput {

	private String identificador;

	private String isValid;

	private String msgErro;
}
