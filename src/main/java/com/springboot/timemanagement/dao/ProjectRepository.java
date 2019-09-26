package com.springboot.timemanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.timemanagement.model.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer> {

}
