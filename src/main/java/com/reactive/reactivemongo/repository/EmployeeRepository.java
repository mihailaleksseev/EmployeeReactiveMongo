package com.reactive.reactivemongo.repository;

import com.reactive.reactivemongo.model.Employee;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface EmployeeRepository extends ReactiveMongoRepository<Employee, String> {
}
