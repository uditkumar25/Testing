package Mavenfirdt.ExtentReport;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		int sum=0,temp,r,n;
		
		Scanner sc = new Scanner(System.in);
		n =sc.nextInt();
		sc.close();
		temp=n;
		while(n>0) {
			r=n%10;
			sum = sum*10 + r;
			n=n/10;		
			
		}
		if(temp==sum)
			System.out.println(temp+ " is a Palindrome no");
			else
				System.out.println(temp+" is not a Palindrome no");
		}

}
