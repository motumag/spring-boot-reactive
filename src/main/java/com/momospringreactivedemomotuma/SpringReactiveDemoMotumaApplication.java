package com.momospringreactivedemomotuma;
import com.momospringreactivedemomotuma.Student.entity.Student;
import com.momospringreactivedemomotuma.Student.services.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringReactiveDemoMotumaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringReactiveDemoMotumaApplication.class, args);
    }
    @Bean
    public CommandLineRunner commandLineRunner(
            StudentService service
    ){
        return args -> {
            for(int i=1;i<10;i++){
                service.saveStudent(
                        Student
                                .builder()
                                .firstname("Motuma"+i)
                                .lastname("Gishu"+i)
                        .build()).subscribe();
            }
        };
    }
}
