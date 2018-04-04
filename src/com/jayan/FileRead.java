package com.jayan;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		try {
			FileInputStream file = new FileInputStream("D:\\outputfile.txt");
			
			BufferedReader br= new BufferedReader(new InputStreamReader(file));
			
			String str=null;
			for(int i=0; i<=6; i++){
			str=br.readLine();
			if (i>3)
			{
				System.out.println(str);
			}
				
			}
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
