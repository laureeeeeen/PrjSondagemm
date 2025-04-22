package com.example.lauren.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.lauren.entities.Project;

public interface ProjectRepository  extends JpaRepository<Project, Long>{

}
