package com.example.application.exception;

public class ExceptionResponse {

	public ExceptionResponse(String status, String messg) {
		super();
		this.status = status;
		this.messg = messg;
	}
	String status;
	String messg;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessg() {
		return messg;
	}
	public void setMessg(String messg) {
		this.messg = messg;
	}
}
