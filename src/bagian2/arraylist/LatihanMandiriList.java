package bagian2.arraylist;

import java.util.ArrayList;

public class LatihanMandiriList {
    public static void main(String[] args) {
        
        // ====================================================================
        // SOAL 1: Operasi Daftar Belanja (Tambah, Hapus, Cek Ukuran)
        // ====================================================================
        System.out.println("=== SOAL 1: Daftar Belanja ===");
        ArrayList<String> belanja = new ArrayList<>();
        
        // Menambah 4 item
        belanja.add("Minyak Goreng"); // Indeks 0
        belanja.add("Beras");         // Indeks 1 (Item ke-2)
        belanja.add("Gula");          // Indeks 2
        belanja.add("Telur");         // Indeks 3
        System.out.println("Daftar Awal   : " + belanja);
        
        // Hapus item ke-2 (berarti berada di indeks 1)
        belanja.remove(1); 
        
        // Menampilkan hasil akhir
        System.out.println("Daftar Akhir  : " + belanja);
        System.out.println("Jumlah Akhir  : " + belanja.size() + " item");
        
        
        // ====================================================================
        // SOAL 2: Mencari Nilai Terbesar dalam ArrayList Angka
        // ====================================================================
        System.out.println("\n=== SOAL 2: Cari Nilai Terbesar ===");
        ArrayList<Integer> listAngka = new ArrayList<>();
        listAngka.add(23);
        listAngka.add(45);
        listAngka.add(12);
        listAngka.add(89);
        listAngka.add(67);
        System.out.println("Daftar Angka  : " + listAngka);
        
        // Ambil elemen pertama sebagai patokan awal nilai terbesar
        int terbesar = listAngka.get(0); 
        
        // Menelusuri seluruh elemen menggunakan for-each
        for (int angka : listAngka) {
            if (angka > terbesar) {
                terbesar = angka; // Ganti jika menemukan angka yang lebih besar
            }
        }
        System.out.println("Nilai Terbesar: " + terbesar);
        
        
        // ====================================================================
        // SOAL 3: Memfilter Nama dengan Awalan Huruf 'A'
        // ====================================================================
        System.out.println("\n=== SOAL 3: Filter Nama Awalan 'A' ===");
        ArrayList<String> daftarNama = new ArrayList<>();
        
        // Menambah 6 nama
        daftarNama.add("Ali");
        daftarNama.add("Budi");
        daftarNama.add("Annisa");
        daftarNama.add("Citra");
        daftarNama.add("Ahmad");
        daftarNama.add("Dedi");
        
        System.out.println("Semua Nama    : " + daftarNama);
        System.out.print("Awalan Huruf A: ");
        
        for (String nama : daftarNama) {
            // Menggunakan method .startsWith() untuk mengecek huruf depan
            if (nama.startsWith("A")) {
                System.out.print(nama + " ");
            }
        }
        System.out.println(); // Membuat baris baru di akhir
    }
}