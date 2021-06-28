package SEE.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT")

public class Student {
	
	@Id @GeneratedValue
	@Column(name="STUDENT_ROLL",nullable=false)
	private int student_roll;
	
	@Column(name="STUDENT_FNAME",nullable=false)
	private String student_fname;

	public int getStudent_roll() {
		return student_roll;
	}

	public void setStudent_roll(int student_roll) {
		this.student_roll = student_roll;
	}

	public String getStudent_fname() {
		return student_fname;
	}

	public void setStudent_fname(String student_fname) {
		this.student_fname = student_fname;
	}
	
	

}	
	

