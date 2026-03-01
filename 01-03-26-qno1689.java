// Problem: 1689. Partitioning Into Minimum Number Of Deci-Binary Numbers
// Link: https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers
// Approach: Logic
// Time: O(n)
// Space: O(1)
//Difficulty: Medium
////Satus: //Sloved//
class Solution {
    public int minPartitions(String n) {
        char c=' ';
        for(int i=0;i<n.length();i++){
            c=c<n.charAt(i)?n.charAt(i):c;
        }
        return c-'0';
    }
}
