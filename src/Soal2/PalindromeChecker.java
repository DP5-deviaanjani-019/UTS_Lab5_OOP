package Soal2;
public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        String cleanedString = str.replaceAll("\\s+", "").toLowerCase();
        int left = 0;
        int right = cleanedString.length() - 1;

            while (left < right) {
                if (cleanedString.charAt(left) != cleanedString.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
        return true;
    }
}
