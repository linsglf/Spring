package com.springproject.students.config;

import com.springproject.students.Entity.Student;
import com.springproject.students.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;


@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
        Student s1 = new Student(null ,"gabriel", "lins", "gabriel@email.com");
        Student s2 = new Student(null ,"rafael", "gomes", "rafael@email.com");
        Student s3 = new Student(null ,"thiago", "lima", "thiago@email.com");
        Student s4 = new Student(null ,"diogo", "costa", "diogo@email.com");
        Student s5 = new Student(null ,"spring", "boot", "spring@email.com");

        studentRepository.saveAll(Arrays.asList(s1, s2, s3, s4, s5));
    }
}
