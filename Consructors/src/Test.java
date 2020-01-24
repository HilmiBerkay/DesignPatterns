
class Student{
	
	private int id;
	private String name;
	private String address;
public Student setId(int id) {
	this.id=id;
	return this;	
}
public Student setName(String name) {
	this.name=name;
	return this;
}
public Student setAddress(String address) {
	this.address=address;
	return this;	
}
public String toString() {
	return "id="+this.id+",name="+this.name+",address="+this.address;	
}
}
public class Test {

public static void main(String[] args) {
	Student student1=new Student();
	Student student2=new Student();
	
	student1.setId(1).setName("ram").setAddress("Noida");
	student2.setId(2).setName("Shyam").setAddress("Delhi");
	


	System.out.println(student1);
	System.out.println(student2);
	
}	
	
}
