package br.com.astro.appmercado.service;

import br.com.astro.appmercado.model.ItemLista;

public interface IItemListaService {
	
	public ItemLista inserirItem(ItemLista novo);
	public ItemLista alterarItem(ItemLista item);
	public void removerItem(Integer NumSeq);
	
}
