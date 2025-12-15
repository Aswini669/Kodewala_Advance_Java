package com.kodewal.flipkart.invoice.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kodewal.flipkart.invoice.entities.InvoiceEntity;

@Repository
public interface InvoiceRepo extends CrudRepository<InvoiceEntity, Integer>{

	List<InvoiceEntity> findInvoiceByStatus(String status);
	List<InvoiceEntity> filterByStatusAndValue(String status, int inVoiceValue);
}
