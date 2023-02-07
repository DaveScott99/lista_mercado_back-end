package br.com.astro.appmercado.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.astro.appmercado.model.Produto;
import br.com.astro.appmercado.repo.ProdutoRepo;

@Component
public class ProdutoServiceImpl implements IProdutoService {

	@Autowired
	private ProdutoRepo repo;
	
	@Override
	public Produto criarNovoProduto(Produto prod) {
		return repo.save(prod);
	}

	@Override
	public Produto alterarProduto(Produto prod) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produto> listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produto> buscarproPalavraChave(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produto buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
