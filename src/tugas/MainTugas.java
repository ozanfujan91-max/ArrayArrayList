package tugas;

public class MainTugas {
    public static void main(String[] args) {
        
        // Poin 4: Menyimpan daftar mata kuliah dalam array String ukuran tetap & menampilkannya
        String[] mataKuliah = {"Pemrograman Berorientasi Objek", "Struktur Data", "Basis Data"};
        System.out.println("=== DAFTAR MATA KULIAH ===");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.println("- " + mataKuliah[i]);
        }
        System.out.println();

        // Membuat objek pengelola kelas kuliah
        KelasKuliah kelas = new KelasKuliah();

        // Poin 3: Menambahkan minimal 5 objek Mahasiswa awal
        kelas.tambahMahasiswa(new Mahasiswa("Andi Wijaya", "2023001", 75.5));
        kelas.tambahMahasiswa(new Mahasiswa("Budi Santoso", "2023002", 58.0));
        kelas.tambahMahasiswa(new Mahasiswa("Citra Lestari", "2023003", 90.0));
        kelas.tambahMahasiswa(new Mahasiswa("Dedi Kurniawan", "2023004", 45.5));
        kelas.tambahMahasiswa(new Mahasiswa("Eka Putri", "2023005", 82.0));

        // Menampilkan data awal mahasiswa
        kelas.tampilkanSemua();
        System.out.println();

        // Poin 5: Menampilkan rata-rata nilai dan jumlah mahasiswa yang lulus
        System.out.println("=== ANALISIS DATA KELAS ===");
        System.out.printf("Rata-rata Nilai Kelas : %.2f\n", kelas.hitungRataRata());
        System.out.println("Jumlah Mahasiswa Lulus: " + kelas.jumlahLulus() + " orang");
        System.out.println("Total Data Saat Ini   : " + kelas.getJumlahMahasiswa() + " mahasiswa");
        System.out.println();

        // Poin 6: Menambahkan satu objek Mahasiswa baru ke dalam koleksi
        System.out.println("--> Menambahkan 1 mahasiswa baru...");
        kelas.tambahMahasiswa(new Mahasiswa("Fajar Ramadhan", "2023006", 65.0));

        // Menampilkan kembali jumlah data terbaru setelah penambahan
        System.out.println("Total Data Terbaru    : " + kelas.getJumlahMahasiswa() + " mahasiswa");
        System.out.println();
        
        // Opsional: Cetak ulang untuk memastikan mahasiswa baru sudah masuk sistem
        kelas.tampilkanSemua();
    }
}
