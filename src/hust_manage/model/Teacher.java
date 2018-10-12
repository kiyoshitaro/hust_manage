package hust_manage.model;

public class Teacher extends HustPerson {
	private String department;

	public Teacher(String teacherId, String teacherName, String department) {
		super(teacherId, teacherName);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
}
