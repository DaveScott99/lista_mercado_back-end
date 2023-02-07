package br.com.astro.appmercado.repo;

import org.springframework.data.repository.CrudRepository;

import br.com.astro.appmercado.model.Produto;

public interface ProdutoRepo extends CrudRepository<Produto, Integer> {

}
