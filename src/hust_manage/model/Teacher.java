package hust_manage.model;
import java.util.*;

public class Teacher extends HustPerson {
	private String department;
	private List<Lesson> lessons = new ArrayList<Lesson>();

	public Teacher(String teacherId, String teacherName, String department) {
		super(teacherId, teacherName);
		this.department = department;
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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
}
