package Mavenfirdt.ExtentReport;

 class Student{
	int rollno;
	String name;
	
	public void record(int r,String n) {
		rollno=r;
		name=n;
	}
	
	public void dislpay(){
		System.out.println(rollno+" "+name);
	}
	
}
public class JavaT {

	public static void main(String[] args) {
    Student s1 = new Student();
    Student s2 = new Student();
    s1.record(10, "Hello");
    s2.record(20, "Hi");
    
    s1.dislpay();
    s2.dislpay();
    
	}

}


