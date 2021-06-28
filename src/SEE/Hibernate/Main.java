package SEE.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;



public class Main {

	public static void main(String[] args) {

		Student std1 = new Student();
		std1.setStudent_fname("Tejas");
		
		Student_Details sd1 = new Student_Details();
		sd1.setCrse1("50");
		sd1.setCrse2("70");
		sd1.setCrse3("65");
		sd1.setCrse4("77");
		sd1.setCrse5("87");
		sd1.setCrse6("66");
		
		Student std2 = new Student();
		std2.setStudent_fname("Siddant");
		
		Student_Details sd2 = new Student_Details();
		sd2.setCrse1("45");
		sd2.setCrse2("88");
		sd2.setCrse3("42");
		sd2.setCrse4("66");
		sd2.setCrse5("99");
		sd2.setCrse6("15");
		
		Student std3 = new Student();
		std3.setStudent_fname("Rajat");
		
		Student_Details sd3 = new Student_Details();
		sd3.setCrse1("67");
		sd3.setCrse2("55");
		sd3.setCrse3("44");
		sd3.setCrse4("66");
		sd3.setCrse5("98");
		sd3.setCrse6("87");
		
		sd1.setStudent(std1);
		sd2.setStudent(std2);
		sd3.setStudent(std3);
		
		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(sd1);
		session.save(sd2);
		session.save(sd3);
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();

	}

}
