package Java_101;

public class IsPolindrom {
    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    static boolean isPalindrome2(String str) {
        String ters = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            ters += str.charAt(i);
        }

        return str.equals(ters);
    }
    public static void main(String[] args) {
        // Test için bir örnek kelimeyi kontrol ediyoruz
        System.out.println(isPalindrome("abba")); // true
    }
}
