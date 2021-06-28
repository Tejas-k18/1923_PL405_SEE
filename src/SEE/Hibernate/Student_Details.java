package SEE.Hibernate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="STUDENT_DETAILS")

public class Student_Details {
	
	@Id @GeneratedValue(generator="newGenerator")
	@GenericGenerator(name="newGenerator" , strategy="foreign" ,parameters ={@Parameter(value = "student" , name="property")})
	private int student_roll;
	
	@Column(name="COURSE_1",nullable=true)
	private String crse1;
	
	@Column(name="COURSE_2",nullable=true)
	private String crse2;
	
	@Column(name="COURSE_3",nullable=true)
	private String crse3;
	
	@Column(name="COURSE_4",nullable=true)
	private String crse4;
	
	@Column(name="COURSE_5",nullable=true)
	private String crse5;
	
	@Column(name="COURSE_6",nullable=true)
	private String crse6;
	

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "student_roll")
	private Student student;
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getCrse1() {
		return crse1;
	}

	public void setCrse1(String crse1) {
		this.crse1 = crse1;
	}

	public String getCrse2() {
		return crse2;
	}

	public void setCrse2(String crse2) {
		this.crse2 = crse2;
	}

	public String getCrse3() {
		return crse3;
	}

	public void setCrse3(String crse3) {
		this.crse3 = crse3;
	}

	public String getCrse4() {
		return crse4;
	}

	public void setCrse4(String crse4) {
		this.crse4 = crse4;
	}

	public String getCrse5() {
		return crse5;
	}

	public void setCrse5(String crse5) {
		this.crse5 = crse5;
	}

	public String getCrse6() {
		return crse6;
	}

	public void setCrse6(String crse6) {
		this.crse6 = crse6;
	}


	
}
