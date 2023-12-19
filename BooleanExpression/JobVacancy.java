
import java.util.Scanner;

public class JobVacancy
{
    public static void main(String[] args){
        String lulusan,nama,jenisKelamin;
        double penampilan;
        int umur,pengalaman;
        boolean reqKoor1,reqKoor2,reqAdmin1,reqAdmin2;
        boolean isPassingKoor,isPassingAdmin;
    
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Selamat datang di PT. Secret Semut 79");
        System.out.println("=====================================\n");
        System.out.println("Silahkan Input Data Anda");
        System.out.println("Masukan nama: ");
        nama = keyboard.next();
        System.out.println("Umur: ");
        umur = keyboard.nextInt();
        System.out.println("Jenis Kelamin (Pria/Wanita): ");
        jenisKelamin = keyboard.next();
        System.out.println("Lulusan (SMK/D3/S1): ");
        lulusan = keyboard.next();
        System.out.println("Pengalaman(Tahun): ");
        pengalaman = keyboard.nextInt();
        System.out.println("Penampilan(1/10): ");
        penampilan = keyboard.nextDouble();
        
        //Pengecekan data untuk persyaratan Koordinator
        /*
         * 1. Persyarataan Coordinator:
         *  Pria
         *  Umur minimla 21 tahun dan maksimal 30 tahun.
         *  Lulusan SMK/D3
         *  Memiliki pengalaman minimal 2 tahun.
         *  
         *  atau
         *  
         *  Pria
         *  Umur 30 tahun keatas.
         *  Lulusan S1
         *  Memiliki pengalaman minimal 5 tahun.
         *  
         */
        
        //Persyaratan Koordinator 1
        reqKoor1 = jenisKelamin.equalsIgnoreCase("Pria") && umur >=21 && umur <=30 && 
        (lulusan.equalsIgnoreCase("SMK") || lulusan.equalsIgnoreCase("D3")) && pengalaman >= 2;
        
        //Persyaratan Koordinator 2
        reqKoor2 = jenisKelamin.equalsIgnoreCase("Pria") && umur >30 && lulusan.equalsIgnoreCase("S1") && pengalaman >= 5;
        
        //Hasil dari Koordinator
        isPassingKoor = reqKoor1 || reqKoor2;
        
         //Pengecekan data untuk persyaratan Admin
        /*
         *  2. Persyarataan Admin   :
         *  Wanita
         *  Umur minimla 20 tahun dan maksimal 25 tahun.
         *  Lulusan D3
         *  Memiliki penampilan menarik atau pengalaman minimal 1 tahun.
         *  
         *  atau
         *  
         *  Wanita
         *  Umur 25 tahun keatas.
         *  Lulusan S1
         *  Memiliki penampilan menarik
         *  Memiliki pengalaman minimal 3 tahun.
         *  
         */
        
        //Persyaratan Admin 1
        reqAdmin1 = jenisKelamin.equalsIgnoreCase("Wanita") && umur >=20 && umur <=25 && 
        lulusan.equalsIgnoreCase("D3") && (penampilan >= 8.5 || pengalaman >= 1);
        
        //Persyaratan Admin 2
        reqAdmin2 = jenisKelamin.equalsIgnoreCase("Wanita") && umur > 25 && 
        lulusan.equalsIgnoreCase("S1") && (penampilan >= 8.5 || pengalaman >= 3);
        
        //hasil dari Admin
        isPassingAdmin = reqAdmin1 || reqAdmin2;
        
        
        System.out.println();
        System.out.println(nama + ", terimakasih sudah mengikuti lowongan kerja di PT. Secret Semut 79\n");
        System.out.println("Berikut hasil Rekrutmen untuk Koordinator dan Admin");
        System.out.println("Hasil Kelulusan untuk Koordinator: "+ isPassingKoor);
        System.out.println("Hasil Kelulusan untuk Admin: "+ isPassingAdmin);
        
    }
}
