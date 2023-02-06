package com.logipool.dao;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.logipool.model.Student;


public interface StudentDao extends JpaRepository<Student, Integer> {

	public List<Student> findByAddress(String Address);
	
	
	 @Query(value = "SELECT * FROM Student WHERE id = ?1 && address=?3", nativeQuery = true)
	public Student findByIdandAddress(int id, String address);
	 
	 
	 @Query(value = "SELECT * FROM Student WHERE name = ?1 && address=?2", nativeQuery = true)
	 public Student findByNameAndAddress(String name,String address);

}
