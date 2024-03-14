package ru.artemlihachev.weatherapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.artemlihachev.weatherapp.models.Session;

@Repository
public interface Sessions extends JpaRepository<Session, Long> {
}
