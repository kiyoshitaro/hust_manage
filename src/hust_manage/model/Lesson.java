package hust_manage.model;
import java.util.*;

public class Lesson {
	private String courseId;
	private String lessonId;
	private String teacherId;
	private Teacher teacher;
	private Course course;
	private List<Student> students = new ArrayList<>();

	public Lesson(String lessonId, String courseId, String teacherId){
		this.courseId = courseId;
		this.teacherId = teacherId;
		this.lessonId = lessonId;
	}
	public String getLessonId() {
		return lessonId;
	}
	public void setLessonId(String lessonId) {
		this.lessonId = lessonId;
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public void setStudent(Student student){
		this.students.add(student);
	}

	public void printInfo(){
		System.out.println("Danh sach lop " + this.getLessonId());
		System.out.println("Giao vien cua lop: " + this.getTeacher().getFullName());
		System.out.println("Danh sach sinh vien :");

		for (Student student : this.getStudents()){
			student.printInfo();
		}
	}
}
