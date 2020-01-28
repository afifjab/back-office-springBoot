package com.example.demo;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface EtudientRepository extends JpaRepository<Etudient,Long> {
	
	//le requette soit en respecte le norm findBy ou bien par l'annotation de @query
	

}
