package com.springproject.students.Repository;

import com.springproject.students.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

	@Query(nativeQuery = true, value = """
	    SELECT * FROM students 
	    WHERE 
	    students.first_name LIKE %:search% OR students.last_name LIKE %:search% OR students.email LIKE %:search%
			""")
	List<Student> searchStudent(String search);
}