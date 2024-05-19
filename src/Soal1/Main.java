package Soal1;

import java.util.Scanner; //Mengimpor kelas Scanner dari paket java.util untuk membaca input dari pengguna
public class Main { //Deklarasi kelas utama dengan nama Main
    public static void main(String[] args) { //Deklarasi metode main, titik awal eksekusi program
        Scanner scanner = new Scanner(System.in); //Membuat objek Scanner untuk membaca input dari konsol
        Perpustakaan perpustakaan = new Perpustakaan(); //Membuat objek Perpustakaan untuk mengelola koleksi buku dan majalah

        while (true) { //Memulai loop tanpa batas yang akan terus berjalan sampai dihentikan secara eksplisit
            System.out.println("Tambah Buku/Majalah (1) atau Tampilkan Koleksi (2) atau Keluar (3): ");//mencetak pilihan menu di layar
            int pilihan = scanner.nextInt();//Membaca input pengguna sebagai integer dan menyimpannya ke variabel pilihan
            scanner.nextLine();//Membersihkan buffer setelah membaca input integer

            if (pilihan == 1) {//Jika pilihan pengguna adalah 1
                System.out.println("Masukkan jenis (buku/majalah): ");//Meminta pengguna memasukkan jenis item
                String jenis = scanner.nextLine();//Membaca input pengguna sebagai string dan menyimpannya ke variabel jenis

                System.out.println("Masukkan judul: ");//Meminta pengguna memasukkan judul item
                String judul = scanner.nextLine(); //Membaca input pengguna sebagai string dan menyimpannya ke variabel judul