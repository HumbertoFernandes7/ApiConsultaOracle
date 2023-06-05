package com.consulta.meu.local.dtos.inputs;

import java.util.List;

import com.consulta.meu.local.dtos.outputs.ChassisOutput;
import com.consulta.meu.local.dtos.outputs.ContatoOutput;
import com.consulta.meu.local.dtos.outputs.DiaSemanaOutput;
import com.consulta.meu.local.dtos.outputs.PhonesOutput;
import com.consulta.meu.local.dtos.outputs.PlacaRenavamOutput;

import lombok.Data;

@Data
public class RegistraManifestacaoInput {

	private String canalEntrada;
	
	private String Interface;
	
	private String servico;
	
	private String tipoManifestacao;
	
	private String assunto;
	
	private String produto;
	
	private String pis;
	
	private String localAtendido;
	
	private String localAtendimento;
	
	private String descricao;
	
	private DiaSemanaOutput diaSemana;

	private String periodo;
	
	private ContatoOutput contato;
	
	private List<PhonesOutput> phones;
	
	private String local_nascimento;
	
	private String nomePai;
	
	private String cep;
	
	private String logradouro;
	
	private String complemento;
	
	private String numero;
	
	private String bairro;
	
	private String cidade;
	
	private String uf;
	
	private String dataNascimento;
	
	private String nomeMae;
	
	private String rgDetran;
	
	private String cnhDoc;
	
	private String cnpjDoc;
	
	private String RazaoSocialDoc;
	
	private List<PlacaRenavamOutput> placaRenavam;
	
	private List<ChassisOutput> chassis;
	
	private String cidadeCiretran;
}
