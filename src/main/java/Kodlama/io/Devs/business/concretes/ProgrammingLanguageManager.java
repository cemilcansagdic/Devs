package Kodlama.io.Devs.business.concretes;

import java.util.ArrayList;

import Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public class ProgrammingLanguageManager implements ProgrammingLanguageService{

	private ProgrammingLanguageRepository repository;
	
	
	public ProgrammingLanguageManager(ProgrammingLanguageRepository rep) {
		repository = rep;
	}

	@Override
	public void add(ProgrammingLanguage language) {
		// TODO Auto-generated method stub
		boolean hasDuplicate = false;
		for (ProgrammingLanguage programmingLanguage : repository.getAll()) {
			if (programmingLanguage.getName().equals(language.getName())) {
				hasDuplicate = true;
				return;
			}
		}
		
		if (language.getName().length() == 0) {
			return;
		}
		
		repository.add(language);
	}

	@Override
	public void update(ProgrammingLanguage language) {
		boolean hasDuplicate = false;
		for (ProgrammingLanguage programmingLanguage : repository.getAll()) {
			if (programmingLanguage.getName().equals(language.getName())) {
				hasDuplicate = true;
				return;
			}
		}
		
		if (language.getName().length() == 0) {
			return;
		}
		
		repository.update(language);
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		repository.delete(id);
	}

	@Override
	public ProgrammingLanguage getById(int id) {
		// TODO Auto-generated method stub
		return repository.getById(id);
	}

	@Override
	public ArrayList<ProgrammingLanguage> getAll() {
		// TODO Auto-generated method stub
		return repository.getAll();
	}

	
	
}
