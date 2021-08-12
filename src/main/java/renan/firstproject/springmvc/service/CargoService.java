package renan.firstproject.springmvc.service;

import java.util.List;

import renan.firstproject.springmvc.domain.Cargo;

public interface CargoService {

	void salvar(Cargo cargo);
	
	void editar(Cargo cargo);
	
	void excluir(Long id);
	
	Cargo buscarPoId(Long id);
	
	List<Cargo> buscarTodos();
}
