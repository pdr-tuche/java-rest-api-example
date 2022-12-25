package com.example.restapiexemple.controller;

import com.example.restapiexemple.model.Car;
import com.example.restapiexemple.repository.CarRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class CarController {

    CarRepository repository;

    @GetMapping("/car")
    public List<Car> getAllCars() {
        return repository.findAll();
    }

    //tem uma coisa do optional que nao entendi muito bem
    /*@GetMapping("/car/{id}")
    public Optional<Car> getCarById(@PathVariable Long id){
        return repository.findById(id);
    }*/

    @GetMapping("/car/{id}")
    public Car getCarById(@PathVariable Long id) {
        return repository.findById(id).get(); // o get resolve o lance do optional que comentei acima
    }

    @PostMapping("/car")
    public Car saveCar(@RequestBody Car car) {
        return repository.save(car);
    }

    @DeleteMapping("/car/{id}")
    public void deleteCar(@PathVariable Long id) {
        repository.deleteById(id);
    }

}