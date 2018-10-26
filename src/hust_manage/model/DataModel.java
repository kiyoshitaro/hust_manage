package hust_manage.model;
import java.util.*;
public class DataModel {
	private List<Teacher> teachers =new ArrayList<Teacher>();
	private List<Student> students = new ArrayList<Student>();
	private List<Course> courses = new ArrayList<Course>();
	private List<Lesson> lessons = new ArrayList<Lesson>();
	
	public DataModel() {

		// TEACHER
		this.teachers.add(new Teacher("gv01","Nguyen Thanh Hung",""));
		this.teachers.add(new Teacher("gv02","Huynh Thanh Binh",""));
		this.teachers.add(new Teacher("gv03","Nguyen Xuan Thao",""));
		
		// STUDENT
		this.students.add(new Student("sv01","Nguyen Tuan Hung"));
		this.students.add(new Student("sv02","Nguyen Tuan Hung"));
		this.students.add(new Student("sv03","Nguyen Tuan Hung"));
		this.students.add(new Student("sv04","Nguyen Tuan Hung"));
		this.students.add(new Student("sv05","Nguyen Tuan Hung"));
		this.students.add(new Student("sv06","Le Kha Hai"));
		this.students.add(new Student("sv07","Le Cong Thanh"));
		this.students.add(new Student("sv08","Nguyen Dai Loi"));
		this.students.add(new Student("sv09","A B C"));
		this.students.add(new Student("sv10","Nguyen Hung Cuong"));
		this.students.add(new Student("sv11","Nguyen Tien Tai"));
		this.students.add(new Student("sv12","Nguyen Van A"));
		this.students.add(new Student("sv13","Nguyen Tuan A"));
		this.students.add(new Student("sv15","Nguyen Tuan B"));
		this.students.add(new Student("sv14","Nguyen Tuan C"));
		this.students.add(new Student("sv16","Nguyen Tuan D"));
		this.students.add(new Student("sv17","Nguyen Tuan E"));
		this.students.add(new Student("sv18","Nguyen Tuan F"));
		this.students.add(new Student("sv19","Nguyen Tuan G"));
		this.students.add(new Student("sv20","Nguyen Tuan H"));
		this.students.add(new Student("sv21","Nguyen Tuan Y"));
		this.students.add(new Student("sv22","Nguyen Tuan K"));
		this.students.add(new Student("sv23","Nguyen Tuan L"));
		this.students.add(new Student("sv24","Nguyen Tuan M"));
		this.students.add(new Student("sv25","Nguyen Tuan N"));

		// COURSE
		this.courses.add(new Course("MI1109","OOP",3));
		this.courses.add(new Course("MI1108","CSDL",2));
		this.courses.add(new Course("MI1119","TRR",3));
		this.courses.add(new Course("MI1111","Giai Tich",4));

		// Lesson_1
		this.setUpLesson(new Lesson("lop01","MI1109", "gv01"));
		this.setUpStudentForLesson(this.lessons.get(0),this.students.get(0));
		this.setUpStudentForLesson(this.lessons.get(0),this.students.get(1));
		this.setUpStudentForLesson(this.lessons.get(0),this.students.get(2));
		this.setUpStudentForLesson(this.lessons.get(0),this.students.get(3));
		this.setUpStudentForLesson(this.lessons.get(0),this.students.get(4));
		this.setUpStudentForLesson(this.lessons.get(0),this.students.get(5));
		this.setUpStudentForLesson(this.lessons.get(0),this.students.get(6));
		this.setUpStudentForLesson(this.lessons.get(0),this.students.get(7));
		this.setUpStudentForLesson(this.lessons.get(0),this.students.get(8));
		this.setUpStudentForLesson(this.lessons.get(0),this.students.get(9));
		this.setUpStudentForLesson(this.lessons.get(0),this.students.get(10));

		// Lesson_2
		this.setUpLesson(new Lesson("lop02","MI1119", "gv02"));
		this.setUpStudentForLesson(this.lessons.get(1),this.students.get(9));
		this.setUpStudentForLesson(this.lessons.get(1),this.students.get(10));
		this.setUpStudentForLesson(this.lessons.get(1),this.students.get(11));
		this.setUpStudentForLesson(this.lessons.get(1),this.students.get(12));
		this.setUpStudentForLesson(this.lessons.get(1),this.students.get(13));
		this.setUpStudentForLesson(this.lessons.get(1),this.students.get(14));
		this.setUpStudentForLesson(this.lessons.get(1),this.students.get(15));
		this.setUpStudentForLesson(this.lessons.get(1),this.students.get(16));
		this.setUpStudentForLesson(this.lessons.get(1),this.students.get(17));
		this.setUpStudentForLesson(this.lessons.get(1),this.students.get(18));
		this.setUpStudentForLesson(this.lessons.get(1),this.students.get(19));
		this.setUpStudentForLesson(this.lessons.get(1),this.students.get(20));
		this.setUpStudentForLesson(this.lessons.get(1),this.students.get(21));

		this.setUpLesson(new Lesson("lop03","MI1111", "gv03"));
		this.setUpStudentForLesson(this.lessons.get(2),this.students.get(9));
		this.setUpStudentForLesson(this.lessons.get(2),this.students.get(12));
		this.setUpStudentForLesson(this.lessons.get(2),this.students.get(13));
		this.setUpStudentForLesson(this.lessons.get(2),this.students.get(16));
		this.setUpStudentForLesson(this.lessons.get(2),this.students.get(17));
		this.setUpStudentForLesson(this.lessons.get(2),this.students.get(22));
	}

	public void setUpLesson(Lesson lesson){
		for (Course course : this.courses){
			if(course.getCourseId() == lesson.getCourseId()){
				course.setLesson(lesson);
				lesson.setCourse(course);
			}
		}
		for (Teacher teacher : this.teachers){
			if(teacher.getIdNumber() == lesson.getTeacherId()){
				teacher.setLesson(lesson);
				lesson.setTeacher(teacher);	
			}
		}
		this.lessons.add(lesson);
	}
	public void setUpStudentsForLesson(Lesson lesson , List<Student> students){
		lesson.setStudents(students);
		for (Student student: students){
			student.setLesson(lesson);
		}
	}
	public void setUpStudentForLesson(Lesson lesson ,Student student){
		lesson.setStudent(student);
		student.setLesson(lesson);
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
	public List<Lesson> getLessons() {
		return lessons;
	}
	public void setLessons(List<Lesson> lessons) {
		this.lessons = lessons;
	}

	public void printLessonInfo() {
		for (Lesson lesson : lessons) {
			lesson.printInfo();
		}
	}
	
}
