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
                double dropFactor = scanner.nextDouble();

                Rumus dropRateCalc = new Rumus (volume, time, dropFactor);
                System.out.println("Jumlah tetesan per menit adalah: " + dropRateCalc.calculateDropRate() + " tetes/menit");
                break;
            case 2:
                System.out.println("Masukkan tetesan per menit: ");
                double dropRate = scanner.nextDouble();
                System.out.println("Masukkan waktu infus (menit): ");
                time = scanner.nextDouble();
                System.out.println("Masukkan faktor tetesan (tetes/ml): ");
                dropFactor = scanner.nextDouble();

                Rumus volumeCalc = new Rumus(dropRate, time, dropFactor, true);
                System.out.println("Volume cairan yang diinfuskan adalah: " + volumeCalc.calculateVolumeInfused() + " ml");
                break;

        }
        }
}