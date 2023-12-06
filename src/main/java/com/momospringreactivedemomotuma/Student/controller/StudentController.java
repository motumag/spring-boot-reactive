package com.momospringreactivedemomotuma.Student.controller;

import com.momospringreactivedemomotuma.Student.entity.Student;
import com.momospringreactivedemomotuma.Student.services.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

@RestController
@RequestMapping("/api/v1/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService service;
    @PostMapping(name = "/register")
    Mono<Student> saveStudent(@RequestBody Student student){
        return service.saveStudent(student);
    }
//    @GetMapping(name = "/byId")
//    Mono<Student> getStudentBySpecificId(Long id){
//        return service.findStudentById(id);
//    }
    @GetMapping()
    Flux<Student> getAllStudent(){
        return service.listOfAllStudent()
                .delayElements(Duration.ofSeconds(1));
    }
}
