
public class OverloadingExample {
	
	int a = 8;
	
	// constructor don't have return type and method have return type;
	// constructor is always use for assigning variables.
	public OverloadingExample() {
		
	}
	
	public OverloadingExample(int a) {
        System.out.println(" int const");
	}
	
    public OverloadingExample(Integer a) {
    	System.out.println(" Integer const");
    }
	
    public OverloadingExample(String s) {
    	
    } 
    
    public OverloadingExample(float a) {
    	
    }
    
	
    public void myMethod() {
    	System.out.println("a : "+a);
    }
}
