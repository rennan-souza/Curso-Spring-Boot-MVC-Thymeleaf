package renan.firstproject.springmvc.service;

import java.util.List;

import renan.firstproject.springmvc.domain.Departamento;

public interface DepartamentoService {

	void salvar(Departamento departamento);

	void editar(Departamento departamento);

	void excluir(Long id);

	Departamento buscarPoId(Long id);

	List<Departamento> buscarTodos();

	boolean departamentoTemCargos(Long id);
}
