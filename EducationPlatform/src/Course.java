
public class Course {
	private int courseID;
	private String courseName;
	private Instructor courseInstructor;
	private String courseContent;
	
	public Course() {
		
	}
	
	public Course(int courseID, String courseName, Instructor courseInstructor, String courseContent) {
		super();
		this.courseID = courseID;
		this.courseName = courseName;
		this.courseInstructor = courseInstructor;
		this.courseContent = courseContent;
	}
	

	public int getCourseID() {
		return courseID;
	}

	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Instructor getCourseInstructor() {
		return courseInstructor;
	}

	public void setCourseInstructor(Instructor courseInstructor) {
		this.courseInstructor = courseInstructor;
	}

	public String getCourseContent() {
		return courseContent;
	}

	public void setCourseContent(String courseContent) {
		this.courseContent = courseContent;
	}
}
