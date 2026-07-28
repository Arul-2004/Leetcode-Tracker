// Last updated: 7/28/2026, 4:28:13 PM
1class Solution {
2    public int arrayNesting(int[] nums) {
3       boolean v[]=new boolean[nums.length];
4       int ml=0;
5       for(int i=0; i < nums.length; i++){
6        if(!v[i]){
7            int c=i;
8            int co=0;
9             while (!v[c]) {
10                    v[c] = true;
11                    c = nums[c];
12                    co++;
13                }
14                ml = Math.max(ml, co);
15            }
16       }
17            return ml;
18        }
19        }
20       