package test.models;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.unisales.jogo21.models.*;

class CartasTest {

	@Test
	void PesoDaCartaCorreto() {
		/* Nypes C V E P
		 * Faces As - 10 QJK
		 * Pesos 1	10
		 * ----- Valor diferente de AS---- 
		 * */
		Baralho baralho = new Baralho();
		Carta carta = baralho.obterCarta("C", "10");
		assertEquals(carta.getPeso(), 10);
	}
	
	

}
