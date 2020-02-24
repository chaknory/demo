/**
 * 
 */
package fr.bpifrance.mendix.model;


import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import fr.bpifrance.mendix.model.Dossier;

@Entity
@Table(name = "event")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
	
	private String reference;
	private String eventType; //Study, NotFinalized, Granted, Denied, MaximumReached, LoanDefault, UnpaidCommission
	private String priorite; //High, Medium, Low
	//private LocalDateTime dueAt;
	//private Dossier dossier;
	
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getEventType() {
		return eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
	public String getPriorite() {
		return priorite;
	}
	public void setPriorite(String priorite) {
		this.priorite = priorite;
	}
	/*
	public LocalDateTime getDueAt() {
		return dueAt;
	}
	public void setDueAt(LocalDateTime dueAt) {
		this.dueAt = dueAt;
	}
	*/
	/*
	public Dossier getDossier() {
		return dossier;
	}
	public void setDossier(Dossier dossier) {
		this.dossier = dossier;
	}
	*/
	


}
