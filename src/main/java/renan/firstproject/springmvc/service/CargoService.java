package renan.firstproject.springmvc.service;

import java.util.List;

import renan.firstproject.springmvc.domain.Cargo;
import renan.firstproject.springmvc.util.PaginacaoUtil;

public interface CargoService {

	void salvar(Cargo cargo);
	
	void editar(Cargo cargo);
	
	void excluir(Long id);
	
	Cargo buscarPorId(Long id);
	
	List<Cargo> buscarTodos();

	boolean cargoTemFuncionarios(Long id);
	
	PaginacaoUtil<Cargo> buscaPorPagina(int pagina);
}
