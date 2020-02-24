/**
 * 
 */
package fr.bpifrance.mendix.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dossier")
public class Dossier {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
	
	private String reference;
	private String siren;
	private float readjustmentAmount;
	private BigDecimal readjustmentDuration;
	private float readjustmentRate;
	private BigDecimal readjustmentSuspendedDeadline;
	private String readjustmentPeriodicity;
	private String applicationDocuments;

	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getSiren() {
		return siren;
	}
	public void setSiren(String siren) {
		this.siren = siren;
	}
	public float getReadjustmentAmount() {
		return readjustmentAmount;
	}
	public void setReadjustmentAmount(float readjustmentAmount) {
		this.readjustmentAmount = readjustmentAmount;
	}
	public BigDecimal getReadjustmentDuration() {
		return readjustmentDuration;
	}
	public void setReadjustmentDuration(BigDecimal readjustmentDuration) {
		this.readjustmentDuration = readjustmentDuration;
	}
	public float getReadjustmentRate() {
		return readjustmentRate;
	}
	public void setReadjustmentRate(float readjustmentRate) {
		this.readjustmentRate = readjustmentRate;
	}
	public BigDecimal getReadjustmentSuspendedDeadline() {
		return readjustmentSuspendedDeadline;
	}
	public void setReadjustmentSuspendedDeadline(BigDecimal readjustmentSuspendedDeadline) {
		this.readjustmentSuspendedDeadline = readjustmentSuspendedDeadline;
	}
	public String getReadjustmentPeriodicity() {
		return readjustmentPeriodicity;
	}
	public void setReadjustmentPeriodicity(String readjustmentPeriodicity) {
		this.readjustmentPeriodicity = readjustmentPeriodicity;
	}
	public String getApplicationDocuments() {
		return applicationDocuments;
	}
	public void setApplicationDocuments(String applicationDocuments) {
		this.applicationDocuments = applicationDocuments;
	}
	
	



}
