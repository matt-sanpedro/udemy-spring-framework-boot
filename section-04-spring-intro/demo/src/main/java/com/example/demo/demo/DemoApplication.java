package com.example.demo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;

// import com.example.demo.demo.model.Alien;
import com.example.demo.demo.model.Laptop;
import com.example.demo.demo.service.LaptopService;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class DemoApplication {

	public static void main(String[] args) {
		// since the ApplicationContext is returned, we can use it to get beans, can call IoC container
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

		// Alien obj = new Alien();
		// Alien obj = context.getBean(Alien.class);
		// System.out.println(obj.getAge());
		// obj.code();

		LaptopService service = context.getBean(LaptopService.class);

		Laptop lap = context.getBean(Laptop.class);
		service.addLaptop(lap);
	}

}
