package br.com.brittus.loja.entity;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.brittus.loja.mb.ProdutoBean;

public class ProdutoBeanTest {
	
	@Test
	public void deveAdicionarProdutoEmLista() {
		
		ProdutoBean bean = new ProdutoBean();
		
		Produto produto = new Produto();
		produto.setNome("bala");
		
		bean.setProduto(produto);
		
		assertEquals("bala", bean.getProduto().getNome());
		
		bean.adicionaProduto();
		
		assertNull(bean.getProduto().getNome());
		assertEquals(1, bean.getProdutos().size());
		assertEquals("bala", bean.getProdutos().get(0).getNome());
		
	}
	
}
