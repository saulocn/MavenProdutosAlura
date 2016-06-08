package br.com.caelum.maven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.alura.maven.Produto;

public class ProdutoTest {

	@Test
	public void verificaPrecoComImposto() {
		Produto bala = new Produto("juquinha", 0.10);
		assertEquals(0.11, bala.getPrecoComImposto(), 0.00001);
	}
}
