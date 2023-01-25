package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Persons;

@Repository
public interface PersonRepository extends JpaRepository<Persons, Integer> {

}
