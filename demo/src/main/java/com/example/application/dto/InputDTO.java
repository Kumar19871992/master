package com.example.application.dto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import lombok.Data;
@Data
public class InputDTO {

	private List<Integer> input;
	
	public List<Integer> getInput() {
		return input;
	}

	public void setInput(List<Integer> input) {
		this.input = input;
	}

	
	int sum =0;
	int average;
	ArrayList al = new ArrayList<Integer>();
	 
	public int getSum () {
		List<Integer> l = this.getInput();
		
		 for (int i = 0; i < l.size(); i++) {
			sum = sum + l.get(i);
		}
		 return sum;
	}
	
	public int getAverage() {
		List<Integer> l = this.getInput();
		 average = sum/l.size();
		return average;
	}
	
	public  ArrayList greaterthanAverage() {
		List<Integer> l = this.getInput();
		 for (int i = 0; i < l.size(); i++) {
				if(l.get(i)>average) {
				 al.add(l.get(i));
				}  
			}
		 return al;
	}
	
}
