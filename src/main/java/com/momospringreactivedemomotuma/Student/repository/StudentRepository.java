package com.momospringreactivedemomotuma.Student.repository;

import com.momospringreactivedemomotuma.Student.entity.Student;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface StudentRepository extends ReactiveCrudRepository<Student,Long> {

}
