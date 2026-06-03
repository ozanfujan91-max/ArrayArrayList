package bagian2.arraylist;

import java.util.ArrayList;

public class Latihan5 {
    public static void main(String[] args) {
        // Membuat ArrayList untuk angka bulat menggunakan wrapper class 'Integer'
        ArrayList<Integer> nilai = new ArrayList<>();
        
        nilai.add(80);
        nilai.add(75);
        nilai.add(90);

        int total = 0;
        
        // Perulangan for-each untuk membaca semua elemen ArrayList
        for (int n : nilai) { 
            total += n;
        }

        // Menghitung rata-rata dengan size() sebagai pembagi
        double rata = (double) total / nilai.size();

        System.out.println("Data      : " + nilai);
        System.out.println("Total     : " + total);
        System.out.println("Rata-rata : " + rata);
    }
}
