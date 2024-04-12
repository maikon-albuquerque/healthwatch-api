package com.github.maikonalbuquerque.healthwatchapi.domain.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Cause {

    @Id
    private Long id;

    private String description;

    @ManyToOne
    private CauseCategory causeCategory;
}
