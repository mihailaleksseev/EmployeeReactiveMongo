package com.reactive.reactivemongo;

import com.reactive.reactivemongo.model.Employee;
import com.reactive.reactivemongo.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;
import java.util.stream.Stream;

@SpringBootApplication
public class ReactiveMongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveMongoApplication.class, args);
	}

	@Bean
	CommandLineRunner employees(EmployeeRepository employeeRepository) {
		return args ->{
			employeeRepository
					.deleteAll()
			.subscribe(null, null, () -> {
				Stream.of(new Employee(UUID.randomUUID().toString(), "Peter", 2300L),
							new Employee(UUID.randomUUID().toString(), "Sam", 1300L),
							new Employee(UUID.randomUUID().toString(), "Ryan", 2000L),
							new Employee(UUID.randomUUID().toString(), "Chris", 5200L)
						  )
						  .forEach(employee -> {
							  employeeRepository
									.save(employee)
									.subscribe(System.out::println);
						});

			});
		};
	}
}

