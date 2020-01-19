package com.main.controller;
import java.io.PrintWriter;
public class MainCtr {
	private String fileName = null;
	public MainCtr(String filename) {
		this.fileName = filename; 
	}
	
	public Boolean addUser(String user) {
		try{
			
			PrintWriter outputStream = new PrintWriter(this.fileName);
			//Write to a file
			outputStream.println(user);
			outputStream.close();
			return true;
		}catch(Exception e){
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	//Let's read file
	public String[] readFile(){
		return null;
	}

}
