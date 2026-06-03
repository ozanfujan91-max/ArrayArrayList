package bagian2.arraylist;

// Kita wajib mengimport class ArrayList dari library Java sebelum menggunakannya
import java.util.ArrayList; 

public class Latihan3 {
    public static void main(String[] args) {
        // Membuat ArrayList kosong yang menampung data bertipe String
        ArrayList<String> mahasiswa = new ArrayList<>();

        // 1. add() digunakan untuk menambah elemen di urutan paling akhir
        mahasiswa.add("Andi");   // Masuk ke indeks 0
        mahasiswa.add("Budi");   // Masuk ke indeks 1
        mahasiswa.add("Citra");  // Masuk ke indeks 2

        // 2. Mencetak langsung seluruh isi ArrayList
        System.out.println("Isi list : " + mahasiswa);

        // 3. .size() digunakan untuk mengetahui jumlah elemen (kalau di array biasa pakai .length)
        System.out.println("Jumlah   : " + mahasiswa.size());

        // 4. .get(indeks) digunakan untuk mengambil data pada indeks tertentu (kalau di array pakai [indeks])
        System.out.println("Index 1  : " + mahasiswa.get(1));
    }
}
