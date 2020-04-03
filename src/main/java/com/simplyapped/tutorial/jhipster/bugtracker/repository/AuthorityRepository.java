package com.simplyapped.tutorial.jhipster.bugtracker.repository;

import com.simplyapped.tutorial.jhipster.bugtracker.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
