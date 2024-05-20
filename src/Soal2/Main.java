package Soal2;

import java.util.Scanner;
 public class Main {
     public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);
         System.out.print("Masukkan sebuah string: ");
         String inputString = scanner.nextLine();
         boolean result = PalindromeChecker.isPalindrome(inputString);
         System.out.println("Apakah string ini palindrome? " + result);
         scanner.close();


     }

    }

