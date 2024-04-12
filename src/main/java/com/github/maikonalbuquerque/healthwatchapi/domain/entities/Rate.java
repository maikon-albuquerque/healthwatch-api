package com.github.maikonalbuquerque.healthwatchapi.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Rate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreatedDate
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "rate")
    private Integer rate;

    @Column(name = "feedback")
    private String feedback;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "notification_id", unique = true)
    private Notification notification;

}
