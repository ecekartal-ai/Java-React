import java.util.Locale;
import java.util.Scanner;

public class Main {
	static Scanner myScanner = new Scanner(System.in).useLocale(Locale.US);
	
	public static void main(String[] args) {
		int courseID = 1;
		long instructorID = 1;
		long studentID = 1;
		int choice;
		
		CourseManager coursemanager = new CourseManager();
		InstructorManager instructormanager = new InstructorManager();
		StudentManager studentmanager = new StudentManager();
		
		do {
			System.out.printf("\n---Please select an operation---\n"
					+ "1. for add a course\n"
					+ "2. for add an instructor\n"
					+ "3. for add a student\n"
					+ "4. for register a student\n"
					+ "5. for display the course information\n"
					+ "0. for exit\n");
			
			choice = myScanner.nextInt();
			myScanner.nextLine();
			switch(choice) {
			case 1:
				Course course = new Course();
				course.setCourseID(courseID);
				
				System.out.printf("Course Name: ");
				String cName = myScanner.nextLine();
				course.setCourseName(cName);
				
				/*System.out.printf("Instructor: ");
				String sSurname = myScanner.nextLine();
				student.setSurname(sSurname);*/
				
				System.out.printf("Course Content: ");
				String content = myScanner.nextLine();
				course.setCourseContent(content);
				
				coursemanager.addCourse(course);
				courseID++;
				break;
			case 2:
				Instructor instructor = new Instructor();
				instructor.setId(instructorID);
				
				System.out.printf("Instructor Name: ");
				String name = myScanner.nextLine();
				instructor.setName(name);
				
				System.out.printf("Instructor Surname: ");
				String surname = myScanner.nextLine();
				instructor.setSurname(surname);
				
				System.out.printf("Instructor E-mail: ");
				String email = myScanner.nextLine();
				instructor.setEmail(email);
				
				System.out.printf("Course ID: ");
				int cID = myScanner.nextInt();
				myScanner.nextLine();
				
				for(int i=0; i<coursemanager.courses.size(); i++) {
					if(coursemanager.courses.get(i).getCourseID() == cID) {
						coursemanager.courseInstructors.put(coursemanager.courses.get(i), instructor);
					}
				}
				
				instructormanager.addInstructor(instructor);
				instructorID++;
				break;
			case 3:
				Student student = new Student();
				student.setId(studentID);
				
				System.out.printf("Student Name: ");
				String sName = myScanner.nextLine();
				student.setName(sName);
				
				System.out.printf("Instructor Surname: ");
				String sSurname = myScanner.nextLine();
				student.setSurname(sSurname);
				
				System.out.printf("Instructor E-mail: ");
				String sEmail = myScanner.nextLine();
				student.setEmail(sEmail);
				
				studentmanager.addStudent(student);
				studentID++;
				break;
			case 4:
				//register a student into a course
				
				System.out.printf("Enter student id: ");
				long studentIDInput = myScanner.nextLong();
				myScanner.nextLine();
				
				System.out.printf("Enter course id: ");
				int courseIDInput = myScanner.nextInt();
				myScanner.nextLine();
				
				
				for(int i=0; i<studentmanager.students.size(); i++) {
					if(studentmanager.students.get(i).getId() == studentIDInput) {
						for(int j=0; j<coursemanager.courses.size(); j++) {
							if(coursemanager.courses.get(j).getCourseID() == courseIDInput) {
								studentmanager.registerStudent(studentmanager.students.get(i), coursemanager.courses.get(j));
							}
						}
					}
				}
				break;
			case 5:
				//display course info
				
				System.out.printf("Enter course id: ");
				int courseIDInput_1 = myScanner.nextInt();
				myScanner.nextLine();
				
				for(int i=0; i<coursemanager.courses.size(); i++) {
					if(coursemanager.courses.get(i).getCourseID() == courseIDInput_1) {
						coursemanager.printCourseInfo(coursemanager.courses.get(i));
						
					}
				}
				
			}
		} while(!(choice == 0));
		System.out.println("Exited");
	}
}
