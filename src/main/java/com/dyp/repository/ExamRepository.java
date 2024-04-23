package com.dyp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dyp.model.Exam;
@Repository
public interface ExamRepository extends JpaRepository<Exam, Integer>{
	 @Query("SELECT COUNT(e) FROM Exam e")
	    public int totalQue();
}
