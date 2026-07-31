// Last updated: 7/31/2026, 12:12:35 PM
1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3        HashSet <Integer>s=new HashSet<>();
4        boolean isd=false;
5        for(int n:nums){
6            if(s.contains(n)){
7                return true;
8            }
9            else{
10                s.add(n);
11            }
12        }
13        
14        return false;
15    }
16}