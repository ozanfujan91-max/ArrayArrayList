package bagian3.perpustakaan;

public class Buku {
    private String judul;
    private String penulis;
    private int tahunTerbit; // <-- Soal 2: Tambah atribut baru
    private boolean dipinjam;

    // Soal 2: Update Constructor agar menerima parameter tahunTerbit
    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit; // <-- Soal 2: Inisialisasi tahun
        this.dipinjam = false; 
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    // Soal 2: Tambah Getter untuk tahunTerbit
    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public boolean isDipinjam() {
        return dipinjam;
    }

    public void setDipinjam(boolean dipinjam) {
        this.dipinjam = dipinjam;
    }

    // Soal 2: Update info() untuk menampilkan tahun terbit
    public String info() {
        String status = dipinjam ? "Dipinjam" : "Tersedia";
        // Menampilkan format: Judul (Tahun) oleh Penulis [Status]
        return judul + " (" + tahunTerbit + ") oleh " + penulis + " [" + status + "]";
    }
}