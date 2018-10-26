// import hust_manage.model.*;
import hust_manage.model.*;
import java.util.*;
// import hust_manage.model.Teacher;
// import hust_manage.model.Student;

public class Main {
	private static DataModel data = new DataModel();


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
			lesson.printInfo();
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
			lesson.printInfo();
			System.out.println("-------------------------------");
		}
	}

	public static List<Lesson> getLessonsFromCourse(String courseId){
		for (Course course : data.getCourses()){
			if(course.getCourseId() == courseId){
				return course.getLessons();
			}
		}
		return null;
	}
	public static void showListFromCourse(String courseId){
		List<Lesson> lessons = getLessonsFromCourse(courseId);
		for (Lesson lesson : lessons){
			lesson.printInfo();
			System.out.println("-------------------------------");
		}
	}

	public static void main(String[] args) {
		
		// showListFromStudent("sv10");
		// showListFromTeacher("gv01");
		showListFromCourse("MI1111");
	}
}
