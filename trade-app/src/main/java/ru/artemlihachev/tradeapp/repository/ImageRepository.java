package ru.artemlihachev.tradeapp.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.artemlihachev.tradeapp.model.Image;

public interface ImageRepository extends JpaRepository<Image, Long> {
}
