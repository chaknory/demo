package fr.bpifrance.mendix.model;

import java.util.Date;

public class PieceJointe {

	private String nom;
	private boolean optionnal; 
	private Date dateCreation;
	private Date dateModification;
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public boolean isOptionnal() {
		return optionnal;
	}
	public void setOptionnal(boolean optionnal) {
		this.optionnal = optionnal;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public Date getDateModification() {
		return dateModification;
	}
	public void setDateModification(Date dateModification) {
		this.dateModification = dateModification;
	}

	
	

}
