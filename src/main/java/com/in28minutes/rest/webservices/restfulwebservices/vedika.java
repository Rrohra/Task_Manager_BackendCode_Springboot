package com.in28minutes.rest.webservices.restfulwebservices;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Base64;

import javax.imageio.ImageIO;

public class vedika {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\rrroh\\OneDrive\\Desktop\\vedika\\carousel4.txt");
		String st="rohit";
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			st=br.readLine();
			System.out.println(st);
			try {
	        byte[] image =Base64.getDecoder().decode(st);
	        vedika r =new vedika();
			r.writeByteToImageFile(image, "carousel4.jpg");
			}
			catch(NullPointerException e){
				System.out.println("sain");
			}
	        
			} 
		catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("Saved the base64 as image in current directory with name image.png");  
   
}


public void writeByteToImageFile(byte[] imgBytes, String imgFileName) throws IOException 
{  
 File imgFile = new File(imgFileName);  
 BufferedImage img = ImageIO.read(new ByteArrayInputStream(imgBytes));  
 ImageIO.write(img, "jpg", imgFile);  
}  
	
}
