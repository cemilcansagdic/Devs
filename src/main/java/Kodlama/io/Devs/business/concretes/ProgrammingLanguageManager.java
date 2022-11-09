package Kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService{

	private ProgrammingLanguageRepository repository;
	
	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository rep) {
		repository = rep;
	}

	@Override
	public void add(ProgrammingLanguage language) {
		// TODO Auto-generated method stub
		boolean hasDuplicate = false;
		for (ProgrammingLanguage programmingLanguage : repository.findAll()) {
			if (programmingLanguage.getName().equals(language.getName())) {
				hasDuplicate = true;
				return;
			}
		}
		
		if (language.getName().length() == 0) {
			return;
		}
		
		repository.save(language);
	}

	@Override
	public void update(ProgrammingLanguage language) {
		boolean hasDuplicate = false;
		for (ProgrammingLanguage programmingLanguage : repository.findAll()) {
			if (programmingLanguage.getName().equals(language.getName())) {
				hasDuplicate = true;
				return;
			}
		}
		
		if (language.getName().length() == 0) {
			return;
		}
		
		ProgrammingLanguage l =repository.getById(language.getId());
		
		l = language;
		repository.save(l);
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public ProgrammingLanguage getById(int id) {
		// TODO Auto-generated method stub
		return repository.getById(id);
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	
	
}
