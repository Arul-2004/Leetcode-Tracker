// Last updated: 8/5/2026, 2:48:42 PM
1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3       int l=0;
4       int r=numbers.length-1;
5       while(l<r){
6       int s=numbers[l]+numbers[r];
7       if(s==target){
8        return new int []{l+1,r+1};
9       }
10       else if(s<=target){
11        l++;
12        }
13        else{
14            r--;
15        }
16       }
17       
18       return new int[]{-1, -1};
19    }
20}