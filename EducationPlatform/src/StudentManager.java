import java.util.ArrayList;
import java.util.HashMap;

public class StudentManager { 

	ArrayList<Student> students = new ArrayList<Student>();
	HashMap<Student, HashMap<Course, Integer>> registeredCourses = new HashMap<Student, HashMap<Course, Integer>>();

	public void addStudent(Student student) {
		students.add(student);
		System.out.printf("Student has been added\n");
	}

	public void registerStudent(Student student, Course course) {
		HashMap<Course, Integer> temp = new HashMap<Course, Integer>();
		temp.put(course, 0);
		registeredCourses.put(student, temp);
		System.out.printf("Student has been registered\n");
	}

}
