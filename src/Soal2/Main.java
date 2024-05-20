package Soal2;

import java.util.Scanner;
 public class Main {
     public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);
         boolean keepRunning = true;
         while (keepRunning) {
             System.out.print("Masukkan sebuah string / ketik 'keluar' untuk berhenti :");
             String inputString = scanner.nextLine();
             if (inputString.equalsIgnoreCase("keluar")) {
                 keepRunning = false;
             } else {
                 boolean result = PalindromeChecker.isPalindrome(inputString);
                 System.out.println("Apakah string ini palindrome? " + result);
             }
         }
         scanner.close();


     }

 }

