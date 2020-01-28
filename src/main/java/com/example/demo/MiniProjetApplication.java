package com.example.demo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class MiniProjetApplication implements CommandLineRunner {
	
	@Autowired
	private EtudientRepository etudientrepository;

	@Autowired
	private FormationRepository formationrepository;
	
	@Autowired
	private RepositoryRestConfiguration repositoryresteconfiguration;
	
	public static void main(String[] args) {
		SpringApplication.run(MiniProjetApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		repositoryresteconfiguration.exposeIdsFor(Formation.class,Etudient.class);
		

		/*Formation f1=formationrepository.save(new Formation(null,"php",30,null));
		Formation f2=formationrepository.save(new Formation(null,"java",30,null));
		Formation f3=formationrepository.save(new Formation(null,"angular",30,null));
		
		
		Etudient e=etudientrepository.save(new Etudient(null,"afif","jabnoun",new Date(),f1));
		Etudient e1=etudientrepository.save(new Etudient(null,"amel","jabnoun",new Date(),f2));
		Etudient e2=etudientrepository.save(new Etudient(null,"yassine","jabnoun",new Date(),f3));
*/
	}

}
