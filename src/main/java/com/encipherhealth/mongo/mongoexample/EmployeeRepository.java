package com.encipherhealth.mongo.mongoexample;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee, Integer> {
}
