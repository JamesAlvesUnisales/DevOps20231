package tests.br.unisales.ensalamento.integracao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.unisales.ensalamento.controller.ProfessorController;
import br.unisales.ensalamento.dao.ProfessorDAO;
import br.unisales.ensalamento.models.Professor;

class ProfessorIntegracao {

	@Test
	void tes_integracaot() {
		Professor p = new Professor("James");
		
		ProfessorDAO dao = new ProfessorDAO();
		ProfessorController controller = new ProfessorController();
		
		controller.saveProfessor(dao, p);
		
		Professor result = controller.readById(dao, 1);
		
		assertEquals("James", result.getNome());
	}

}
