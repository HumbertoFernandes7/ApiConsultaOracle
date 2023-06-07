package com.consulta.meu.local.dtos.outputs;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import lombok.Data;

@Data
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class RegistraManifestacaoOutput {

	private List<DataRegistraManifestacaoOutput> Manifestacao;

}
