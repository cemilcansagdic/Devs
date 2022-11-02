package Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;

import Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository{

	private ArrayList<ProgrammingLanguage> Languages;

	
	public InMemoryProgrammingLanguageRepository(ArrayList<ProgrammingLanguage> languages) {
		
		Languages = languages;
	}

	@Override
	public void add(ProgrammingLanguage language) {
		// TODO Auto-generated method stub
		Languages.add(language);
		
	}

	@Override
	public void update(ProgrammingLanguage language) {
		// TODO Auto-generated method stub
		for(int i = 0; i< Languages.size(); i++) {
			if (Languages.get(i).getId() == language.getId()) {
				Languages.set(i, language);
			}
		}
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		for(int i = 0; i< Languages.size(); i++) {
			if (Languages.get(i).getId() ==id) {
				Languages.remove(i);
			}
		}
	}

	@Override
	public ProgrammingLanguage getById(int id) {
		// TODO Auto-generated method stub
		for (ProgrammingLanguage programmingLanguage : Languages) {
			if (programmingLanguage.getId() == id) {
				return programmingLanguage;
			}
		}
		return null;
	}

	@Override
	public ArrayList<ProgrammingLanguage> getAll() {
		// TODO Auto-generated method stub
		return Languages;
	}

}
