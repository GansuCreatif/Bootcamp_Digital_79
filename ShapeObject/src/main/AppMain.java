package main;
import parents.Shape;
import child.Circle;
import child.Rectangle;
import child.Triangle;
public class AppMain {
	public static void main(String[] args) {
		Shape lingkaran = new Circle("Biru",20);
		Shape segitiga = new Triangle(10, 15, "Merah");
		Shape persegi = new Rectangle("Hijau", 20, 20);
		
		System.out.println("Luas Lingkaran berwarna "+ lingkaran.getColor() + " adalah " 
				+ lingkaran.getArea());
		System.out.println("Luas Segitiga berwarna "+ segitiga.getColor() + " adalah " 
				+ segitiga.getArea());
		System.out.println("Luas Persegi berwarna "+ persegi.getColor() + " adalah " 
				+ persegi.getArea());
	}
}
