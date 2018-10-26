package hust_manage.model;
import java.util.*;
public class Student extends HustPerson {
	private String major;
	private String program;
	private List<Lesson> lessons = new ArrayList<Lesson>();


	public Student(String studentId, String studentName, String major, String program) {
		super(studentId, studentName);
		this.major = major;
		this.program = program;
	}
	public Student(String studentId, String studentName) {
		super(studentId, studentName);
	}
	public void setLesson(Lesson lesson){
		this.lessons.add(lesson);
	}
	public void setLessons(List<Lesson> lessons){
		this.lessons = lessons;
	}
	public List<Lesson> getLessons(){
		return this.lessons;
	}


	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public void printInfo() {
		System.out.println("Sinh vien " + this.getFullName() + " MSSV: " + this.getIdNumber());
	}
}
