package com.kodewal.flipkart.invoice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;


@Entity
@Table(name = "flipkartInvoice")
@NamedQuery(name = "InvoiceEntity.filterByStatusAndValue",
             query = "From InvoiceEntity where status = :status AND invValue = :inVoiceValue")
public class InvoiceEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int invValue;
	private String note;
	private String gstNum;
	private String status;
	private String description;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getInvValue() {
		return invValue;
	}
	public void setInvValue(int invValue) {
		this.invValue = invValue;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getGstNum() {
		return gstNum;
	}
	public void setGstNum(String gstNum) {
		this.gstNum = gstNum;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
