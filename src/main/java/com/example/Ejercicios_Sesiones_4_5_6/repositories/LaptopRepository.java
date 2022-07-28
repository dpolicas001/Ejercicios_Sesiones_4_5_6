package com.example.Ejercicios_Sesiones_4_5_6.repositories;

import com.example.Ejercicios_Sesiones_4_5_6.entities.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Long> {
}
