package com.yifongau.alfabet_backend.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yifongau.alfabet_backend.domain.Categorie;
import com.yifongau.alfabet_backend.domain.Lemma;
import com.yifongau.alfabet_backend.domain.Letter;
import com.yifongau.alfabet_backend.persistance.AlfabetService;

@RestController
public class AlfabetEndPoints {
	
	@Autowired
	AlfabetService as;
	
	
	@GetMapping("lemma")
	public Iterable<Lemma> allLemma(){
		return as.allLemma();
	}
	
	@PostMapping("lemma")
	public void newLemma(@RequestBody Lemma lemma){
		as.newLemma(lemma);
	}
	
	@GetMapping("categorie")
	public Iterable<Categorie> allCategorie(){
		return as.allCategorie();
	} 
	
	@PostMapping("categorie")
	public void newCategorie(@RequestBody Categorie categorie){
		as.newCategorie(categorie);
	}
	
	@GetMapping("letter")
	public Iterable<Letter> allLetter(){
		return as.allLetter();
	}
	
	@PostMapping("letter")
	public void newLetter(@RequestBody Letter letter){
		as.newLetter(letter);
	}

}
