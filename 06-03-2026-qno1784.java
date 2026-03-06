// Problem: 1784. Check if Binary String Has at Most One Segment of Ones
// Link: https://leetcode.com/problems/check-if-binary-string-has-at-most-one-segment-of-ones
// Approach: Simulation
// Time: O(n)
// Space: O(1)
//Difficulty: Easy
////Satus: //Sloved//
class Solution {
    public boolean checkOnesSegment(String s) {
        int f=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='0'){
                if(f==1){
                    f=2;
                }
            }
            if(c=='1'){
                if(f==2){
                    return false;
                }
                f=1;
            }
        }
        return true;
    }
}