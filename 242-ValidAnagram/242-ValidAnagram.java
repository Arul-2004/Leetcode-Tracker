// Last updated: 7/14/2026, 2:12:13 PM
class Solution {
    public boolean isAnagram(String s, String t) {
    int [] count=new int [26];
      if(s.length()!=t.length()){
        return false;
      }
      for(int i=0;i<s.length();i++){
        count[s.charAt(i)-'a']++;
        count[t.charAt(i)-'a']--;
      }
      for(int i=0;i<count.length;i++){
        int x=count[i];
        if(x!=0){
            return false;
        }
        
      }
      return true;
    }
}