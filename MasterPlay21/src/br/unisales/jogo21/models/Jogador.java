package br.unisales.jogo21.models;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Jogador {

	List<Carta> cartas;

	public Jogador() {
		super();
		cartas = new ArrayList<>();
	}

	public void comprarCarta(Baralho b) {
		Carta c = b.comprarCarta();
		cartas.add(c);
	}

	public int contarPontos() {
		int acc = 0;
		for (Carta carta : cartas) {
			acc += carta.getPeso(); // acc = acc + carta.getPeso();

		}
		return acc;
	}

	public void comprarCartas(Baralho b) {
		do {
			comprarCarta(b);
		} while (menor21() && menor19() );
		
	}

	private boolean menor19() {
		return contarPontos() < 19;
	}

	private boolean menor21() {
		return contarPontos() < 21;
	}

}
