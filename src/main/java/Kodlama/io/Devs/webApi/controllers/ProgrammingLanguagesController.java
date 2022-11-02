package Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.business.concretes.ProgrammingLanguageManager;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@RestController
@RequestMapping("/api/programminglanguages")
public class ProgrammingLanguagesController {

	private ProgrammingLanguageManager manager;

	@Autowired
	public ProgrammingLanguagesController(ProgrammingLanguageManager manager) {
		this.manager = manager;
	}
	
	@GetMapping("/getall")
	public List<ProgrammingLanguage> getAll() {
		return manager.getAll();
	}

	@GetMapping("/{id}")
	public ProgrammingLanguage getById(@PathVariable() int id) {
		return manager.getById(id);
	}

	@PostMapping("/add")
	public void addLanguage(@RequestBody ProgrammingLanguage language) {
		manager.add(language);
	}

	@PutMapping("/update")
	public void update(@RequestBody ProgrammingLanguage language){
		manager.update(language);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable(name = "id") int id) throws Exception {
		manager.delete(id);
	}
	
	
	
	
	
	
}
