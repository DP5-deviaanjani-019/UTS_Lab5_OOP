package Soal1;
import java.util.ArrayList; //Mengimpor kelas ArrayList dari paket java.util untuk membuat daftar dinamis
class Buku { //Deklarasi kelas Buku yang mewakili sebuah buku
    private String judul;//Deklarasi atribut judul dengan tipe data String
    private String pengarang;//Deklarasi atribut pengarang dengan tipe data String
    private int tahunTerbit;//Deklarasi atribut tahunTerbit dengan tipe data int

    // Constructor untuk menginisialisasi objek Buku dengan judul, pengarang, dan tahun terbit
    public Buku(String judul, String pengarang, int tahunTerbit) {
        this.judul = judul; //Menginisialisasi atribut judul dengan nilai parameter judul
        this.pengarang = pengarang; //Menginisialisasi atribut pengarang dengan nilai parameter pengarang
        this.tahunTerbit = tahunTerbit; //Menginisialisasi atribut tahunTerbit dengan nilai parameter tahunTerbit
    }
    //Getter untuk mendapatkan judul buku
    public String getJudul() {
        return judul;
    }
    // Setter untuk mengatur judul buku
    public void setJudul(String judul) {
        this.judul = judul;
    }
    // Getter untuk mendapatkan pengarang buku
    public String getPengarang() {
        return pengarang;
    }
    // Setter untuk mengatur pengarang buku
    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    // Getter untuk mendapatkan tahun terbit buku
    public int getTahunTerbit() {
        return tahunTerbit;
    }

    // Setter untuk mengatur tahun terbit buku
    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }
    // Method untuk menampilkan informasi buku
    public void displayInfo() {
        System.out.println("Judul: " + judul + ", Pengarang: " + pengarang + ", Tahun Terbit: " + tahunTerbit);
    }

    // Overloaded method untuk menampilkan informasi buku dengan format singkat
    public void displayInfo(String format) {
        if ("singkat".equalsIgnoreCase(format)) {
            System.out.println(judul + " oleh " + pengarang);
        } else {
            displayInfo();
        }
    }
}
// Kelas Majalah yang mewarisi kelas Buku
class Majalah extends Buku {
    private int edisi; // Atribut edisi majalah

    // Konstruktor untuk menginisialisasi objek Majalah
    public Majalah(String judul, String pengarang, int tahunTerbit, int edisi) {
        super(judul, pengarang, tahunTerbit);
        this.edisi = edisi;
    }
    // Getter untuk mendapatkan edisi majalah
    public int getEdisi() {
        return edisi;
    }

    // Setter untuk mengatur edisi majalah
    public void setEdisi(int edisi) {
        this.edisi = edisi;
    }
}