package com.scp.exceptionHandling;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileReader;
import java.io.IOException;
public class TryWithResourceDemo {

	public static void main(String[] args) throws Exception {
		String line=null;
		try(BufferedReader br=new BufferedReader(new FileReader("E:\\que.txt"))){
			//br=new BufferedReader(new FileReader("E:\\abc.txt"));
			line=br.readLine();
			if(line==null)
				throw new MyException("file doesn't contain any data...");
			else{
			while(line!=null){
				System.out.println(line);
				line=br.readLine();
			}
				
			}
	}

	}
}
class MyException extends Exception{
	public MyException(String msg) {
		super(msg);
	}
	
}