package hust_manage.model;
import java.util.*;
public class DataModel {
	private List<Teacher> teachers =new ArrayList<Teacher>();
	private List<Student> students = new ArrayList<Student>();
	private List<Course> courses = new ArrayList<Course>();
	
	public DataModel() {
		this.teachers.add(new Teacher('111','Nguyen Thanh Hung',''));
		this.teachers.add(new Teacher('112','Huynh Thanh Binh',''));
		this.teachers.add(new Teacher('113','Huynh Quyet Thang',''));
		
		this.students.add(new Student('2014','Nguyen Tuan Hung'));
		this.students.add(new Student('2016','Nguyen Tuan Hung'));
		this.students.add(new Student('2017','Nguyen Tuan Hung'));
		this.students.add(new Student('2018','Nguyen Tuan Hung'));
		this.students.add(new Student('2019','Nguyen Tuan Hung'));
		this.students.add(new Student('2020','Nguyen Tuan Hung'));
		this.students.add(new Student('2021','Nguyen Tuan Hung'));
		this.students.add(new Student('2022','Nguyen Tuan Hung'));
		this.students.add(new Student('2023','Nguyen Tuan Hung'));
		this.students.add(new Student('2024','Nguyen Tuan Hung'));
		this.students.add(new Student('2025','Nguyen Tuan Hung'));
		this.students.add(new Student('2026','Nguyen Tuan Hung'));
		this.students.add(new Student('2027','Nguyen Tuan Hung'));
		this.students.add(new Student('2028','Nguyen Tuan Hung'));
		this.students.add(new Student('2029','Nguyen Tuan Hung'));
		this.students.add(new Student('2030','Nguyen Tuan Hung'));
		this.students.add(new Student('2031','Nguyen Tuan Hung'));
		
		this.courses.add(new Course('MI1109','OOP',3));
		this.courses.add(new Course('MI1108','CSDL',2));
		this.courses.add(new Course('MI1119','TRR',3));
		this.courses.add(new Course('MI1111','Giai Tich',4));

		


	}
	public List<Teacher> getTeachers() {
		return teachers;
	}
	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	
}
