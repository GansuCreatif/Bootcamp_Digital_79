
import java.util.Scanner;

public class JobVacancyV2
{
    public static void main(String[] args){
        String lulusan,nama,jenisKelamin,posisi,hasil;
        double penampilan;
        int umur,pengalaman;
        boolean reqKoor1,reqKoor2,reqAdmin1,reqAdmin2,reqAdmin3,reqSpv1,reqSpv2;
        
    
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
            //membuat kondisi setiap kriteria koordinator
            reqKoor1 = jenisKelamin.equalsIgnoreCase("Pria") && umur >= 21 && umur <= 30 && (lulusan.equalsIgnoreCase("SMK")
            || lulusan.equalsIgnoreCase("D3")) && pengalaman >= 2;
            reqKoor2 = jenisKelamin.equalsIgnoreCase("Pria") && umur > 30 && lulusan.equalsIgnoreCase("S1") && pengalaman >= 5;
                //Kondisi if untuk menentukan hasil kelulusan posisi koordinator
                if(reqKoor1 || reqKoor2)
                {
                    hasil = "Selamat" + nama + ".\nAnda memenuhi syarat untuk sebagai " + posisi + 
                    ".Dan akan masuk ke Tahap selanjutnya";
                }
                else
                {
                    hasil = "Maaf" + nama + ".\nAnda tidak memenuhi syarat untuk sebagai " + posisi + 
                    ".Dan tidak akan masuk ke Tahap selanjutnya";
                }
        }
        else if(posisi.equalsIgnoreCase("Admin"))
        {
           //membuat kondisi setiap kriteria Admin
            reqAdmin1 = jenisKelamin.equalsIgnoreCase("Wanita") && umur >= 20 && umur <= 25 && lulusan.equalsIgnoreCase("D3")
            && penampilan >= 8.5 || pengalaman >= 1;
            reqAdmin2 = jenisKelamin.equalsIgnoreCase("Wanita") && umur > 25 && lulusan.equalsIgnoreCase("S1") && penampilan >= 8.5 
            && pengalaman >= 3;
            reqAdmin3 = jenisKelamin.equalsIgnoreCase("Wanita") && umur > 25 && umur <= 30 && penampilan >= 8.5 && 
            lulusan.equalsIgnoreCase("D3") || lulusan.equalsIgnoreCase("S1") && pengalaman >= 2;
                //Kondisi if untuk menentukan hasil kelulusan posisi Admin
                if(reqAdmin1 || reqAdmin2 || reqAdmin3)
                {
                    hasil = "Selamat" + nama + ".\nAnda memenuhi syarat untuk sebagai " + posisi + 
                    ".Dan akan masuk ke Tahap selanjutnya";
                }
                else
                {
                    hasil = "Maaf" + nama + ".\nAnda tidak memenuhi syarat untuk sebagai " + posisi + 
                    ".Dan tidak akan masuk ke Tahap selanjutnya";
                }
        } 
        else if(posisi.equalsIgnoreCase("SPV"))
        {
            reqSpv1 = umur >= 23 && umur <= 30 && lulusan.equalsIgnoreCase("S1") && pengalaman > 1;
            reqSpv2 = umur >= 25 && umur <= 35 && lulusan.equalsIgnoreCase("D3") && pengalaman > 4;
                //Kondisi if untuk menentukan hasil kelulusan posisi SPV
                if(reqSpv1 || reqSpv2)
                {
                    hasil = "Selamat" + nama + ".\nAnda memenuhi syarat untuk sebagai " + posisi + 
                    ".Dan akan masuk ke Tahap selanjutnya";
                }
                else
                {
                    hasil = "Maaf" + nama + ".\nAnda tidak memenuhi syarat untuk sebagai " + posisi + 
                    ".Dan tidak akan masuk ke Tahap selanjutnya";
                }
        }
        else
        {
            //Hasil ketika posisi yang dimasukan tidak sesuai atau tidak ada.
            hasil = "Maaf Posisi tidak tersedia.";
        }
        
        
        System.out.println();
        System.out.println(nama + ", terimakasih sudah mengikuti lowongan kerja di PT. Secret Semut 79\n");
        System.out.println("Berikut hasil Rekrutmen untuk posisi"+ posisi + ":");
        System.out.println(hasil);
        
    }
}
