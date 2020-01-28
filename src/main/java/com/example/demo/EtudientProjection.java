package com.example.demo;

import org.springframework.data.rest.core.config.Projection;

@Projection(name="p1",types= {Etudient.class})
public interface EtudientProjection {
	
	public String getNom();
	public Formation getFormation();

}
