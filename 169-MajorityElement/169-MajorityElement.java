// Last updated: 7/14/2026, 2:12:22 PM
class Solution {
    public int majorityElement(int[] nums) {
     int c=0,t=0,i;
     for(i=0;i<nums.length;i++){
          
          if(c==0)
          t=nums[i];
          if(t==nums[i])
          c++;
          else
          c--;
     }
     return t;
     }   
    }
