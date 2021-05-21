package Mavenfirdt.ExtentReport;

import java.util.Scanner;

public class Primeno {

	public static void main(String[] args) {
	
		int temp,num;
		boolean isPrime=true;
		Scanner sc = new Scanner(System.in);
		num =sc.nextInt();
		sc.close();
		for(int i=2;i<=num/2;i++) {	
			temp = num%i;
			if(temp==0) {
				isPrime=false;
				break;
			}
			
		}
		if(isPrime)
			System.out.println(num + " number is Prime no");
		else
			System.out.println(num + " number is not a Prime no");
	}

}
