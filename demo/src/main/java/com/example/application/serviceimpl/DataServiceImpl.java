package com.example.application.serviceimpl;

import org.springframework.stereotype.Service;

import com.example.application.dto.InputDTO;
import com.example.application.dto.ResponseDTO;
import com.example.application.exception.ApplicationException;
import com.example.application.service.IDataService;

@Service
public class DataServiceImpl implements IDataService {

	@Override
	public ResponseDTO fetchData( InputDTO input)  {
		ResponseDTO response = new ResponseDTO ();
		response.setTotal(input.getSum());
		 response.setMedian(input.getAverage());
		 response.setMaxthanmedian(input.greaterthanAverage());
		 response.setMessage("SUCCESS");
		return response;
		// TODO Auto-generated method stub
		
	}
	
}