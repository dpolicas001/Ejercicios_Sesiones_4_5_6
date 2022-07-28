package com.example.Ejercicios_Sesiones_4_5_6.controller;

import com.example.Ejercicios_Sesiones_4_5_6.entities.Laptop;
import com.example.Ejercicios_Sesiones_4_5_6.repositories.LaptopRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LaptopController {

    private LaptopRepository laptopRepository;

    public LaptopController(LaptopRepository laptopRepository){

        this.laptopRepository = laptopRepository;
    }


    @GetMapping("/api/laptops")
    public List<Laptop> getAllLaptops(){

        return laptopRepository.findAll();
    }

    @PostMapping("/api/laptop")
    public Laptop guardarEnBD(@RequestBody Laptop laptop){

        return laptopRepository.save(laptop);

    }


}
