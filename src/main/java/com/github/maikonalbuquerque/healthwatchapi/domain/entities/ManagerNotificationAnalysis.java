package com.github.maikonalbuquerque.healthwatchapi.domain.entities;

import com.github.maikonalbuquerque.healthwatchapi.domain.enums.SeverityLevel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
public class ManagerNotificationAnalysis {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "severity_level")
    @Enumerated(EnumType.STRING)
    private SeverityLevel severityLevel;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "notification_id", unique = true)
    private Notification notification;
}
