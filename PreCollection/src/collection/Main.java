package collection;

class Main { 
	public static void main(String[] args) {
		
			       InnerOuterClass.Inner in = new  InnerOuterClass().new Inner(); 
			       in.show(); 
			   } 
	}

/*This is ex for local inner class
 * class Outer { 
    void outerMethod() { 
        System.out.println("inside outerMethod"); 
        // Inner class is local to outerMethod() 
        class Inner { 
            void innerMethod() { 
                System.out.println("inside innerMethod"); 
            } 
        } 
        Inner y = new Inner(); 
        y.innerMethod(); 
    } 
} 
class MethodDemo { 
    public static void main(String[] args) { 
        Outer x = new Outer(); 
        x.outerMethod(); 
    } 
}  */
