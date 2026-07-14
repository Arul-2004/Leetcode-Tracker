// Last updated: 7/14/2026, 2:11:45 PM
class Solution {
    public boolean isSameAfterReversals(int num) {
        int temp=num, d,ans=0;
        while(num!=0){
            d=num%10;
            num=num/10;
            ans=ans*10+d;
        }
        int r,rn=0;
        while(ans!=0){
           r=ans%10;
           ans=ans/10;
           rn=rn*10+r;
        }
       
        if(temp==rn)
        return true;
       else
        return false;
    }
}