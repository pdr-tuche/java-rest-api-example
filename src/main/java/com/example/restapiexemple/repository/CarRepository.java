package com.example.restapiexemple.repository;

import com.example.restapiexemple.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car,Long> {
}
