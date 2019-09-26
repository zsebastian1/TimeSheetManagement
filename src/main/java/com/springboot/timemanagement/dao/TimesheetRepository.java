package com.springboot.timemanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.timemanagement.model.Timesheet;

public interface TimesheetRepository extends JpaRepository<Timesheet, Integer> {

}
