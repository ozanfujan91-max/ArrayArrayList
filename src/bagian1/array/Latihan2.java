package bagian1.array;

public class Latihan2 {
    public static void main(String[] args) {
        int[] nilai = {80, 75, 90, 60, 85};

        // for biasa: punya akses ke variabel indeks (i)
        System.out.println("== Menggunakan for ==");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Indeks " + i + " = " + nilai[i]);
        }

        // for-each: lebih ringkas, langsung mengambil nilainya tanpa indeks
        System.out.println("\n== Menggunakan for-each ==");
        int total = 0;
        for (int n : nilai) {
            total += n;
        }

        // Casting (double) agar pembagian menghasilkan angka desimal yang akurat
        double rata = (double) total / nilai.length;
        
        System.out.println("Total     : " + total);
        System.out.println("Rata-rata : " + rata);
    }
}
