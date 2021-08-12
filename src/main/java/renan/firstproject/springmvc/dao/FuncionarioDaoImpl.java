package renan.firstproject.springmvc.dao;

import org.springframework.stereotype.Repository;

import renan.firstproject.springmvc.domain.Funcionario;

@Repository
public class FuncionarioDaoImpl extends AbstractDao<Funcionario, Long> implements FuncionarioDao {

}
