package Kodlama.io.Devs.business.abstracts;

import java.util.ArrayList;

import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageService {

	void add(ProgrammingLanguage language );
	
	void update(ProgrammingLanguage language);
	
	void delete(int id);
	
	ProgrammingLanguage getById(int id);
	
	ArrayList<ProgrammingLanguage> getAll();
	
}
