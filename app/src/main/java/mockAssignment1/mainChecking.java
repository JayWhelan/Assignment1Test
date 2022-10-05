package mockAssignment1;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;



/**
 *
 * @author Joshua Whelan 19403264
 */
public class mainChecking {
    private static ModuleClass module1, module2;
	private static Student student1,student2,student3,student4,student5;
	private static Lecturer lecturer1,lecturer2;
	private static CourseProgramme courseMain;
	
	public static void main(String[] args) {
		System.out.println("Setting up Mock Data");
		
		 List<ModuleClass> modules = new ArrayList<ModuleClass>();
		 List<Student> students = new ArrayList<Student>();
		 List<CourseProgramme> courses = new ArrayList<CourseProgramme>();
		 
		 lecturer1 = new Lecturer("Charlie", 42, "10/11/94", 424, null, "IT102");
		 lecturer2 = new Lecturer("james", 35, "13/08/24", 314, null, "IT212");
		 
		 module1 = new ModuleClass("Database", lecturer1, "CT22", null, null, "IT122");
		 module2 = new ModuleClass("Software", lecturer2, "CT74", null, null, "IT245");
		 
		 student1 = new Student("James", 19, "10/11/2001", 4413, null, null);
		 student2 = new Student("Oisin", 20, "21/11/2000", 4416, null, null);
		 student3 = new Student("Chalie", 20, "19/12/2000", 7234, null, null);
		 student4 = new Student("Emily", 21, "16/06/2000", 4623, null, null);
		 student5 = new Student("Jermey", 19, "11/03/2001", 8463, null, null);
		 
		 DateTime dt1 = new DateTime("2020-12-13T21:39:45.618-08:00");
		 DateTime dt2 = new DateTime("2021-12-13T21:39:45.618-08:00");
		 
		 courseMain = new CourseProgramme("Computers", null, null, dt1, dt2);
		 
		 module1.addStudent(student1);
		 module1.addStudent(student2);
		 module1.addStudent(student3);
		 module1.addCourses(courseMain);
		 
		 module2.addStudent(student3);
		 module2.addStudent(student4);
		 module2.addStudent(student5);
		 
		 courseMain.addStudent(student1);
		 courseMain.addStudent(student2);
		 courseMain.addStudent(student3);
		 courseMain.addStudent(student4);
		 courseMain.addStudent(student5);
		 
		 courseMain.addModule(module1);
		 courseMain.addModule(module2);
		 
		 lecturer1.addModule(module1);
		 lecturer2.addModule(module2);
		 
		 student1.addCourse(courseMain);
		 student2.addCourse(courseMain);
		 student3.addCourse(courseMain);
		 student4.addCourse(courseMain);
		 student5.addCourse(courseMain);
		 student1.addModule(module1);
		 student2.addModule(module1);
		 student3.addModule(module1);
		 student3.addModule(module2);
		 student4.addModule(module2);
		 student5.addModule(module2);
		 
		 System.out.println("\n------COURSE------");
		 System.out.println(courseMain);
		 
		 System.out.println("----STUDENTS------");
		 System.out.println(student1);
		 System.out.println(student2);
		 System.out.println(student3);
		 System.out.println(student4);
		 System.out.println(student5);
	}
	
	
}
