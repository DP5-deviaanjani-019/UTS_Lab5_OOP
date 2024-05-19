package Soal1;

import java.util.ArrayList;//Mengimpor kelas ArrayList dari paket java.util untuk membuat daftar dinamis
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
}