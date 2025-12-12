package com.kodewala.myntra.invoice.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kodewala.myntra.invoice.entities.InvoiceEntity;

@Repository
public interface InvoiceRepo extends CrudRepository<InvoiceEntity, Integer>{

}
