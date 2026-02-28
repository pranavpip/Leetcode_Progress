// Problem: 1680. Concatenation of Consecutive Binary Numbers
// Link: https://leetcode.com/problems/concatenation-of-consecutive-binary-numbers
// Approach: Bit Manipulation
// Time: O(nlogn)
// Space: O(1)
//Difficulty: Medium
////Satus: //Sloved//
class Solution {
    public int concatenatedBinary(int n) {
        long r = 0;
        int x = 0;
        long mod = 1000000007L;
        long pow2 = 1;
        for (int i = n; i > 0; i--) {
            String s = Integer.toBinaryString(i);
            for (int j = s.length() - 1; j >= 0; j--) {
                if (s.charAt(j) == '1') {
                    r = (r + pow2) % mod;
                }
                pow2 = (pow2 * 2) % mod;
                x++;
            }
        }
        return (int) r;
    }
}
