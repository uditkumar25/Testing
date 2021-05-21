package NAutomation;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylistconcept {

	public static void main(String[] args) {
	
				
		employee e1 = new employee("Naveen", 1, 3);
		employee e2 = new employee("Naveen", 1, 3);
		
		ArrayList<employee> er = new ArrayList<employee>();
		er.add(e1);
		er.add(e2);
		System.out.println(er);
		Iterator<employee> it =er.iterator();
		while(it.hasNext()) {
			employee emp = it.next();
			System.out.println(emp.classname);
			System.out.println(emp.name);
			System.out.println(emp.rollno);
		
			
		}

	}

}
