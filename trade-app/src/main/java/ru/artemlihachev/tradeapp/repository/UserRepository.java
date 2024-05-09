package ru.artemlihachev.tradeapp.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.artemlihachev.tradeapp.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
