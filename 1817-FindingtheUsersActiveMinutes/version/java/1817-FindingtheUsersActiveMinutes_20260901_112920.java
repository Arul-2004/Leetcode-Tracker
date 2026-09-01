// Last updated: 9/1/2026, 11:29:20 AM
1class Solution {
2    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
3      HashMap<Integer,HashSet<Integer>>map=new HashMap<>();
4      for(int i=0;i<logs.length;i++){
5        int u=logs[i][0];
6        int m=logs[i][1];
7        if(!map.containsKey(u)){
8            map.put(u,new HashSet<>());
9        }
10        map.get(u).add(m);
11      }
12      int []a=new int [k];
13      for(int u:map.keySet()){
14        int ms=map.get(u).size();
15        a[ms-1]++;
16      } 
17      return a; 
18    }
19}