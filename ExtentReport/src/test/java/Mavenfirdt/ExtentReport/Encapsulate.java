package Mavenfirdt.ExtentReport;

public class Encapsulate { 
    // private variables declared  
    // these can only be accessed by  
    // public methods of class 
    private String geekName; 
    private int geekRoll; 
    private int geekAge; 
  
      public int getAge()  
    { 
      return geekAge; 
    } 
   
     public String getName()  
    { 
      return geekName; 
    } 

    public void setAge( int newAge) 
    { 
      geekAge = newAge; 
    } 

    public void setName(String newName) 
    { 
      geekName = newName; 
    } 

    public int getRoll() {
		// TODO Auto-generated method stub
	       return geekRoll; 
	}

	public void setRoll(int newRoll) {
		// TODO Auto-generated method stub
		 geekRoll = newRoll; 
		
	} 
} 
