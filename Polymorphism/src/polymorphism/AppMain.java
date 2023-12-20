package polymorphism;

public class AppMain {

	public static void main(String[] args) {
		Person person1 = new Programmer("Rizky", "Bandung", ".Net Core");
		Person person2 = new Teacher("Joko", "Tegal", "Matematika");
		Person person3 = new Doctor("Eko", "Surabaya", "Pedistrician");
		
		sayHello(person1);
		sayHello(person2);
		sayHello(person3);
	}
	
	static void sayHello(Person person) {
		String message;
		if (person instanceof Programmer) {
			Programmer programmer = (Programmer) person;
			message = "Hello, " + programmer.name + ". Seorang Programmer" + 
			programmer.technology + ".";
		} else if (person instanceof Teacher) {
			Teacher teacher = (Teacher) person;
			message = "Hello, " + teacher.name + ". Seorang Guru" + 
			teacher.subject + ".";
		}else if (person instanceof Doctor) {
			Doctor doctor = (Doctor) person;
			message = "Hello, " + doctor.name + ". Seorang Doktor" + 
			doctor.specialist + ".";
			
		}else {
			message = "Hello, " + person.name + ".";
		}
		System.out.println(message);
	}
}
