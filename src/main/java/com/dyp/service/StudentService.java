package com.dyp.service;

import java.util.List;
import java.util.Optional;

import com.dyp.model.Student;

public interface StudentService {
public Student saveData(Student student);
public Optional<Student> sendData(String user,String pass);
public Student updateData(int id,Student student);
public void deleteData(int id);
public List<Student> passFailStd(String result);
public List<Student> allStudents();
}
