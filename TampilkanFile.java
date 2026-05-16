import java.io.File;

public class TampilkanFile {
    public static void main(String[] args) {
        // Ganti dengan path folder yang ingin kamu cek, "." artinya folder proyek saat ini
        File folder = new File("."); 
        
        String[] daftarFile = folder.list();

        if (daftarFile != null) {
            System.out.println("Daftar file di dalam direktori:");
            for (String namaFile : daftarFile) {
                System.out.println("- " + namaFile);
            }
        } else {
            System.err.println("Direktori tidak ditemukan atau bukan folder.");
        }
    }
}