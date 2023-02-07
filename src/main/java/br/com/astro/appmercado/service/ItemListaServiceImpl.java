package br.com.astro.appmercado.service;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.astro.appmercado.model.ItemLista;
import br.com.astro.appmercado.repo.ItemListaRepo;

public class ItemListaServiceImpl implements IItemListaService {

	@Autowired
	private ItemListaRepo repo;
	
	@Override
	public ItemLista inserirItem(ItemLista novo) {
		return repo.save(novo);
	}

	@Override
	public ItemLista alterarItem(ItemLista item) {
		return repo.save(item);
	}

	@Override
	public void removerItem(Integer NumSeq) {
		repo.deleteById(NumSeq);
	}

}
