package renan.firstproject.springmvc.dao;

import java.util.List;

import renan.firstproject.springmvc.domain.Cargo;
import renan.firstproject.springmvc.util.PaginacaoUtil;

public interface CargoDao {
	
	void save(Cargo cargo);
	
	void update(Cargo cargo);
	
	void delete(Long id);
	
	Cargo findById(Long id);
	
	List<Cargo> findAll();
	
	PaginacaoUtil<Cargo> buscaPaginada(int pagina, String direcao);
}
