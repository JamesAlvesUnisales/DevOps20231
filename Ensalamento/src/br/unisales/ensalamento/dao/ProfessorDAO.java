package br.unisales.ensalamento.dao;

import java.io.IOException;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.FileNotFoundException;
import br.unisales.ensalamento.models.Professor;
import java.io.FileWriter;

public class ProfessorDAO implements DAO {
	private static final String FILE_NAME = "Professor.txt";
	private List<Professor> professores;

	public ProfessorDAO() {
		super();
		create_file_if_not_exists();
		load_list();
	}

	private void create_file_if_not_exists() {
		try {
			File myObj = new File(FILE_NAME);
			if (myObj.createNewFile()) {
				System.out.println("File created: " + myObj.getName());
			} else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

	private void load_list() {
		professores = new ArrayList<>();
		try {
			File myObj = new File(FILE_NAME);
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				String[] vetAux = data.split(";");
				System.out.println(data);
				Professor p = new Professor(vetAux[0], Integer.parseInt(vetAux[1]));
				professores.add(p);
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

	public Professor save(Professor p) {
		int newId = this.professores.size() + 1;
		try {
			FileWriter myWriter = new FileWriter(FILE_NAME, true);
			p.setId(newId);
			this.professores.add(p);
			myWriter.write(p.toCSV() + "\n");
			myWriter.close();
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		return p;
	}

	public Professor findById(int idQuery) {

		for (Professor professor : this.professores) {
			if (professor.getId() == idQuery) {
				return professor;
			}
		}
		return null;
	}

}
