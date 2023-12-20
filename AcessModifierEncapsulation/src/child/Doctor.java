package child;
import parents.Person;

public class Doctor extends Person {
	private String specialist;
	
	public Doctor() {
		
	}
	public Doctor(String name, String address, String specialist) {
		super(name,address);
		this.specialist = specialist;
	}
	
	void specialist() {
		System.out.println("I can surgery patient");
	}
	
	public void greeting() {
		System.out.println("Hello my name is "+ getName() + ".");
		System.out.println("I come from "+ getAddress() + ".");
		System.out.println("My occupation is a"+ specialist + "doctor");
	}
	
	//setter dan getter
	public String getSpecialist() {
		return specialist;
	}
	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}
	
}
