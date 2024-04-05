public class Palindrome {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        if (s == null) {
            return false;
        }
        var result = new StringBuilder();
        for (var i = s.length() - 1; i >= 0; i--) {
            result.append(s.charAt(i));
        }
        return s.equals(result.toString());
    }
}