package br.unisales.ensalamento.controller;

import br.unisales.ensalamento.dao.DAO;
import br.unisales.ensalamento.models.Professor;

public class ProfessorController {
	public void saveProfessor(DAO dao, Professor novoProfessor) {
		dao.save(novoProfessor);
	}

	public Professor readById(DAO dao, int idQuery) {
		return dao.findById(idQuery);
	}
}
