package Soal4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih perhitungan yang ingin dilakukan:");
        System.out.println("1. Hitung Tetesan per Menit");
        System.out.println("2. Hitung Volume Cairan yang Diinfuskan");
        System.out.println(" Masukkan Pilihan Anda : ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Masukkan volume cairan (ml): ");
                double volume = scanner.nextDouble();
                System.out.println("Masukkan waktu infus (menit): ");
                double time = scanner.nextDouble();
                System.out.println("Masukkan faktor tetesan (tetes/ml): ");

        }
        }
}