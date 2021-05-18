package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sun.tools.jar.CommandLine;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
          Student vlad = new Student(
                  "Vlad",
                  "soft21101@gmail.com",
                  LocalDate.of(2002, Month.FEBRUARY, 27)

          );

            Student vladik = new Student(
                    "Vladik",
                    "soft21101@gmail.com",
                    LocalDate.of(2001, Month.FEBRUARY, 27)


            );
            repository.saveAll(Arrays.asList(vlad, vladik));

        };
    }
}
