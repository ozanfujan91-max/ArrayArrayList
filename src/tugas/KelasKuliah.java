package tugas;

import java.util.ArrayList;

public class KelasKuliah {
    // Menyimpan daftar banyak objek Mahasiswa menggunakan ArrayList
    private ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

    // 1. Method menambah mahasiswa ke dalam koleksi
    public void tambahMahasiswa(Mahasiswa mhs) {
        daftarMahasiswa.add(mhs);
    }

    // 2. Method menghitung rata-rata nilai kelas
    public double hitungRataRata() {
        if (daftarMahasiswa.isEmpty()) {
            return 0; // Menghindari pembagian dengan nol jika list kosong
        }
        
        double total = 0;
        for (Mahasiswa mhs : daftarMahasiswa) {
            total += mhs.getNilai();
        }
        return total / daftarMahasiswa.size();
    }

    // 3. Method menghitung jumlah mahasiswa yang lulus
    public int jumlahLulus() {
        int hitung = 0;
        for (Mahasiswa mhs : daftarMahasiswa) {
            if (mhs.lulus()) { // Memanggil method lulus() dari class Mahasiswa
                hitung++;
            }
        }
        return hitung;
    }

    // 4. Method menampilkan semua mahasiswa beserta nomor urut
    public void tampilkanSemua() {
        System.out.println("--- Daftar Mahasiswa di Kelas ---");
        for (int i = 0; i < daftarMahasiswa.size(); i++) {
            Mahasiswa mhs = daftarMahasiswa.get(i);
            System.out.println((i + 1) + ". " + mhs.info());
        }
    }

    // Method tambahan untuk mendapatkan total ukuran data terbaru
    public int getJumlahMahasiswa() {
        return daftarMahasiswa.size();
    }
}
