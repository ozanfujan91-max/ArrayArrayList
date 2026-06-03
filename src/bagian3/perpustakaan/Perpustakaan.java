package bagian3.perpustakaan;

import java.util.ArrayList;

public class Perpustakaan {
    private ArrayList<Buku> koleksi = new ArrayList<>();

    public void tambahBuku(Buku buku) {
        koleksi.add(buku);
    }

    public void tampilkanKoleksi() {
        System.out.println("== Koleksi Perpustakaan ==");
        for (int i = 0; i < koleksi.size(); i++) {
            Buku b = koleksi.get(i);
            System.out.println((i + 1) + ". " + b.info());
        }
    }

    public void pinjamBuku(String judul) {
        for (Buku b : koleksi) {
            if (b.getJudul().equals(judul)) {
                if (b.isDipinjam()) {
                    System.out.println("Buku '" + judul + "' sedang dipinjam.");
                } else {
                    b.setDipinjam(true);
                    System.out.println("Buku '" + judul + "' berhasil dipinjam.");
                }
                return;
            }
        }
        System.out.println("Buku '" + judul + "' tidak ditemukan.");
    }

    // ====================================================================
    // SOAL 1: Method untuk Mengembalikan Buku
    // ====================================================================
    public void kembalikanBuku(String judul) {
        for (Buku b : koleksi) {
            if (b.getJudul().equals(judul)) {
                if (!b.isDipinjam()) {
                    System.out.println("Buku '" + judul + "' memang tidak sedang dipinjam.");
                } else {
                    b.setDipinjam(false); // Mengubah status menjadi false (tersedia kembali)
                    System.out.println("Buku '" + judul + "' berhasil dikembalikan.");
                }
                return;
            }
        }
        System.out.println("Buku '" + judul + "' tidak ditemukan.");
    }

    // ====================================================================
    // SOAL 3: Method untuk Mencari Buku Berdasarkan Penulis
    // ====================================================================
    public void cariPenulis(String penulis) {
        System.out.println("== Hasil Pencarian Penulis: " + penulis + " ==");
        boolean ditemukan = false;
        
        for (Buku b : koleksi) {
            if (b.getPenulis().equalsIgnoreCase(penulis)) { // .equalsIgnoreCase agar tidak sensitif huruf besar/kecil
                System.out.println("- " + b.info());
                ditemukan = true;
            }
        }
        
        if (!ditemukan) {
            System.out.println("Tidak ada buku yang ditemukan dari penulis " + penulis);
        }
    }

    public int jumlahTersedia() {
        int jumlah = 0;
        for (Buku b : koleksi) {
            if (!b.isDipinjam()) {
                jumlah++;
            }
        }
        return jumlah;
    }
}