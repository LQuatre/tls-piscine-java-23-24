public class Palindrome {
    public static boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }
        s = s.toLowerCase();
        var result = new StringBuilder();
        for (var i = s.length() - 1; i >= 0; i--) {
            result.append(s.charAt(i));
        }
        return s.equals(result.toString());
    }
}