package com.example.application.controller;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.application.dto.InputDTO;
import com.example.application.dto.ResponseDTO;
import com.example.application.exception.ApplicationException;
import com.example.application.service.IDataService;

@RestController
@RequestMapping(path = "/api")
public class ArrayMetricsController {

	
	/*
	 * @GetMapping(path="/content", produces = "application/json") public String
	 * getEmployees() { return "Hello"; }
	 */
	@Autowired
	IDataService iDataService;
	 
	 @PostMapping(path= "/arraycontent", consumes = "application/json", produces = "application/json")
	    public ResponseDTO addEmployee(@RequestBody InputDTO input ) 
	    {
		
		 ResponseDTO response = new ResponseDTO();
		 try {
			response = iDataService.fetchData(input);
		} catch (ApplicationException e) {
			// TODO Auto-generated catch block
			response = ApplicationException.exception(e);
		}
		 
		 return response;
	       //  return   response;
	        //return ResponseEntity.created(location).build();
	    }
}
