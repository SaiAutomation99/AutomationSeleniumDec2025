package util;

import java.util.Base64;

public class Encoder_Decorder {
	
	
	public String deCoderInput(String name) {
		
		
		byte[] bty=Base64.getDecoder().decode(name);
		
		String str=new String(bty);
		
	
		return str;
		
	}
	/*
	
	public static void main(String[] args) {
		
		String input="";
		 String encodedValue = Base64.getEncoder().encodeToString(input.getBytes());
		    System.out.println("Base64 Encoded Value: " + encodedValue);
	}
    
	*/
 

}
