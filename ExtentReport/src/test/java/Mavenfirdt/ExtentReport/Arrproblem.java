package Mavenfirdt.ExtentReport;

public class Arrproblem {

	public static void main(String[] args) {
		int[] my_array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
		int max = getmax(my_array);
		System.out.println("Max value is : " + max);

		int min = getmin(my_array);
		System.out.println("Max value is : " + min);

	}
	public static int getmax(int[] a) {
		
		int maxvalue=a[0];
		for(int i=0;i<a.length;i++) {
		if(a[i]>maxvalue) {
			maxvalue=a[i];
			
		}
		}		
		return maxvalue;
	}
	
public static int getmin(int[] a) {
		
		int minvalue=a[0];
		for(int i=0;i<a.length;i++) {
		if(a[i]<minvalue) {
			minvalue=a[i];
			
		}
		}		
		return minvalue;
	}
	
	

}