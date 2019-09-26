package com.springboot.timemanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.timemanagement.model.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {

}