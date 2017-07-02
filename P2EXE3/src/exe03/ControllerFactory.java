package exe03;

public class ControllerFactory {
	public static Controller createController(String type) throws Exception{
		
		Object model = null;
		Object view = null;
		
		if (type == "student"){
			model = retriveStudentFromDatabase();
			view = new StudentView();
		}
		else if (type == "professor"){
			model = retriveProfessorFromDatabase();
			view = new ProfessorView();
		}
		else{
			throw new IllegalArgumentException("Unrecognized type");
		}
		
		return new Controller(model, view);
	}

	private static Student retriveStudentFromDatabase() {
		Student student = new Student();
		student.setName("Robert");
		student.setRollNo("10");
		return student;
	}

	private static Professor retriveProfessorFromDatabase() {
		Professor prof = new Professor();
		prof.setName("Alan");
		prof.setRollNo("02");
		return prof;
	}
}
