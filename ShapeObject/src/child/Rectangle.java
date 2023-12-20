package child;
import parents.Shape;

public class Rectangle extends Shape{
	private int panjang;
	private int lebar;
	
	public Rectangle() {
		
	}
	
	public Rectangle(String color, int panjang, int lebar) {
		setColor(color);
		this.panjang = panjang;
		this.lebar = lebar;
	}
	
	
	public int getPanjang() {
		return panjang;
	}

	public void setPanjang(int panjang) {
		this.panjang = panjang;
	}

	public int getLebar() {
		return lebar;
	}

	public void setLebar(int lebar) {
		this.lebar = lebar;
	}

	//override dan implementasi method abstract getArea
	@Override
	public double getArea() {
		double area  = panjang * lebar;
		return area;
	}
	
}
