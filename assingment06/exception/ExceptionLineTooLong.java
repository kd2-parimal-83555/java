package com.sunbeam.exception;

public class ExceptionLineTooLong extends RuntimeException{

	public String field;
	public String massage;
	
	public ExceptionLineTooLong() {
	
		this.field = "";
		this.massage = "";
	}
	public ExceptionLineTooLong( String massage) {
		
		this.field = "";
		this.massage = massage;
	}
	public ExceptionLineTooLong(String field, String massage) {
		super();
		this.field = field;
		this.massage = massage;
	}
	@Override
	public void printStackTrace() {
	
   System.err.println("Exception");
   System.err.println("InvalidException :" +massage);
   System.err.println("for the field :"+field);
			

	}
	
	
	
}
