package br.edu.cassio.models;

import java.io.Serializable;

import br.edu.cassio.Persistencia;

public class Pessoa  extends Persistencia implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	
	private Integer id;
	private String nome;
	private String cpf;
	private String rg;
	private String endereco;
	
	public Pessoa() {}

	public Pessoa(String nome, String cpf, String rg, String endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.endereco = endereco;
	}
	
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return this.nome + ";" + this.cpf + ";" + this.rg + ";" + this.endereco;
	}

}
