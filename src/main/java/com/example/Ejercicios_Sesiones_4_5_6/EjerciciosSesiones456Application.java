package com.example.Ejercicios_Sesiones_4_5_6;

import com.example.Ejercicios_Sesiones_4_5_6.entities.Laptop;
import com.example.Ejercicios_Sesiones_4_5_6.repositories.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;



@SpringBootApplication
public class EjerciciosSesiones456Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(EjerciciosSesiones456Application.class, args);

		LaptopRepository repository = context.getBean(LaptopRepository.class);

		/**
		 * Si creo los objetos con muchos o estos atributos la BBDD me da error y me dice que la tabla "Laptops"está vacía
		 */
		/*Laptop lenovoIdea = new Laptop(null, "Lenovo", "IdeaPad", 2022, false);
		Laptop hpOmen = new Laptop(null, "Hewlett-Packard", "Omen", 2021, true);
		Laptop hpPavilion = new Laptop(null, "Hewlett-Packard", "Pavilion", 2020, false);
		Laptop  msiTitan = new Laptop(null, "MSI", "Titan GT", 2022, true);


		repository.save(lenovoIdea);
		repository.save(hpOmen);
		repository.save(hpPavilion);
		repository.save(msiTitan);*/


		Laptop dell = new Laptop(null, "Dell");
		Laptop hp = new Laptop(null, "HP");
		Laptop lenovo = new Laptop(null, "Lenovo");
		Laptop msi = new Laptop(null, "MSI");


		repository.save(dell);
		repository.save(hp);
		repository.save(lenovo);
		repository.save(msi);

		System.out.println(repository.findAll().size());
	}


}
