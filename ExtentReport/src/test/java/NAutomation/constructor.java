package NAutomation;

public class constructor {
	
	String name;
	int age;
	
	public constructor() {
		System.out.println("Default");
	}
	
	public constructor(int i) {
		System.out.println(i);
	}
	public constructor(String name,int age) {
		this.name=name;
		this.age=age;
		//System.out.println(name+ ":"+age);
	}

	public static void main(String[] args) {
		constructor ob = new constructor();
		constructor ob1 = new constructor(15);
		constructor ob2 = new constructor("Hello",15);
		constructor ob3 = new constructor("Hello1",19);
		
		System.out.println(ob2.age);
		System.out.println(ob2.name);
		System.out.println(ob3.age);
		System.out.println(ob3.name);

	}

}
