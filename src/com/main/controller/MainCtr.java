package com.main.controller;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
public class MainCtr {
	private String fileName = null;
	public MainCtr(String filename) {
		this.fileName = filename; 
	}
	
	public Boolean addUser(String user) {
		try{
			
			PrintWriter outputStream = new PrintWriter( new FileOutputStream(this.fileName,true));
			//Write to a file
			outputStream.println(user);
			outputStream.close();
			return true;
		}catch(FileNotFoundException e){
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	//Let's read file
	public ArrayList<String> readFile(){
		
		ArrayList<String> lines = new ArrayList<String>();
	
		try {
			
			Scanner outPutStream = new Scanner(new File(this.fileName));
			while(outPutStream.hasNextLine()){
				lines.add(outPutStream.nextLine());
			}
			
			//Close stream
			outPutStream.close();
			return lines;
			
		}catch(FileNotFoundException e){
			System.out.println(e.getMessage());
			return lines;
		}
	}

}
