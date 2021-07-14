import java.util.ArrayList;
import java.util.HashMap;

public class CourseManager {
	
	ArrayList<Course> courses = new ArrayList<Course>();
	HashMap<Course, Instructor> courseInstructors = new HashMap<Course, Instructor>();
	
	public void addCourse(Course course) {
		courses.add(course);
		System.out.printf("Course has been added\n");
	}
	
	public void printCourseInfo(Course course) {
		System.out.printf("\nCourse ID: ", course.getCourseID()
				+ "\nCourse Name: ", course.getCourseName()
				+ "\nCourse Content: \n", course.getCourseContent());
	}
	
	public void courseInstructor(Course course, Instructor instructor) {
		courseInstructors.put(course, instructor);
	}
}
