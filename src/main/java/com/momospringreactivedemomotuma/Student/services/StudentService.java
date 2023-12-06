package com.momospringreactivedemomotuma.Student.services;

import com.momospringreactivedemomotuma.Student.entity.Student;
import com.momospringreactivedemomotuma.Student.repository.StudentRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;
    public Mono<Student> saveStudent(Student student){
        return studentRepository.save(student);
    }
   public Flux<Student> listOfAllStudent(){
        return studentRepository.findAll();
    }
   public Mono<Student> findStudentById(Long id){
        return studentRepository.findById(id);
    }

}
