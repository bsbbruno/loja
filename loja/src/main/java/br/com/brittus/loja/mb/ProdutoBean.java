package br.com.brittus.loja.mb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import com.google.common.base.Strings;

import br.com.brittus.loja.entity.Produto;

@Named
@ViewScoped
public class ProdutoBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Produto produto = new Produto();
	private List<Produto> produtos = new ArrayList<Produto>();

	public void adicionaProduto() {
		String nome = produto.getNome();
		
		if (!Strings.isNullOrEmpty(nome)) {
			produtos.add(produto);
		}

		produto = new Produto();
	}

	public Produto getProduto() {
		return produto;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
}
