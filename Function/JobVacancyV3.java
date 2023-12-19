
import java.util.Scanner;

public class JobVacancyV3
{
    public static void main(String[] args){
        String lulusan,nama,jenisKelamin,posisi,hasil;
        double penampilan;
        int umur,pengalaman;
        boolean reqKoor1,reqKoor2,reqAdmin1,reqAdmin2,reqAdmin3,reqSpv1,reqSpv2;
        boolean isPassing;
    
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
        System.out.println("Posisi yang dilamar (SPV,Admin,atau Koordinator): ");
        posisi = keyboard.next();
        
        //Kondisi if untuk menentukan posisi yang dipilih
        if(posisi.equalsIgnoreCase("Koordinator"))
        {
            //pemanggilan kondisi setiap kriteria koordinator
            isPassing = validasiKoordinator(umur, jenisKelamin, lulusan, pengalaman, penampilan);
        }
        else if(posisi.equalsIgnoreCase("Admin"))
        {
           //pemanggilan kondisi setiap kriteria Admin
            isPassing = validasiAdmin(umur, jenisKelamin, lulusan, pengalaman, penampilan);
        } 
        else if(posisi.equalsIgnoreCase("SPV"))
        {
            //pemanggilan kondisi setiap kriteria SPV
            isPassing = validasiSpv(umur, jenisKelamin, lulusan, pengalaman, penampilan);
        }
        else
        {
            //Hasil ketika posisi yang dimasukan tidak sesuai atau tidak ada.
            hasil = "Maaf Posisi tidak tersedia.";
            isPassing = false;
        }
        
        //menentukan hasil
        if(isPassing)
        {
            hasil = "Selamat, " + nama + "\nAnda memenuhi syarat sebagai "+ posisi + ". Dan akan masuk ke tahap selanjutnya.";
        }
        else
        {
             hasil = "Maaf, " + nama + "\nAnda tidak memenuhi syarat sebagai "+ posisi + ". Dan tidak akan masuk ke tahap selanjutnya.";
        }
        
        cetakResult(nama,hasil,posisi);
    }
        
        
        
      
    
        //Membuat function untuk validasi koordinator
        public static boolean validasiKoordinator(int umur, String jenisKelamin, String lulusan, int pengalaman, double penampilan)
        {
            //deklarasi variabel lokal
            boolean reqKoor1,reqKoor2,result;
            
            //Kriteria Koordinator
            reqKoor1 = jenisKelamin.equalsIgnoreCase("Pria") && umur >= 21 && umur <= 30 && (lulusan.equalsIgnoreCase("SMK")
            || lulusan.equalsIgnoreCase("D3")) && pengalaman >= 2;
            reqKoor2 = jenisKelamin.equalsIgnoreCase("Pria") && umur > 30 && lulusan.equalsIgnoreCase("S1") && pengalaman >= 5;
            
                if(reqKoor1 || reqKoor2)
                {
                    result = true;
                }
                else
                {
                    result = false;
                }
            return result;
        }
        //Membuat function untuk validasi Admin
        public static boolean validasiAdmin(int umur, String jenisKelamin, String lulusan, int pengalaman, double penampilan)
        {
            //deklarasi variabel lokal
            boolean reqAdmin1,reqAdmin2,reqAdmin3,result;
            
            //Kriteria Admin
            reqAdmin1 = jenisKelamin.equalsIgnoreCase("Wanita") && umur >= 20 && umur <= 25 && lulusan.equalsIgnoreCase("D3")
            && penampilan >= 8.5 || pengalaman >= 1;
            reqAdmin2 = jenisKelamin.equalsIgnoreCase("Wanita") && umur > 25 && lulusan.equalsIgnoreCase("S1") && penampilan >= 8.5 
            && pengalaman >= 3;
            reqAdmin3 = jenisKelamin.equalsIgnoreCase("Wanita") && umur > 25 && umur <= 30 && penampilan >= 8.5 && 
            lulusan.equalsIgnoreCase("D3") || lulusan.equalsIgnoreCase("S1") && pengalaman >= 2;
            
                if(reqAdmin1 || reqAdmin2 || reqAdmin3)
                {
                    result = true;
                }
                else
                {
                    result = false;
                }
            return result;
        }
        //Membuat function untuk validasi SPV
        public static boolean validasiSpv(int umur, String jenisKelamin, String lulusan, int pengalaman, double penampilan)
        {
            //deklarasi variabel lokal
            boolean reqSpv1,reqSpv2,result;
            
            //Kriteria SPV
            reqSpv1 = umur >= 23 && umur <= 30 && lulusan.equalsIgnoreCase("S1") && pengalaman > 1;
            reqSpv2 = umur >= 25 && umur <= 35 && lulusan.equalsIgnoreCase("D3") && pengalaman > 4;
            
                if(reqSpv1 || reqSpv2)
                {
                    result = true;
                }
                else
                {
                    result = false;
                }
            return result;
        }
        
        //Menampilkan hasil result
        public static void cetakResult(String nama, String hasil,String posisi)
        {
            System.out.println();
            System.out.println(nama + ", terimakasih sudah mengikuti lowongan kerja di PT. Secret Semut 79\n");
            System.out.println("Berikut hasil Rekrutmen untuk posisi"+ posisi + ":");
            System.out.println(hasil);
        
        }
    }
