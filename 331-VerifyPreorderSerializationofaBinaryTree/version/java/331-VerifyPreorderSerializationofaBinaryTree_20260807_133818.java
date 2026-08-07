// Last updated: 8/7/2026, 1:38:18 PM
1class Solution {
2    public boolean isValidSerialization(String preorder) {
3    String []n=preorder.split(",");
4    int sl=1;
5    for(String ns:n){
6      sl--;
7      if(sl<0){
8        return false;
9      }
10      if(!ns.equals("#")){
11        sl+=2;
12      }
13    }
14    return sl==0;    
15    }
16}