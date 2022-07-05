package com.example.testingweb.produto;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.example.testingweb.builders.ProdutoBuilder;

public class ProdutoTest {

	private static final double VALOR_NEGATIVO = -1d;

	@Test
	public void nao_deve_permitir_informar_valor_menor_que_zero() throws Exception {
		assertThrows(ValorInvalidoException.class, ()-> {
			new Produto("Fogão 4 bocas", VALOR_NEGATIVO);
		});
	}

	@Test
	public void deve_conter_um_valor_unitario_positivo() throws ValorInvalidoException{
		//Arrenge
		double valorUnitarioEsperado = 10.0;

		//Act
		Produto produto = new ProdutoBuilder()
		.comValorUnitario(valorUnitarioEsperado)
		.construir();

		//Assert
		Assertions.assertEquals(valorUnitarioEsperado, produto.getValorUnitario());

	}

	@Test
	public void deve_conter_uma_conter_uma_descricao() throws ValorInvalidoException{
		//Arrenge
		String descricaoEsperada = "Fogão 4 boas";

		//Act
		Produto produto = new ProdutoBuilder()
		.comDescricao(descricaoEsperada)
		.construir();

		//Assert
		Assertions.assertEquals(descricaoEsperada, produto.getDescricao());

	}
}
