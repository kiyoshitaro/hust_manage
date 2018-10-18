package hust_manage.model;
import java.util.Date;
	
public class HustPerson {
	protected String idNumber;	
	protected String fullName;
	protected Date birthDay;
	public HustPerson(String idNumber, String fullName) {
		this.idNumber = idNumber;
		this.fullName = fullName;
	}
	public String getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Date getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
	
}
