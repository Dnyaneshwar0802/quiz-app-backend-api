package com.dyp.serviceimpl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dyp.model.Student;
import com.dyp.repository.StudentRepository;
import com.dyp.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public Student saveData(Student student) {
		student.setExamStatus("NOT ATTEMPTED");
		Student std=studentRepository.save(student);
		return std;
	}
	@Override
	public Optional<Student>  sendData(String user, String pass) {
		Optional<Student> s=Optional.ofNullable(studentRepository.findByNameAndPassword(user, pass));
		System.out.println(s);
		return s;
	}
	@Override
	public Student updateData(int id,Student student) {
			Optional<Student> dbStudentData=studentRepository.findById(id);
			Student std=dbStudentData.get();
			student.setId(id);
			System.out.println("API Student Data"+student);
			//System.out.println(std);
			if(student.getFirstname()!=null && student.getFirstname()!="") {
				System.out.println("Iside IF");
				std.setFirstname(student.getFirstname());
			}if(student.getLastname()!=null && student.getLastname()!="") {
				std.setLastname(student.getLastname());
			}if(student.getEmail()!=null && student.getEmail()!="") {
				std.setEmail(student.getEmail());
			}if(student.getUsername()!=null && student.getUsername()!="") {
				std.setUsername(student.getUsername());
			}if(student.getExamStatus()==null) {
			  std.setExamStatus("NOT ATTEMPTED");
			  }else {
				  std.setExamStatus(student.getExamStatus());
			  }
			
			System.out.println("Updated Student Data"+std);
		Student s=studentRepository.save(std);
		return s;
	}
	@Override
	public void deleteData(int id) {
		studentRepository.deleteById(id);
	}
	@Override
	public List<Student> passFailStd(String result) {
		List<Student> passFailStudentList=studentRepository.findPassFailStud(result);
		return passFailStudentList;
	}
	@Override
	public List<Student> allStudents() {
		List<Student> studentList=studentRepository.findAll();
		return studentList;
	}

}
