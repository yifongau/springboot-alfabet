package com.yifongau.alfabet_backend.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.yifongau.alfabet_backend.domain.Categorie;

@Component
public interface CategorieRepo extends JpaRepository<Categorie, Long>{
	
	

}
