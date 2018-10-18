// import hust_manage.model.*;
import hust_manage.model.*;
import java.util.*;
// import hust_manage.model.Teacher;
// import hust_manage.model.Student;

public class Main {
	private static DataModel data = new DataModel();

	public static void printList(Lesson lesson){

		System.out.println("Giao vien cua lop: " + lesson.getTeacher().getFullName());
		System.out.println("Danh sach sinh vien :");

		for (Student student : lesson.getStudents()){
			System.out.println("Sinh vien " + student.getFullName() + " MSSV: " + student.getIdNumber());
		}
	}

	public static List<Lesson> getLessonsFromTeacher(String teacherId){
		for (Teacher teacher : data.getTeachers()){
			if(teacher.getIdNumber() == teacherId){
				return teacher.getLessons();
			}
		}
		return null;
	}

	public static void showListFromTeacher(String teacherId){
		List<Lesson> lessons = getLessonsFromTeacher(teacherId);
		for (Lesson lesson : lessons){
			printList(lesson);
			System.out.println("-------------------------------");

		}
	}
	
	public static List<Lesson> getLessonsFromStudent(String studentId){
		for (Student student : data.getStudents()){
			if(student.getIdNumber() == studentId){
				return student.getLessons();
			}
		}
		return null;
	}
	public static void showListFromStudent(String studentId){
		List<Lesson> lessons = getLessonsFromStudent(studentId);
		for (Lesson lesson : lessons){
			printList(lesson);
			System.out.println("-------------------------------");

		}
	}

	public static void main(String[] args) {
		
		// Course data = new Course("as","Hung", 3);
		// DataModel data = new DataModel();
		// Class tees = new Class("IT1234", "1234");
		showListFromStudent("sv01");
	}
}
