package renan.firstproject.springmvc.service;

import java.util.List;

import renan.firstproject.springmvc.domain.Funcionario;

public interface FuncionarioService {
	
	void salvar(Funcionario funcionario);

	void editar(Funcionario funcionario);

	void excluir(Long id);

	Funcionario buscarPoId(Long id);

	List<Funcionario> buscarTodos();
}
