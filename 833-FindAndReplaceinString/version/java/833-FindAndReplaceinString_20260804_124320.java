// Last updated: 8/4/2026, 12:43:20 PM
1class Solution {
2    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
3        int n=indices.length;
4        String []replace=new String[s.length()];
5        int []skip=new int[s.length()];
6        for(int i=0;i<n;i++){
7            int idx=indices[i];
8            if(s.startsWith(sources[i],idx)){
9                replace[idx]=targets[i];
10                skip[idx]=sources[i].length();
11            }
12        }
13        StringBuilder ans=new StringBuilder();
14         for(int i=0;i<s.length();){
15            if(replace[i]!=null){
16                ans.append(replace[i]);
17                i+=skip[i];
18            }
19            else{
20                ans.append(s.charAt(i));
21                i++;
22            }
23         }
24         return ans.toString();
25    }
26}