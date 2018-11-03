package hust_manage.model;
import java.util.*;

public class Project{
    private String projectId;
    private String teacherId;
    private Teacher teacher;
    private List<Student> students = new ArrayList<Student>();

    public Project(String projectId, String teacherId){
        this.projectId = projectId;
        this.teacherId = teacherId;
    }
    public String getTeacherId(){
        return this.teacherId;
    }
    public void setTeacherId(String teacherId){
        this.teacherId = teacherId;
    }
    public void setTeacher(Teacher teacher){
        this.teacher = teacher;
    }
    public Teacher getTeacher(){
        return this.teacher;
    }
    public List<Student>  getStudents(){
        return this.students;
    }
    public void setStudent(Student student){
        this.students.add(student);
    }
    public void setStudents(List<Student> students){
        this.students = students;
    }


};