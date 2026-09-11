// Last updated: 9/11/2026, 12:24:39 PM
1class Solution {
2    public int totalFruit(int[] fruits) {
3    int f[]=new int [100001];
4    int l=0;
5    int t=0;
6    int m=0;
7    for(int r=0;r<fruits.length;r++){
8        if(f[fruits[r]]==0){
9            t++;
10        }
11        f[fruits[r]]++;
12        while(t>2){
13            f[fruits[l]]--;
14            if(f[fruits[l]]==0){
15                t--;
16            }
17            l++;
18        }
19        m=Math.max(m,r-l+1);
20    } 
21    return m;   
22    }
23}