package com.yifongau.alfabet_backend.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Categorie {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	long id;
	String naam;
	
	@OneToMany
	List<Letter> lemmas;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public List<Letter> getLemmas() {
		return lemmas;
	}

	public void setLemmas(List<Letter> lemmas) {
		this.lemmas = lemmas;
	}

	

	
}
