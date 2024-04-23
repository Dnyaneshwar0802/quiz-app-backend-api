package com.dyp.service;

import java.util.List;
import java.util.Optional;

import com.dyp.model.Exam;

public interface ExamService {
public Exam saveData(Exam exam);
public List<Exam> seeAllQuestions();
public Optional<Exam> getSingleQue(int id);
public Exam updateSingleQue(Exam exam,int id);
public void deleteQuestion(int id);
public int totalQuestionNum();
}
