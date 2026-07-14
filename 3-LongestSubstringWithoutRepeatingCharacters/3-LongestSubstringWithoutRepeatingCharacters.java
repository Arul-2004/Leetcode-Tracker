// Last updated: 7/14/2026, 2:12:51 PM
class Solution {
    public int lengthOfLongestSubstring(String s) {
    boolean arr[]=new boolean [128];
    int l=0;
    int maxl=0;
    for(int r=0;r<s.length();r++){
    char c=s.charAt(r);
    while(arr[c]){
        arr[s.charAt(l)]=false;
        l++;
    }
    arr[c]=true;
     maxl=Math.max(maxl,r-l+1);   
    }    
   
     return maxl; 
    }
   
}