
public class StudentController {

	private Student model;
	private Student view;
	public StudentController( Student model,Student view2) {
		
		this.model=model;
		this.view=view2;
		
	}
	
	public void setStudent(String name) {
		
		model.setName(name);
		
	}
	
	public String  getStudentName() {
		
		return model.getName();
	
	}
	public void setStudentRoll(String rollNo) {
		
		model.setRollNo(rollNo);
		
	}
	public String getStudentRollNo() {
		
		return model.getRollNo();
		
	}
	
	
	public void updateView() {
		
		view.printStudentDetails(model.getName(), model.getRollNo());
		
	}
	
}
