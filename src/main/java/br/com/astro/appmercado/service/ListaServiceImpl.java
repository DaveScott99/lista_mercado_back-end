package br.com.astro.appmercado.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.astro.appmercado.model.ItemLista;
import br.com.astro.appmercado.model.Lista;
import br.com.astro.appmercado.repo.ListaRepo;

@Component
public class ListaServiceImpl implements IListaService {

	@Autowired
	private ListaRepo repo;
	
	@Override
	public Lista criarNovaLista(Lista nova) {
		return repo.save(nova);
	}

	@Override
	public void removerLista(Integer id) {
		repo.deleteById(id);
	}

	@Override
	public Lista fecharLista(Integer id) {
		Lista l = repo.findById(id).get();
		
		Double total = 0.0;
		
		for (ItemLista item : l.getItens()) {
			total += l.getValorTotal();
		}
		
		l.setValorTotal(total);
		l.setStatus(1); // Lista concluida
		
		return repo.save(l);
		
	}

	@Override
	public Lista buscarPeloId(Integer id) {
		return repo.findById(id).orElse(null);
		
	}

	@Override
	public List<Lista> buscarTodas() {
		return (List<Lista>) repo.findAll();
	}


}
