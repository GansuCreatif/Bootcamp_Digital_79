import java.util.Scanner;


public class SimulasiPassingGrade
{
    public static void main(String[] args){
        int bahasaIndonesia,bahasaInggris,Matematika,Ipa;
        String nama;
        int minimalMasuk = 73;
        int bahasaGrade = 75;
        int matematikaGrade = 80;
        boolean a,b,c;
        double averageUjian,averageSastra;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Masukan nama: ");
        nama = keyboard.next();
        
        System.out.println("Nilai Ujian Bahasa Indonesia: ");
        bahasaIndonesia = keyboard.nextInt();
        
        
        System.out.println("Nilai Ujian Bahasa Inggris: ");
        bahasaInggris = keyboard.nextInt();
        
        
        System.out.println("Nilai Ujian Matematika: ");
        Matematika = keyboard.nextInt();
        
        
        System.out.println("Nilai Ujian IPA: ");
        Ipa = keyboard.nextInt();
                
        averageUjian = (Matematika+Ipa+bahasaIndonesia+bahasaInggris)/4;
        
        averageSastra = (bahasaIndonesia+bahasaInggris)/2;
        
        
        a = (averageUjian >= minimalMasuk);
        b = (averageSastra >= bahasaGrade);
        c = (Matematika > matematikaGrade);
        
        System.out.println("The Calculation Result: ");
        System.out.println("Hi "+ nama);
        System.out.println("Total Nilai Ujian Akhir: "+ averageUjian);
        System.out.println("Persyaratan masuk SMK Padepokan 79: "+ a);
        System.out.println("Persyaratan masuk Jurusan Bahasa Indonesia dan Bahasa Inggris: "+ b);
        System.out.println("Persyaratan masuk Jurusan Teknik Komputer Jaringan: "+ c);
    }
}
