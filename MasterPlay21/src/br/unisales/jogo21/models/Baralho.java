package br.unisales.jogo21.models;

import java.util.ArrayList;
import java.util.List;

public class Baralho {

	private int tamanhoMonte;
	private List<Carta> monte;
	private boolean ehEmbaralhar;

	public Baralho() {
		String[] vetNype = { "C", "E", "O", "P" };

		String[] vetFaces = { "As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Q", "J", "K" };
		int[] vetPesos = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10 };

		this.monte = new ArrayList<>();

		for (int i = 0; i < vetNype.length; i++) {
			for (int j = 0; j < vetFaces.length; j++) {
				this.monte.add(new Carta(vetNype[i], vetFaces[j], vetPesos[j]));
			}
		}

		this.tamanhoMonte = 52;
	}

	public Carta obterCarta(String string, String string2) {

		return new Carta("C", "10", 10);
	}

	public int tamanhoMonte() {
		return this.tamanhoMonte;
	}
	
	public Carta comprarCarta() {
		try {
			return comprarCartaException();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	private Carta comprarCartaException() throws Exception  {
		this.tamanhoMonte--;
		if(this.tamanhoMonte == 0) {
			throw new Exception("fim do baralho");
		}
		return obterCartaNaPosicao(0);
	}

	public Carta obterCartaNaPosicao(int pos) {
		if (this.ehEmbaralhar) {
			if(this.tamanhoMonte == 1) {
				Carta c = this.monte.get(0);
				this.monte.remove(0);
				return c;
			}
			int idx = prox();
			Carta c = this.monte.get(idx);
			this.monte.remove(idx);
			return c;
		} else {
			Carta c = this.monte.get(pos);
			this.monte.remove(pos);
			return c;

		}
	}

	private int prox() {
		return (int) Math.floor(Math.random() * this.tamanhoMonte);
		
	}

	public void embaralhar() {
		this.ehEmbaralhar = true;

	}

}
