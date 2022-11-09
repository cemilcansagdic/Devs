package Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.entities.concretes.ProgrammingLanguageTechnology;

public interface ProgrammingLanguageTechnologyService {

	void add(ProgrammingLanguageTechnology technology);
	
	void update();
	
	void delete(int id);
	
	List<ProgrammingLanguageTechnology> getAll();

	
}
