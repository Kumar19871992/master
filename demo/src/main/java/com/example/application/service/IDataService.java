package com.example.application.service;

import org.springframework.stereotype.Service;

import com.example.application.dto.InputDTO;
import com.example.application.dto.ResponseDTO;
import com.example.application.exception.ApplicationException;


public interface IDataService {
	
	ResponseDTO fetchData(InputDTO input) throws ApplicationException;
}
