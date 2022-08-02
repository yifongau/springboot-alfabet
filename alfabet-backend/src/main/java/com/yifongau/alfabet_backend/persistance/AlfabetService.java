package com.yifongau.alfabet_backend.persistance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yifongau.alfabet_backend.domain.Categorie;
import com.yifongau.alfabet_backend.domain.Lemma;
import com.yifongau.alfabet_backend.domain.Letter;

@Service
public class AlfabetService {
	
	@Autowired
	LemmaRepo lemmarepo;
	@Autowired
	LetterRepo letterrepo;
	@Autowired
	CategorieRepo categorierepo;
	
	
	// Lemmafuncties
	public void newLemma(Lemma l) {
		Lemma lemma = l;
		lemmarepo.save(lemma);
	}
	
	public Iterable<Lemma> allLemma() {
		return lemmarepo.findAll();
	}
	
	public void newCategorie(Categorie c) {
		Categorie categorie = c;
		categorierepo.save(categorie);
	}
	
	public Iterable<Categorie> allCategorie() {
		return categorierepo.findAll();
	}
	
	public void newLetter(Letter l) {
		Letter letter = l;
		letterrepo.save(letter);
	}
	
	public Iterable<Letter> allLetter() {
		return letterrepo.findAll();
	}
	
	

}
