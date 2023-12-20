package main;
import child.Doctor;
import child.Teacher;
import parents.Person;
import child.Programmer;

public class AppMain {

	public static void main(String[] args) {
		Person person1 = new Person();
		person1.setName("Rizki");
		person1.setAddress("Bandung");
		
		System.out.println(person1.getName());
		System.out.println(person1.getAddress());
	}
	
	static void sayHello(Person person) {
		/*String message;
		if (person instanceof Programmer) {
			Programmer programmer = (Programmer) person;
			message = "Hello, " + programmer.getName() + ". Seorang Programmer" + 
			programmer.getTechnology() + ".";
		} else if (person instanceof Teacher) {
			Teacher teacher = (Teacher) person;
			message = "Hello, " + teacher.getName() + ". Seorang Guru" + 
			teacher.getSubject() + ".";
		}else if (person instanceof Doctor) {
			Doctor doctor = (Doctor) person;
			message = "Hello, " + doctor.getName() + ". Seorang Doktor" + 
			doctor.getName() + ".";
			
		}else {
			message = "Hello, " + person.getName() + ".";
		}
		System.out.println(message);*/
	}

}
