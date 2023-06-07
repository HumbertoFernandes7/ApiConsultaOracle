package com.consulta.meu.local.dtos.outputs;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

import lombok.Data;

@Data
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class ConsultaMenuPostoPoupaTempoOutput {

	private Number id;
	
	private String Local;
}
