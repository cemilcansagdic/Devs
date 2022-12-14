package Kodlama.io.Devs.entities.concretes;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Languages")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProgrammingLanguage {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	@OneToMany(mappedBy = "language")
	private Set<ProgrammingLanguageTechnology> technologies;	
	
	
}
