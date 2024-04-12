package com.github.maikonalbuquerque.healthwatchapi.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
public class LeadershipNotificationAnalysis {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Cause> causes = new ArrayList<>();

    @Column(name = "what")
    private String what;

    @Column(name = "why")
    private String why;

    @Column(name = "where")
    private String where;

    @Column(name = "when")
    private String when;

    @Column(name = "who")
    private String who;

    @Column(name = "how")
    private String how;

    @Column(name = "how_much")
    private String HowMuch;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "notification_id", unique = true)
    private Notification notification;

}
