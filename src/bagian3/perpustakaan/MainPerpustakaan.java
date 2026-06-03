package bagian3.perpustakaan;

public class MainPerpustakaan {
    public static void main(String[] args) {
        Perpustakaan perpus = new Perpustakaan();

        // Soal 2: Memasukkan data buku beserta tahun terbitnya
        perpus.tambahBuku(new Buku("Laskar Pelangi", "Andrea Hirata", 2005));
        perpus.tambahBuku(new Buku("Bumi Manusia", "Pramoedya", 1980));
        perpus.tambahBuku(new Buku("Negeri 5 Menara", "Ahmad Fuadi", 2009));
        perpus.tambahBuku(new Buku("Anak Semua Bangsa", "Pramoedya", 1981)); // Tambahan untuk tes cariPenulis
        
        // Tampilkan koleksi awal (Sudah include tahun terbit)
        perpus.tampilkanKoleksi();
        System.out.println();

        // Uji Pinjam Buku
        perpus.pinjamBuku("Bumi Manusia");
        System.out.println("Buku tersedia: " + perpus.jumlahTersedia());
        System.out.println();
        
        // ====================================================================
        // UJI SOAL 1: Mengembalikan Buku
        // ====================================================================
        System.out.println("--- Pengujian Fitur Pengembalian ---");
        perpus.kembalikanBuku("Bumi Manusia"); // Harusnya berhasil
        System.out.println("Buku tersedia saat ini: " + perpus.jumlahTersedia());
        System.out.println();
        
        // ====================================================================
        // UJI SOAL 3: Mencari Penulis
        // ====================================================================
        System.out.println("--- Pengujian Fitur Cari Penulis ---");
        perpus.cariPenulis("Pramoedya"); // Harus menampilkan 2 buku karya Pramoedya
    }
}