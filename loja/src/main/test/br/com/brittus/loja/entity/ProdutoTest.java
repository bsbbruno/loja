package br.com.brittus.loja.entity;

import org.junit.Test;
import static org.junit.Assert.*;

public class ProdutoTest {
	
	@Test
	public void deveSetarVariaveis() {
		Produto produto = new Produto("bala");
		assertEquals("bala", produto.getNome());
	}
	
	@Test
	public void deveSetarNovoObjetoConstrutorPadrao() {
		Produto produto = new Produto();
		produto.setNome("bala");
		assertEquals("bala", produto.getNome());
	}
	
}
