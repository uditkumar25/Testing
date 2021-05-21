package Mavenfirdt.ExtentReport;

import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {

    int q[] = {2,1,-5,4,6,3};
    int w=q.length;
    for(int i=0;i<w-1;i++) {
    	for(int j=0;j<w-1-i;j++) {
    		
    		if(q[j+1]<q[j]) {
    			int temp = q[j+1];
    			q[j+1]=q[j];
    			q[j]=temp;
    			
    		}
    	}
    	
    }for(int item:q) {
    	System.out.print(item+" ");
    }
    	 
     
		
	}
	}
