class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";

        int start = 0, end = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {

            // --------- Odd length palindrome ---------
            int left = i, right = i;
            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }
            int len1 = right - left - 1;  // after loop ends, we overshoot by 1 each side

            // --------- Even length palindrome ---------
            left = i; 
            right = i + 1;
            while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }
            int len2 = right - left - 1;

            int len = Math.max(len1, len2);

            // Update longest palindrome range
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }
}