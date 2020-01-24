import java.security.Signature;

/*
class SingleObject{	
	private static SingleObject instance =new SingleObject();
// create constructor
	public static SingleObject getInstance() {	
		return instance;
	}
	public void showMessage() {
		System.out.println("Hello World");	}  
}
public class SingletonPatternDemo {

	public static void main(String[] args) {
		SingleObject object=SingleObject.getInstance();
		object.showMessage();
	}
	public static void main(String[] args) {	
	}
}     


// Normal Version
// Normal Version
// Normal Version
// Normal Version


class Signleton{
	
	private static Signleton single_intance=null;
	
	public String s;
	private Signleton() {
		
		s="Hello I am string part of Singleton class";
		
	}
	public static Signleton getInstance() {
		
		if(single_intance==null) {
			single_intance=new Signleton();
		}
		return single_intance;
	    }
}

public class SingletonPatternDemo{
	
	public static void main(String[] args) {
		
		Signleton x= Signleton.getInstance();
	    Signleton y= Signleton.getInstance();
	    Signleton z= Signleton.getInstance();
	    x.s=(x.s).toUpperCase();
	    System.out.println("String from x is :"+x.s);
	    System.out.println("String from y is :"+y.s);
	    System.out.println("String from z is :"+z.s);
	    
	    System.out.println("\n");
	    
	    z.s=(z.s).toLowerCase();
	    System.out.println("String from x is :"+x.s);
	    System.out.println("String from y is :"+y.s);
	    System.out.println("String from z is :"+z.s);
	    
	}
}

 */
//Normal Version// Normal Version// Normal Version// Normal Version// Normal Version

// with pattern version with pattern version with pattern version 
class Singleton{
	
	
	private static Singleton single_instance=null;
	public String s;
	private Singleton() {
		
		s="Hello I am  string part of Singleton Class";
		
	}
	
	public static Singleton Singleton() {
		if(single_instance==null) {		
		single_instance=new Singleton();
		}
		return single_instance;
	}
}

class SingletonPatternDemo{
	
	public static void main(String[] args) {
		Singleton x=Singleton.Singleton();
		Singleton y=Singleton.Singleton();
		Singleton z=
		
	}
}