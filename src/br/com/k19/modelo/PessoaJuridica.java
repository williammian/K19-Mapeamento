package br.com.k19.modelo;

import javax.persistence.Entity;

@Entity
public class PessoaJuridica extends Pessoa{

	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
}
