package com.h2kinfosys.learn.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.h2kinfosys.learn.dto.Actor;

public interface ActorDAO extends JpaRepository<Actor, Integer>{

	List<Actor> findByFirstName(String firstName);
	
	
}
