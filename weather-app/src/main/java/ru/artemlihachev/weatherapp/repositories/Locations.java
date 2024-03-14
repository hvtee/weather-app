package ru.artemlihachev.weatherapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.artemlihachev.weatherapp.models.Location;

@Repository
public interface Locations extends JpaRepository<Location, Long> {
}
