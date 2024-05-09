package ru.artemlihachev.tradeapp.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.artemlihachev.tradeapp.model.Product;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByTitle(String title);
}
