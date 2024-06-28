public class Main {
    public static void main(String[] args) {
        System.out.println("Palindrome: "+longestPalindrome("abababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababa"));
    }

    public static String longestPalindrome(String s) {
        int n = s.length();
    
        // Check if the entire string is a palindrome
        boolean isPalindrome = true;
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            return s;
        }

        // To store the longest palindrome found
        String longestPalindrome = s.substring(0, 1);

        // Find all palindromes in the string
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                if (s.charAt(i) == s.charAt(j)) {
                    boolean validPalindrome = true;
                    int left = i, right = j;
                    while (left <= right) {
                        if (s.charAt(left) != s.charAt(right)) {
                            validPalindrome = false;
                            break;
                        }
                        left++;
                        right--;
                    }
                    if (validPalindrome && (j - i + 1) > longestPalindrome.length()) {
                        longestPalindrome = s.substring(i, j + 1);
                    }
                }
            }
        }

        return longestPalindrome;
    }
}