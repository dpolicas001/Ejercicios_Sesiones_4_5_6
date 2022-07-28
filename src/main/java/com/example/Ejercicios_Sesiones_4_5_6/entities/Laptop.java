package com.example.Ejercicios_Sesiones_4_5_6.entities;

import javax.persistence.*;

@Entity
@Table(name = "Laptops")
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String manufacturer;

    /**
     * Si creo los objetos con muchos o estos atributos la BBDD me da error y me dice que la tabla "Laptops"está vacía
     */
    /*private String model;
    private Integer year;
    private Boolean gamer;*/

    public Laptop() {
    }

    /**
     * Si creo los objetos con muchos o estos atributos la BBDD me da error y me dice que la tabla "Laptops"está vacía
     */
    /*public Laptop(Long id, String manufacturer, String model, Integer year, Boolean gamer) {
        System.out.println("Usando Constructor Laptop");
        this.id = id;
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.gamer = gamer;
    }*/

    public Laptop(Long id, String manufacturer) {
        this.id = id;
        this.manufacturer = manufacturer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * Si creo los objetos con muchos o estos atributos la BBDD me da error y me dice que la tabla "Laptops"está vacía
     */
    /*public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Boolean getGamer() {
        return gamer;
    }

    public void setGamer(Boolean gamer) {
        this.gamer = gamer;
    }

    /*@Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", gamer=" + gamer +
                '}';
    }*/
}
