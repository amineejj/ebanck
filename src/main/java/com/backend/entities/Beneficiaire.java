package com.backend.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
@Entity
@Table(name="BENEFICIAIRE")
public @Data class Beneficiaire  {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	Long id;
		
	@JoinColumn(name="Client_proprio")
	@ManyToOne
	@JsonIgnore
	Client client;
	
	@Column(unique = true, name="numero_compte")
	String numeroCompte;
	
	@JoinColumn(name="Compte_owner")
	@OneToOne
	Compte compteOwner;
}
