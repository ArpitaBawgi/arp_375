package collection;

public class Test {
	    public static void main(String[] args) 
	    { 
	        Integer i = new Integer(5); 
	  
	        // prints true as i is instance of class 
	        // Integer 
	        System.out.println(i instanceof Integer); 
	    } 
	} 

//Isinstance() and "instanceof" both return a boolean value
//Now if we want to check the class of the object at run time, then we must use isInstance() method.

//instanceof operator and isInstance() method both are used for checking the class of the object.
//But main difference comes when we want to check the class of object dynamically.
//In this case isInstance() method will work. There is no way we can do this by instanceof operator.