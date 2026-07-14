// Last updated: 7/14/2026, 2:11:51 PM
class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
       int s=0;
       for(int i=0;i<k;i++){
        s=s+arr[i];
       }
       int c=0;
       if(s/k>=threshold){
        c++;
       }
       
       int avg=0;
       for(int i=k;i<arr.length;i++){
          s=s-arr[i-k]+arr[i];
          avg=s/k;
          if(avg>=threshold){
            c++;
          }
       }
       return c;
    }
}