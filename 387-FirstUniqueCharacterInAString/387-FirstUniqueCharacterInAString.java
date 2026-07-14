// Last updated: 7/14/2026, 2:12:03 PM
class Solution {
    public int firstUniqChar(String s) {
       HashMap <Character,Integer> f=new HashMap<>();
       for(char c:s.toCharArray()){
        f.put(c,f.getOrDefault(c,0)+1);
       } 
       for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(f.get(ch)==1)
        return i;
       }
       return -1;
    }
}