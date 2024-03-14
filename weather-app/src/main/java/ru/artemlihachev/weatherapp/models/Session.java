package ru.artemlihachev.weatherapp.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;

@Data
@Entity
@Table(name = "sessions")
@NoArgsConstructor
public class Session {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private Long id;

    @Column(name = "user_id")
    private int user_id;

    @Column(name = "expires_at")
    private Time expires_at;
}
