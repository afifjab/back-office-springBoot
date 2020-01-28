package com.example.demo;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
public class Formation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private int duree;
	
	@OneToMany(mappedBy = "formation")
	private Collection<Etudient> etudients;
	
	public Formation() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public Collection<Etudient> getEtudients() {
		return etudients;
	}

	public void setEtudients(Collection<Etudient> etudients) {
		this.etudients = etudients;
	}

	public Formation(Long id, String nom, int duree, Collection<Etudient> etudients) {
		super();
		this.id = id;
		this.nom = nom;
		this.duree = duree;
		this.etudients = etudients;
	}
	
}
