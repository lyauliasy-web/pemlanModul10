import java.io.File;

public class HapusDirektori {
    public static void main(String[] args) {
        // Ganti dengan nama/path folder yang ingin dihapus
        File folder = new File("nama_folder_target"); 

        if (folder.exists() && folder.isDirectory()) {
            File[] daftarFile = folder.listFiles();

            // 1. Hapus semua file di dalam folder terlebih dahulu
            if (daftarFile != null) {
                for (File file : daftarFile) {
                    file.delete(); 
                }
            }

            // 2. Hapus folder utama setelah kosong
            if (folder.delete()) {
                System.out.println("Direktori dan semua file di dalamnya berhasil dihapus.");
            } else {
                System.err.println("Gagal menghapus direktori.");
            }
        } else {
            System.err.println("Direktori tidak ditemukan.");
        }
    }
}