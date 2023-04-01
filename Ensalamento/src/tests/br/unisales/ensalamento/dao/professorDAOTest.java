package tests.br.unisales.ensalamento.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.unisales.ensalamento.dao.ProfessorDAO;
import br.unisales.ensalamento.models.Professor;

class professorDAOTest {

	@Test
	void save_professor() {
		Professor p = new Professor("James");
		ProfessorDAO dao = new ProfessorDAO();
		
		p = dao.save(p);
		
		assertEquals(1,  p.getId());
	}
	
	@Test
	void find_professor_by_id() {
		Professor p1 = new Professor("James");
		Professor p2 = new Professor("Marcelo");
		
		ProfessorDAO dao = new ProfessorDAO();
		
		dao.save(p1);
		dao.save(p2);
		
		Professor result = dao.findById(3);
		assertEquals("Marcelo",  result.getNome());
	}

}
