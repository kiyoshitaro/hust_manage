package hust_manage.model;

public class Student extends HustPerson {
	private String major;
	private String program;

	public Student(String studentId, String studentName, String major, String program) {
		super(studentId, studentName);
		this.major = major;
		this.program = program;
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
}
