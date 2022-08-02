package com.yifongau.alfabet_backend.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.yifongau.alfabet_backend.domain.Letter;

@Component
public interface LetterRepo extends JpaRepository<Letter, Long>{
	
	

}
