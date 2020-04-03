package com.simplyapped.tutorial.jhipster.bugtracker.repository;

import com.simplyapped.tutorial.jhipster.bugtracker.domain.Project;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the Project entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
