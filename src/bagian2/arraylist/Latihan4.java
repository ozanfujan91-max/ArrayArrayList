package bagian2.arraylist;

import java.util.ArrayList;

public class Latihan4 {
    public static void main(String[] args) {
        ArrayList<String> buah = new ArrayList<>();
        
        // Menambah data awal
        buah.add("Apel");    // Indeks 0
        buah.add("Mangga");  // Indeks 1
        buah.add("Jeruk");   // Indeks 2
        System.out.println("Awal  : " + buah);

        // 1. .add(indeks, nilai) -> Menyisipkan data di posisi tertentu
        // Data di indeks tersebut dan setelahnya otomatis akan bergeser ke kanan
        buah.add(1, "Pisang"); 
        System.out.println("Sisip : " + buah);

        // 2. .set(indeks, nilai baru) -> Mengubah/menimpa data di indeks tertentu
        buah.set(0, "Anggur"); 
        System.out.println("Ganti : " + buah);

        // 3. .remove(nilai) -> Menghapus elemen berdasarkan isinya
        // Bisa juga menggunakan indeks, contoh: buah.remove(2);
        buah.remove("Jeruk"); 
        System.out.println("Hapus : " + buah);

        // 4. .contains(nilai) -> Mengecek apakah suatu data ada di dalam list (menghasilkan true/false)
        System.out.println("Ada Apel?: " + buah.contains("Apel"));

        // 5. .size() -> Melihat jumlah elemen saat ini
        System.out.println("Jumlah   : " + buah.size());
    }
}