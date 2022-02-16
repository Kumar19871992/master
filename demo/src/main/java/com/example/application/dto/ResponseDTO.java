package com.example.application.dto;

import java.util.ArrayList;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
public class ResponseDTO {

	private @Getter @Setter int total;
	private @Getter @Setter int median;
	private @Getter @Setter ArrayList maxthanmedian;
	private @Getter @Setter String message;
	private @Getter @Setter String exception;
	
	/*
	 * public int getTotal() { return total; } public void setTotal(int total) {
	 * this.total = total; } public int getMedian() { return median; } public void
	 * setMedian(int median) { this.median = median; } public ArrayList
	 * getMaxthanmedian() { return maxthanmedian; } public void
	 * setMaxthanmedian(ArrayList arrayList) { this.maxthanmedian = arrayList; }
	 * public String getMessage() { return message; } public void setMessage(String
	 * message) { this.message = message; } public String getException() { return
	 * exception; } public void setException(String exception) { this.exception =
	 * exception; }
	 */
}
