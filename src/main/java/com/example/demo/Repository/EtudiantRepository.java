package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Etudiant;

public interface EtudiantRepository extends CrudRepository<Etudiant, String> {

}
