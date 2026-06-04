package tugas;

public class Mahasiswa {
    // Atribut privat (Enkapsulasi)
    private String nama;
    private String npm;
    private double nilai;

    // Constructor untuk menginisialisasi data mahasiswa
    public Mahasiswa(String nama, String npm, double nilai) {
        this.nama = nama;
        this.npm = npm;
        this.nilai = nilai;
    }

    // Getter untuk membaca data dari luar class
    public String getNama() {
        return nama;
    }

    public String getNpm() {
        return npm;
    }

    public double getNilai() {
        return nilai;
    }

    // Method untuk mengecek kelulusan (nilai >= 60)
    public boolean lulus() {
        return this.nilai >= 60;
    }

    // Method pembantu untuk merangkai informasi mahasiswa menjadi teks
    public String info() {
        String status = lulus() ? "LULUS" : "TIDAK LULUS";
        return npm + " - " + nama + " (Nilai: " + nilai + ") [" + status + "]";
    }
}