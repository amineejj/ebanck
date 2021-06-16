package com.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.backend.entities.Beneficiaire;
import com.backend.services.BeneficiaireService;
@RestController
@CrossOrigin(origins="http://localhost:4200")
public class BeneficiaireController {
	
	@Autowired
	BeneficiaireService service;
	
	
	@PostMapping("/beneficiaire")
	@ResponseStatus(HttpStatus.CREATED)
	public void addBeneficiaire(@RequestBody Beneficiaire beneficiaire)
	{
		service.addBeneficiaire(beneficiaire);
	}
	
	
	
	@GetMapping("/beneficiaire/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Beneficiaire getBeneficiaires(@PathVariable(value="id") Long id)
	{
		
		return service.getBeneficiaire(id);
	}
	
	
	
	@DeleteMapping("/beneficiaire/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void deleteBeneficiaire(@PathVariable(value="id") Long id)
	{
		service.deleteBeneficiaire(id);
	}
	
	

}