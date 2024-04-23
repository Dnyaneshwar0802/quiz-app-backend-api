package com.dyp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dyp.model.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{
	@Query("select s from Student as s where  s.username = :user and s.password = :pass")
public Student findByNameAndPassword(String user,String pass);
	@Query("select s from Student as s where  s.examStatus = :result")
	public List<Student> findPassFailStud(String result);
	
}
