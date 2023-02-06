package com.logipool.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


import com.logipool.exceptions.UserNotFoundExceptions;
import com.logipool.model.Student;
import com.logipool.service.StudentService;
//import com.logipool.service.StudentServiceImpl;
@Controller
//@RestController
@RequestMapping("/Student")
public class studentController {
@Autowired
 private StudentService studentService;
	
	@PostMapping("/save")
	public ResponseEntity<String> saveStudent(@RequestBody Student s){
		
		      studentService.saveStudent(s);
		
		return new ResponseEntity<>("inserted successfully",HttpStatus.CREATED);
							
	}
	@GetMapping("/allStudent")
	public ResponseEntity<List<Student>> getAllStudent(){
		
	List<Student>	l =studentService.getAllStudent();
		
		return new ResponseEntity<>(l, HttpStatus.OK);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteById(@PathVariable("id") int id){
		
		studentService.deleteById( id);
		
		return new ResponseEntity<>("Student "+id+" delete successfully" ,HttpStatus.OK) ;
		
	}
	@PutMapping("/{id}")
	public ResponseEntity<String> updateById(@RequestBody Student s,  @PathVariable("id") int id){
		studentService.updateById( s,id);
		
		return new ResponseEntity<>("Student "+id+" updated successfully" ,HttpStatus.OK) ;
	}
	@GetMapping("/{address}")
	public ResponseEntity<List<Student>> getAllByAdress(@PathVariable("address") String address){
		List<Student> l1=studentService.getAllByAdress(address);
		return new ResponseEntity<>(l1,HttpStatus.OK);
	}

	
//	  @GetMapping("/{address}/{id}") 
//	  public ResponseEntity<Student>getByIdAndAddress(@PathVariable("id") int id,@PathVariable("address") String
//	  address) 
//	  { Student s=(Student) studentService.findByIdAndAddress(id,address);
//	  return new ResponseEntity<>(s,HttpStatus.OK); }
	 
	@GetMapping("/{name}/{address1}")
	public ResponseEntity<String> checkUSer(@PathVariable("name") String  name,@PathVariable("address1") String  address)
	{
		 Boolean b=studentService.checkUser(name,address);
		 if(b)
		 {
			 return new ResponseEntity<>("login successful...",HttpStatus.OK);
		 }
		 else
		 {
			 throw new UserNotFoundExceptions("Id or address incorrect");
		 }
	}
	@RequestMapping("/register")
	public String  home() {
		return "rf";
	}
	
}
