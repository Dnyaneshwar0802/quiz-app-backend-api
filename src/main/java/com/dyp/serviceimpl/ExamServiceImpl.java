package com.dyp.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dyp.model.Exam;
import com.dyp.repository.ExamRepository;
import com.dyp.service.ExamService;
@Service
public class ExamServiceImpl implements ExamService {

	@Autowired
	private ExamRepository examRepository;
	@Override
	public Exam saveData(Exam exam) {
		Exam e=examRepository.save(exam);
		return e;
	}
	@Override
	public List<Exam> seeAllQuestions() {
		List<Exam> examList=examRepository.findAll();
		System.out.println(examList.size());
		return examList;
	}
	@Override
	public Optional<Exam> getSingleQue(int id) {
		Optional<Exam> exam=examRepository.findById(id);
		return exam;
	}
	@Override
	public Exam updateSingleQue(Exam exam, int id) {
		Optional<Exam> dbexam =examRepository.findById(id);
		Exam e=dbexam.get();
		if(exam.getQuestion()!=null && exam.getQuestion()!="") {
			e.setQuestion(exam.getQuestion());
		}
		if(exam.getOption1()!=null && exam.getOption1()!="") {
			e.setOption1(exam.getOption1());
		}
		if(exam.getOption2()!=null && exam.getOption2()!="") {
			e.setOption2(exam.getOption2());
		}
		if(exam.getOption3()!=null && exam.getOption3()!="") {
			e.setOption3(exam.getOption3());
		}
		if(exam.getOption4()!=null && exam.getOption4()!="") {
			e.setOption4(exam.getOption4());
		}
		if(exam.getAnswer()>0 && exam.getAnswer()<5) {
			e.setAnswer(exam.getAnswer());
		}
		Exam ex=examRepository.save(e);
		return ex;
	}
	@Override
	public void deleteQuestion(int id) {

		examRepository.deleteById(id);
	}
	@Override
	public int totalQuestionNum() {
		int total=examRepository.totalQue();
		return total;
	}

}
