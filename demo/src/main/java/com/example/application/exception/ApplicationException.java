package com.example.application.exception;

import com.example.application.dto.ResponseDTO;

public class ApplicationException extends Exception {
	 
	 
	public static ResponseDTO exception(Exception e){
		ResponseDTO responseDTO=new ResponseDTO();
		 
		//responseDTO.setException(e.getMessage());
		responseDTO.setMessage("Fail");
		responseDTO.setMessage("Number is expected, but String is passed as part of request");
		return responseDTO;
	}
}