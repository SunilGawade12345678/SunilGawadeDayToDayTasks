package com.logipool.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.logipool.dao.StudentDao;
import com.logipool.model.Student;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao studentDao;

	@Override
	public void saveStudent(Student s ) {
		
		studentDao.save(s);
	}

	@Override
	public List<Student> getAllStudent() {
		return studentDao.findAll();
		
	}

	@Override
	public void deleteById(int id) {
		studentDao.deleteById(id);
		
	}

	@Override
	public void updateById(Student s, int id) {
		
	Student s1	=studentDao.findById(id).get();
		
		s1.setName(s.getName());
		s1.setAddress(s.getAddress());
		
		studentDao.save(s1);
	}

	@Override
	public List<Student> getAllByAdress(String address) {
		return (List<Student>) studentDao.findByAddress(address);
		
		
	}

	@Override
	public Student findByIdAndAddress(int id, String address) {
		// TODO Auto-generated method stub
		return studentDao.findByIdandAddress(id,address);
	}

	@Override
	public Boolean checkUser(String name, String address) {
		Student student=studentDao.findByNameAndAddress(name, address);
	
	
		if(student==null ) {
			return false;
		}
		else {
			if(name.equals(student.getName()) && address.equals(student.getAddress()))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
	}

	
	}


