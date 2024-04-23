package com.dyp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="exam")
public class Exam {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private int qid;
 @Column(name="question" ,nullable =false)
 private String question;
 @Column(name="option1" ,nullable =false)
 private String option1;
 @Column(name="option2" ,nullable =false)
 private String option2;
 @Column(name="option3" ,nullable =false)
 private String option3;
 @Column(name="option14" ,nullable =false)
 private String option4;
 @Column(name="answer" ,nullable=false)
 private int answer;
public int getQid() {
	return qid;
}
public void setQid(int qid) {
	this.qid = qid;
}
public String getQuestion() {
	return question;
}
public void setQuestion(String question) {
	this.question = question;
}
public String getOption1() {
	return option1;
}
public void setOption1(String option1) {
	this.option1 = option1;
}
public String getOption2() {
	return option2;
}
public void setOption2(String option2) {
	this.option2 = option2;
}
public String getOption3() {
	return option3;
}
public void setOption3(String option3) {
	this.option3 = option3;
}
public String getOption4() {
	return option4;
}
public void setOption4(String option4) {
	this.option4 = option4;
}
public int getAnswer() {
	return answer;
}
public void setAnswer(int answer) {
	this.answer = answer;
}
@Override
public String toString() {
	return "Exam [qid=" + qid + ", question=" + question + ", option1=" + option1 + ", option2=" + option2
			+ ", option3=" + option3 + ", option4=" + option4 + ", answer=" + answer + "]";
}

}
