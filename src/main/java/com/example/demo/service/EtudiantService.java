package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.EtudiantRepository;
import com.example.demo.model.Etudiant;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class EtudiantService {
	@Autowired
	EtudiantRepository etudiantRepository;
	
	public Etudiant addEtudiant(Etudiant e) {
		etudiantRepository.save(e);
		return e;
	}

}
