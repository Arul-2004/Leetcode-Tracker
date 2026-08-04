// Last updated: 8/4/2026, 12:45:14 PM
1class Solution {
2    public int minFlipsMonoIncr(String s) {
3       int zf=0;
4       int of=0;
5       for(char ch:s.toCharArray()){
6        if(ch=='1'){
7         zf++;
8        }
9        else{
10            of=Math.min(of+1,zf);
11        }
12       }
13       return of;
14    }
15}