package com.study.springbean;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.study.springboot.Config;
import com.study.springboot.SportsCar;
import com.study.springboot.Truck;

@SpringBootApplication
public class SpringdiApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringdiApplication.class, args);
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		SportsCar Sports = (SportsCar) context.getBean("Sports");
		Sports.go();

		Truck truck = context.getBean("hello", Truck.class);
		Sports.go();

	}
}
