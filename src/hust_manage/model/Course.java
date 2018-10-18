package hust_manage.model;
import java.util.*;
public class Course {
	private String courseId;
	private String courseName;
	private int credit;
	private List<Lesson> lessons = new ArrayList<Lesson>();

	public Course(String courseId, String courseName, int credit) {
		this.courseId = courseId;
		this.courseName = courseName;
		this.credit = credit;
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

	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}


}
