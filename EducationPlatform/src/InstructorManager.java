import java.util.ArrayList;

public class InstructorManager {
	
	ArrayList<Instructor> instructors = new ArrayList<Instructor>();
	
	public void addInstructor(Instructor instructor) {
		instructors.add(instructor);
		System.out.printf("Instructor has been added\n");
	}
	
	public void printInstructorInfo(Instructor instructor) {
		System.out.printf(instructor.getName() + " " + instructor.getSurname());
	}
}
