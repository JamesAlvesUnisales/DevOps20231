package br.unisales.jogo21.models;

public class Carta {

	private String nype;
	private String face;
	private int peso;

	public Carta(String nype, String face, int peso) {
		this.nype = nype;
		this.face = face;
		this.peso = peso;
	}

	public String getNype() {
		return nype;
	}

	public void setNype(String nype) {
		this.nype = nype;
	}

	public String getFace() {
		return face;
	}

	public void setFace(String face) {
		this.face = face;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Carta [nype=" + nype + ", face=" + face + ", peso=" + peso + "]";
	}
	

}
