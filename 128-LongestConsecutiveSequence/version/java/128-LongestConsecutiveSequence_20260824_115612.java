// Last updated: 8/24/2026, 11:56:12 AM
1class Solution {
2    public int longestConsecutive(int[] nums) {
3      HashSet<Integer>s=new HashSet<>();
4      for(int x:nums){
5        s.add(x);
6      }
7      int l=0;
8      for(int n:s){
9        if(!s.contains(n-1)){
10        int cur=n;
11        int co=1;
12        while(s.contains(cur+1)){
13            cur++;
14            co++;
15        }
16        l=Math.max(l,co);
17        }
18      }
19      return l;  
20    }
21}