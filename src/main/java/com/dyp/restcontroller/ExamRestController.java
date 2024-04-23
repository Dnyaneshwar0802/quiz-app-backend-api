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

import com.dyp.model.Exam;
import com.dyp.service.ExamService;

@RestController
@RequestMapping("/examRestController")
@CrossOrigin
public class ExamRestController {
	@Autowired
	private ExamService examService;

	@PostMapping("/saveData")
	public Exam saveData(@RequestBody Exam exam) {
        System.out.println(exam);
		Exam e = examService.saveData(exam);
		return e;

	}
	@PutMapping("/updateSingleQue/{id}")
	public Exam updateSingleQue(@RequestBody Exam exam, @PathVariable int id) {
		Exam e=examService.updateSingleQue(exam, id);
		return e;
		
	}
	@DeleteMapping("/deleteQuestion/{id}")
	public void deleteQuestion(@PathVariable int id) {
		examService.deleteQuestion(id);
	}
	
	@GetMapping("/seeAllQuestions")
	public List<Exam> seeAllQuestions(){
		List<Exam> examList=examService.seeAllQuestions();
		return examList;
		
	}
	@GetMapping("/getSingleQue/{id}")
	public Optional<Exam> getSingleQue(@PathVariable int id){
		Optional<Exam> exam=examService.getSingleQue(id);
		return exam;
		
	}
	@GetMapping("/totalQuestionNum")
	public int totalQuestionNum() {
		int total=examService.totalQuestionNum();
		return total;
	}
}
