package ru.artemlihachev.weatherapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.artemlihachev.weatherapp.models.User;

@Repository
public interface Users extends JpaRepository<User, Long> {
}
