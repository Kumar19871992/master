package com.example.demo;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.application.dto.InputDTO;
import com.example.application.dto.ResponseDTO;
import com.example.application.exception.ApplicationException;
import com.example.application.service.IDataService;

import junit.framework.Assert;

//@SpringBootTest
class DemoApplicationTests {
	
//	@Autowired
//	IDataService iDataService;
//	
//	@Test
//	public void fetchRolesPassTest() throws ApplicationException {
//		InputDTO input = new InputDTO();
//		ArrayList<Integer> al = new ArrayList<Integer>();
//		al.add(60);
//		
//		input.setInput(al);
//		ResponseDTO responseDTO=iDataService.fetchData(input);
//		Assert.assertEquals(responseDTO.getTotal(),60);
//	}
}
