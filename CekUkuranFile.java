import java.io.File;
import java.util.Scanner;

public class CekUkuranFile {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Masukkan nama/path file yang akan dicek: ");
        String namaFile = keyboard.nextLine();
        
        File file = new File(namaFile);
        
        
        if (file.exists() && file.isFile()) {
            long ukuranByte = file.length();
            
            
            long satuMegaByte = 1024 * 1024; 
            
            System.out.println("\n--- Hasil Pengecekan ---");
            if (ukuranByte < satuMegaByte) {
                
                double ukuranKB = (double) ukuranByte / 1024;
                System.out.printf("Ukuran file: %.2f KB\n", ukuranKB);
            } else {
                
                double ukuranMB = (double) ukuranByte / satuMegaByte;
                System.out.printf("Ukuran file: %.2f MB\n", ukuranMB);
            }
        } else {
            System.err.println("File tidak ditemukan atau bukan merupakan file valid.");
        }
        
        keyboard.close();
    }
}