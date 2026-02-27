// Problem: 1404. Number of Steps to Reduce a Number in Binary Representation to One
// Link: https://leetcode.com/problems/number-of-steps-to-reduce-a-number-in-binary-representation-to-one
// Approach: Bit operation
// Time: O(n)
// Space: O(1)
//Difficulty: Medium
////Satus: //Sloved//
class Solution{
    public int numSteps(String s){
        int c=0,carry=0;
        for(int i=s.length()-1;i>0;i--){
            int bit=(s.charAt(i)-'0')+carry;
            if(bit==1){
                c+=2;
                carry=1;
            }else c+=1;
        }
        return c+carry;
    }
}
// class Solution {
//     public int numSteps(String s) {
//         int c=0;
//         long n=Long.parseLong(s,2);
//         while(n!=1){
//             if(n%2==0){
//                 n/=2;
//             }
//             else{
//                 n+=1;
//             }
//             c++;
//         }
//         return c;
//     }
// }
