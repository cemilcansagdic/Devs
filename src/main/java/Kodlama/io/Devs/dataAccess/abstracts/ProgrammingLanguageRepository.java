package Kodlama.io.Devs.dataAccess.abstracts;

import java.util.ArrayList;

import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageRepository {

	void add(ProgrammingLanguage language );
	
	void update(ProgrammingLanguage language);
	
	void delete(int id);
	
	ProgrammingLanguage getById(int id);
	
	ArrayList<ProgrammingLanguage> getAll();
	
}
