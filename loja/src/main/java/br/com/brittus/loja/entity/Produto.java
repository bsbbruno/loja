package br.com.brittus.loja.entity;

import java.io.Serializable;

public class Produto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String nome;
	
	public Produto(String nome) {
		this.nome = nome;
	}
	
	public Produto() {
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
