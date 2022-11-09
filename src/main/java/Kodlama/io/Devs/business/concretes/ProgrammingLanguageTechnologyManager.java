package Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.business.abstracts.ProgrammingLanguageTechnologyService;
import Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageTechnologyRepository;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguageTechnology;

@Service
public class ProgrammingLanguageTechnologyManager implements ProgrammingLanguageTechnologyService{

	private ProgrammingLanguageTechnologyRepository repository;
	
	@Autowired
	public ProgrammingLanguageTechnologyManager(ProgrammingLanguageTechnologyRepository technologyRepository) {
		this.repository = technologyRepository;
	}

	@Override
	public void add(ProgrammingLanguageTechnology technology) {
		// TODO Auto-generated method stub
		//Burası değişmeli
		repository.save(technology);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		//Yazılacak
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ProgrammingLanguageTechnology> getAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
	
	

	
}
