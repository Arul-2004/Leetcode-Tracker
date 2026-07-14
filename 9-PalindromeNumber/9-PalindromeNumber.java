// Last updated: 7/14/2026, 2:12:48 PM
class Solution {
    public boolean isPalindrome(int x) {
     int t=x,d,ans=0;
     if(x<0||(x!=0 && x%10==0))
     return false;
     while(x!=0)
     {
        d=x%10;
        ans = ans*10+d;
        x=x/10;
     }
     if(ans==t)
     return true ;
     else 
     return false;
    }
}    
    
