package JavaPoint;

import java.util.Scanner;

public class pattern {
	
	public static void Sum(int... x) {
		int total =0;
		for(int y:x) {
			
			total = total+y;
		}
		System.out.println(total);
	}

	public static void main(String[] args) {
	Sum();
	Sum(10,20);
	Sum(10,20,30);
	Sum(10,20,4,6);

		}
	}

