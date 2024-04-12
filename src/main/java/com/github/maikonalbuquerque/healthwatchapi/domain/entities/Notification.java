package com.github.maikonalbuquerque.healthwatchapi.domain.entities;

import com.github.maikonalbuquerque.healthwatchapi.domain.enums.Shift;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Notification{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "created_at")
    @CreatedDate
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    @UpdateTimestamp
    private LocalDateTime updatedAt;

    @Column(name = "ocurrence_date")
    private LocalDateTime ocurrenceDate;

    @Column(name = "author")
    private String author;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "notifyingsector_Id")
    private Sector notifyingSector;

    @OneToOne(mappedBy = "notification", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Rate rate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "notifiedsector_Id")
    private Sector notifiedSector;

    @Column(name = "shift")
    @Enumerated(EnumType.STRING)
    private Shift shift;

    @OneToOne(mappedBy = "notification", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private ManagerNotificationAnalysis managerNotificationAnalysis;

    @OneToOne(mappedBy = "notification", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private LeadershipNotificationAnalysis leadershipNotificationAnalysis;

}
