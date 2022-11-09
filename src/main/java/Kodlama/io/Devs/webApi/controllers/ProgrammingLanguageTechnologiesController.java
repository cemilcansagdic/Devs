package Kodlama.io.Devs.webApi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.business.abstracts.ProgrammingLanguageTechnologyService;
import Kodlama.io.Devs.business.concretes.ProgrammingLanguageManager;
import Kodlama.io.Devs.business.concretes.ProgrammingLanguageTechnologyManager;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguageTechnology;

@RestController
@RequestMapping("/api/programminglanguagetechnologies")
public class ProgrammingLanguageTechnologiesController{

	private ProgrammingLanguageTechnologyManager manager;

	@Autowired
	public ProgrammingLanguageTechnologiesController(ProgrammingLanguageTechnologyManager manager) {
		this.manager = manager;
	}
	
	@PostMapping("/add")
	public void add(int languageid, ProgrammingLanguageTechnology technology) {
		// TODO Auto-generated method stub
		manager.add(technology);
	}

	public void update() {
		// TODO Auto-generated method stub
		
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}
	
	

}
