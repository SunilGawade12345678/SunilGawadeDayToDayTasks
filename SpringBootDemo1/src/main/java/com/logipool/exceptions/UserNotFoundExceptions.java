package com.logipool.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(reason = "invalid user",code = HttpStatus.BAD_REQUEST)
public class UserNotFoundExceptions extends RuntimeException {

	public UserNotFoundExceptions(String message){
		super(message);
	}
	
}
