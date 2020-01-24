
public class MVCPattern {

public static void main(String[] args) {

Student model= retriveStudentFromDatabase();
Student view=new StudentView();

StudentController controller=new StudentController(model,view);

controller.updateView();

controller.setStudent("anan");
controller.updateView();
}
private static Student retriveStudentFromDatabase() {
	Student student=new Student();
	student.setName("Robert");
    student.setRollNo("10");
    return student;
}
	
}

