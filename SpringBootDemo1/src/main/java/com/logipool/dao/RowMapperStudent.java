package com.logipool.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.logipool.model.Student;

public class RowMapperStudent  implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student s= new Student();
		s.setId(rs.getInt(1));
		s.setName(rs.getString(3));
		s.setAddress(rs.getString(2));
		
		return s;
	}

	
}
