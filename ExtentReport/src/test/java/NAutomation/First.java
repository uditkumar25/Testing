package NAutomation;

public class First {
	

	public static void main(String[] args) {
	
		String st = "Hello How are you";
		String []qw = st.split(" ");
		
	
		String a="";
		for(String q:qw) {
			for(int i=q.length()-1;i>=0;i--) {		
				a = a+q.charAt(i);		
			}
			a = a+" ";
			
		}
		
		System.out.println(a);
	}

}
