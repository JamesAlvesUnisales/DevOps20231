package br.unisales.ensalamento.models;

public class MateriaModel {
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		// validacao ante de salvar.
		this.nome = nome;
	}

}
