package br.unisales.ensalamento.models;

public class Professor {
private String nome;
private int id;
public Professor(String nome) {
	this.nome = nome;
}
public Professor(String nome, int id) {
	this.nome = nome;
	this.id = id;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
@Override
public String toString() {
	return "Professor [nome=" + nome + ", id=" + id + "]";
}

public String toCSV() {
	return this.nome + ";" + this.id;
}

}
