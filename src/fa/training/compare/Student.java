package fa.training.compare;

import java.util.Date;

public class Student implements Comparable<Student> {
	private int studentID;
	private String name;
	private Date birthDate;
	private double markAvg;

	public Student(int studentID, String name, Date birthDate, double markAvg) {
		super();
		this.studentID = studentID;
		this.name = name;
		this.birthDate = birthDate;
		this.markAvg = markAvg;
	}

	public Student() {

	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public double getMarkAvg() {
		return markAvg;
	}

	public void setMarkAvg(double markAvg) {
		this.markAvg = markAvg;
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", name=" + name + ", birthDate=" + birthDate + ", markAvg="
				+ markAvg + "]";
	}

	@Override
	public int compareTo(Student student) {
		return (int) (this.getMarkAvg() - student.getMarkAvg());
	}
}
