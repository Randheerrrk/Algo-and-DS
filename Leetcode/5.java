/*
Longest Palindromic Substring
------------------------------

Given a string s, return the longest palindromic substring in s.

Input: s = "babad"
Output: "bab"
Note: "aba" is also a valid answer.

Input: s = "cbbd"
Output: "bb"

Input: s = "a"
Output: "a"

Input: s = "ac"
Output: "a"
*/

//Java Solution

class Solution {
    public String longestPalindrome(String s) {
        int start = 0;
        int end = 0;
        for(int i=0; i<s.length(); i++) {
            int odd = find(s, i, i);
            int even = find(s, i, i+1);
            int length = Math.max(odd, even);
            if(length > end - start) {
                start = i - (length - 1) / 2;
                end = i + length / 2;
            }
        }
        return s.substring(start, end+1);
    }
    private int find(String s, int left, int right) {
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
