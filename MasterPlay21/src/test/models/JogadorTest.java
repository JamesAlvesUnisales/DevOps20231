package test.models;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;

import org.junit.jupiter.api.Test;

import br.unisales.jogo21.models.Baralho;
import br.unisales.jogo21.models.Carta;
import br.unisales.jogo21.models.Jogador;

class JogadorTest {

	@Test
	void sabeComprarAprimeiraCartaOrdenada() {
		Baralho b = new Baralho();
		Jogador j = new Jogador();
		j.comprarCarta(b);

		assertEquals(1, j.contarPontos());
	}
	
	
	@Test
	void sabeComprarAteMaior21Ordenada() {
		Baralho b = new Baralho();
		Jogador j = new Jogador();
		b.obterCartaNaPosicao(0);
		b.obterCartaNaPosicao(1);
		j.comprarCartas(b);
		assertEquals(24, j.contarPontos());
	}
	
	@Test
	void sabeComprarAte21() {
		Baralho b = new Baralho();
		Jogador j = new Jogador();
		j.comprarCartas(b);
		assertEquals(21, j.contarPontos());
	}
	
	
	@Test
	void sabeComprarAte19() {
		Baralho b = new Baralho();
		Jogador j = new Jogador();
		b.obterCartaNaPosicao(1);
		j.comprarCartas(b);
		assertEquals(19, j.contarPontos());
	}
	
	@Test
	void sabeComprarAte20() {
		Baralho b = new Baralho();
		Jogador j = new Jogador();
		b.obterCartaNaPosicao(0);
		j.comprarCartas(b);
		assertEquals(20, j.contarPontos());
	}
	
	

}
