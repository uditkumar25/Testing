package JavaPoint;

import java.util.Scanner;

public class string1 {

	public static void main(String[] args) {

		  Scanner scanner = new Scanner(System.in);
	        System.out.print("Original string : ");
	 
	        String originalStr = scanner.nextLine();
	        scanner.close();
	 
	        String words[] = originalStr.split("\\s");
	        String reversedString = "";
	 
	        //Reverse each word's position
//	        for (int i = 0; i < words.length; i++) { 
//	            if (i == words.length - 1) 
//	                reversedString = words[i] + reversedString; 
//	            else
//	                reversedString = " " + words[i] + reversedString; 
//	        } 
	        for (int i =  words.length-1; i >=0; i--) { 
	        	reversedString =  reversedString +" " +words[i]; 
	        	
	        }
	        
	        reversedString = reversedString.trim();
	        // Displaying the string after reverse
	        System.out.print("Reversed string : " + reversedString);

	}

}
