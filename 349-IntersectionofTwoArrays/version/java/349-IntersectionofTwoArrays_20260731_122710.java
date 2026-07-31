// Last updated: 7/31/2026, 12:27:10 PM
1class Solution {
2    public int[] intersection(int[] nums1, int[] nums2) {
3      HashSet<Integer>s1=new HashSet<>();
4      for(int n1:nums1){
5        s1.add(n1);
6      } 
7      HashSet<Integer>s2=new HashSet<>();
8      for(int n2:nums2){
9        s2.add(n2);
10      } 
11      HashSet<Integer>s=new HashSet<>();
12      for(int n:s1){
13        if(s2.contains(n)){
14            s.add(n);
15        }
16      }
17      int r[]=new int [s.size()];
18      int i=0;
19      for(int n:s){
20        r[i]=n;
21        i++;      
22        }
23        return r;
24    }
25}