// Problem: 3666. Minimum Operations to Equalize Binary String
// Link: https://leetcode.com/problems/minimum-operations-to-equalize-binary-string
// Approach: Math Logic
// Time: O(n)
// Space: O(1)
//Difficulty: Hard
////Satus: //UnSloved//
//Tests: 525/999
class Solution {
    public int minOperations(String s, int k) {
        int zc=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                zc++;
            }
        }
        if((zc==1&&k>1)||(k==s.length() && zc<k && zc!=0)){
            return -1;
        }
        int oc=s.length()-zc,c=0,po=0,pz=0;
        while(zc>0){
            if(zc>=k){
                zc-=k;
                oc+=k;
                c++;
            }
            else{
                if(po==oc && pz==zc){
                    return -1;
                }
                po=oc;
                pz=zc;
                if(oc>=k){
                    oc-=k;
                    zc+=k;
                }
                else{
                    zc+=k-oc;
                    oc=k-oc;
                }
                c++;
            }
        }
        return c;
    }
}
