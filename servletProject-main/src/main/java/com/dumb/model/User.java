package com.dumb.model;

public class User {
	String username;
	String password;
	String rollNo;
	String firstName, secondName, gender, address, contact,program;
	
	public User() {}
	
	
	public User( String username, String password) {
		this.username = username;
		this.password = password;
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
	public void setFirstName(String firstName){
		this.firstName= firstName;
	}
	public String getFirstName(){
		return firstName;
	}

	public void setSecondName(String secondName){
		this.secondName= secondName;
	}
	public String getSecondName(){
		return secondName;
	}

	public void setRollNo(String rollNo){
		this.rollNo= rollNo;
	}
	public String getRollNo(){
		return rollNo;
	}

	public void setGender(String gender){
		this.gender= gender;
	}
	public String getGender(){
		return gender;
	}

	public void setAddress(String address){
		this.address= address;
	}
	public String getAddress(){
		return address;
	}

	public void setContact(String contact){
		this.contact= contact;
	}
	public String getContact(){
		return contact;
	}

	public void setProgram(String program){
		this.program= program;
	}
	public String getProgram(){
		return program;
	}
}
