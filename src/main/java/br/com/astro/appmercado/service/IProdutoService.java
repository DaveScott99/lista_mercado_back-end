package br.com.astro.appmercado.service;

import java.util.List;

import br.com.astro.appmercado.model.Produto;

public interface IProdutoService {

	public Produto criarNovoProduto(Produto prod);
	public Produto alterarProduto(Produto prod);
	public List<Produto> listarTodos();
	public List<Produto> buscarproPalavraChave(String key);
	public Produto buscarPorId(Integer id);
	
}