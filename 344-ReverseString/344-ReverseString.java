// Last updated: 7/14/2026, 2:12:06 PM
class Solution {
    public void reverseString(char[] s) {
        String r="";
        for(int i=s.length-1;i>=0;i--){
            char ch=s[i];
            r=r+s[i];
        }
       for(int i=0;i<s.length;i++){
        s[i]=r.charAt(i);
       }
    }
}