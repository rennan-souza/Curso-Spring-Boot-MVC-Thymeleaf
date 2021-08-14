package renan.firstproject.springmvc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import renan.firstproject.springmvc.domain.Funcionario;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao {
	
	public List<Funcionario> findByNome(String nome) {
		return createQuery("SELECT f FROM Funcionario f WHERE f.nome like concat('%', ?1, '%') ", nome);
	}
}
