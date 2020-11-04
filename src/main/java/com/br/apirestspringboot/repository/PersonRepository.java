package com.br.apirestspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.apirestspringboot.data.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{

}