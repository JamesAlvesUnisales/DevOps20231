package br.unisales.ensalamento.dao;

import br.unisales.ensalamento.models.Professor;

public interface DAO {

	Professor save(Professor professor);

	Professor findById(int idQuery);

}
