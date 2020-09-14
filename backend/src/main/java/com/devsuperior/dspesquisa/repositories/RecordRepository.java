package com.devsuperior.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dspesquisa.entitties.Genre;

public interface RecordRepository extends JpaRepository<Genre, Long> {
	
	
}
