package com.simplyapped.tutorial.jhipster.bugtracker.repository;

import com.simplyapped.tutorial.jhipster.bugtracker.domain.Label;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the Label entity.
 */
@SuppressWarnings("unused")
@Repository
public interface LabelRepository extends JpaRepository<Label, Long> {
}
