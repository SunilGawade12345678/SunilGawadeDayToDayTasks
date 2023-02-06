package com.logipool.service;

import java.util.List;

import com.logipool.model.Student;

public interface StudentService {
	
	public void saveStudent(Student s);

	public List<Student> getAllStudent();

	public void deleteById(int id);

	public void updateById(Student s,int id);

	public List<Student> getAllByAdress(String address);

	public Object findByIdAndAddress(int id, String address);

	public Boolean checkUser(String name, String address);

}
