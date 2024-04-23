package com.dyp.restcontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dyp.model.Student;
import com.dyp.service.StudentService;

@RestController
@CrossOrigin
@RequestMapping("/studentRestController")
public class StudentRestController {

	@Autowired
	private StudentService studentService;

	@PostMapping("/saveData")
	public Student saveData(@RequestBody Student student) {
		Student std = studentService.saveData(student);
		return std;
	}
	
   @GetMapping("/sendData/{username}/{password}")
   public Optional<Student> sendData(@PathVariable String username , @PathVariable String password) {
	   System.out.println("Username is >>"+username);
	   System.out.println("Password is >>"+password);

	   Optional<Student> s=studentService.sendData(username, password);
	return s;
	   
   }
   @GetMapping("/passFailStd/{result}")
   public List<Student> passFailStd(@PathVariable String result){
	   List<Student> studentList=studentService.passFailStd(result);
	   return studentList;
   }
   
   @PutMapping("/updateData/{id}")
   public Student updateData( @PathVariable int id,@RequestBody Student student) {
	 Student student1 = studentService.updateData(id,student);
	return student1;	   
   }
   
   @DeleteMapping("/deleteData/{id}")
   public void deleteData(@PathVariable int id) {
	   studentService.deleteData(id);
   }
   
   @GetMapping("/allStudents")
   public List<Student> allStudents(){
	   List<Student> studentList  =studentService.allStudents();
	   return studentList;
   }
}
