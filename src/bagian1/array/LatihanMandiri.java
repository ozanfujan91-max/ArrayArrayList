package bagian1.array;

public class LatihanMandiri {
    public static void main(String[] args) {
        
        // ====================================================================
        // SOAL 1: Mencari Suhu Tertinggi dan Terendah
        // ====================================================================
        System.out.println("=== SOAL 1: Analisis Suhu ===");
        double[] suhu = {32.5, 31.0, 34.2, 29.8, 35.0, 30.5};
        
        // Inisialisasi awal: asumsikan elemen pertama adalah yang tertinggi & terendah
        double tertinggi = suhu[0];
        double terendah = suhu[0];
        
        for (double s : suhu) {
            if (s > tertinggi) {
                tertinggi = s; // Ganti jika menemukan yang lebih besar
            }
            if (s < terendah) {
                terendah = s;   // Ganti jika menemukan yang lebih kecil
            }
        }
        System.out.println("Suhu Tertinggi: " + tertinggi + "°C");
        System.out.println("Suhu Terendah : " + terendah + "°C");
        
        
        // ====================================================================
        // SOAL 2: Memfilter Nama Hari (> 5 Huruf)
        // ====================================================================
        System.out.println("\n=== SOAL 2: Filter Nama Hari (> 5 Huruf) ===");
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};
        
        System.out.print("Hari dengan > 5 huruf: ");
        for (String h : hari) {
            // .length() dengan tanda kurung digunakan untuk menghitung jumlah huruf pada String
            if (h.length() > 5) {
                System.out.print(h + " ");
            }
        }
        System.out.println(); // Membuat baris baru
        
        
        // ====================================================================
        // SOAL 3: Menghitung Banyak Angka Genap
        // ====================================================================
        System.out.println("\n=== SOAL 3: Hitung Angka Genap ===");
        int[] angka = {4, 8, 15, 16, 23, 42};
        int jumlahGenap = 0;
        
        for (int n : angka) {
            // Menggunakan modulus (%) untuk mengecek apakah habis dibagi 2
            if (n % 2 == 0) {
                jumlahGenap++; // Tambah 1 ke counter jika genap
            }
        }
        System.out.println("Banyak angka genap: " + jumlahGenap);
    }
}
