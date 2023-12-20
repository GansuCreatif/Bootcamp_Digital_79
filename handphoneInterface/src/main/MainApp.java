package main;
import java.util.Scanner;

import interfaces.Phone;
public class MainApp {

	public static void main(String[] args) {
		//membuat objek phone menggunakan instansiasi dari class xiaomi
		Phone redminote10 = new Xiaomi();
		
		//membuat object PhoneUser
		PhoneUser ganjar = new PhoneUser(redminote10);
		
		//nyalakan dulu HP
		ganjar.turnOnThePhone();
		
		//membuat tampilan
		Scanner input = new Scanner(System.in);
		String aksi;
		boolean isLooping = true;
		
		do {
			System.out.println("===Aplikasi InterFace===");
			System.out.println("[1] Nyalakan HP");
			System.out.println("[2] Matikan HP");
			System.out.println("[3] Perbesar Volume HP");
			System.out.println("[4] Perkecil Volume HP");
			System.out.println("[0] Keluar");
			System.out.println("========================");
			
			System.out.println("Pilih Aksi : ");
			aksi = input.next();
			
			if (aksi.equalsIgnoreCase("1")) {
				ganjar.turnOnThePhone();
			}else if (aksi.equalsIgnoreCase("2")) {
				ganjar.turnOffThePhone();
			}else if (aksi.equalsIgnoreCase("3")) {
				ganjar.makePhoneLouder();
			}else if (aksi.equalsIgnoreCase("4")) {
				ganjar.makePhoneSilent();
			}else if (aksi.equalsIgnoreCase("0")) {
				isLooping = false;
			}else {
				System.out.println("Aksi yang anda pilih tidak tersedia.");
				System.out.println("Silahkan Pilih Aksi Kembali.");
			}
		} while (isLooping);
		

	}

}
