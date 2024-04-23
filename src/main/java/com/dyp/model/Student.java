package com.dyp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name="student",uniqueConstraints =@UniqueConstraint(columnNames = {"username","email"}))

public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String firstname;
private String lastname;
@Column(name = "email", unique = true, nullable = false)
private String email;
@Column(name = "username" ,unique = true, nullable = false)
private String username;
@Column(name="password" ,nullable=false)
private String password;
private String examStatus;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getExamStatus() {
	return examStatus;
}
public void setExamStatus(String examStatus) {
	this.examStatus = examStatus;
}
@Override
public String toString() {
	return "Student [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
			+ ", username=" + username + ", password=" + password + ", examStatus=" + examStatus + "]";
}


}
