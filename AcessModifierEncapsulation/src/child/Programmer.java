package child;
import parents.Person;

public class Programmer extends Person {
	private String technology;
	
	public Programmer() {
		
	}
	
	public Programmer(String name, String address, String technology) {
		super(name,address);
		this.technology = technology;
	}
	
	void hacking() {
		System.out.println("I can hacking website");
	}
	void coding() {
		System.out.println("I can create application using technology : "
	+ technology + ".");
	}
	
	public void greeting() {
		super.greeting();//Memanggil method greeting dari parent atau person class
		System.out.println("My job is a "+ technology + "programmer");
	}
	
	//setter dan getter
	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}
	
	
}
