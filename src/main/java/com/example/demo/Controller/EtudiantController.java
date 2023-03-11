package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Etudiant;
import com.example.demo.service.EtudiantService;

@RestController
@EnableAutoConfiguration
@RequestMapping(value="/api")
public class EtudiantController {

	@Autowired
	EtudiantService etudiantService;
	
	@PostMapping("/etudiant")
	public Etudiant addEtudiant(@RequestBody Etudiant e)   {
		etudiantService.addEtudiant(e);
		return e;
	}
	
}
