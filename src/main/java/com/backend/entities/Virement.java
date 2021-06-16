package com.backend.entities;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Table(name="VIREMENT")
public @Data class Virement extends VirementSuperClass {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_VIREMENT")
	Long id;
	
	@JoinColumn(name="CREANCIER_VIREMENT")
	@ManyToOne 
	@JsonIgnore
	Compte creancier;
	
	@Column(name="SOMME_RECU_VIREMENT")
	double sommeRecu;
}