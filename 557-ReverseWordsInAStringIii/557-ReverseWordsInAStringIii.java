// Last updated: 7/14/2026, 2:11:58 PM
class Solution {
    public String reverseWords(String s) {
        String rev="";
        String [] ar=s.split(" ");
        for(String ns:ar){
            for(int i=ns.length()-1;i>=0;i--){
                char ch=ns.charAt(i);
                rev=rev+ch;
            }
            rev=rev+" ";
        }
        return rev.trim();
    }
}