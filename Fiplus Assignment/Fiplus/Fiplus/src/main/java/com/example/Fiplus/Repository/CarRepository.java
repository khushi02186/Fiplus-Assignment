package com.example.Fiplus.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Fiplus.domain.Car;

public interface CarRepository extends JpaRepository<Car, Long> {
}
