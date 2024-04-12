package com.github.maikonalbuquerque.healthwatchapi.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
public class NonConformity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "problem")
    private String problem;

    @Column(name = "other_problem")
    private String otherProblem;

    @Column(name = "ocurrence_report")
    private String ocurrenceReport;
}
