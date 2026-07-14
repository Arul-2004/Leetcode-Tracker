// Last updated: 7/14/2026, 2:11:47 PM
class Solution {
    public String capitalizeTitle(String title) {
        String s=title.toLowerCase();
         String []w =s.split(" ");
         String res="";
         for(String ws:w){
            for(int i=0;i<ws.length();i++){
                char ch=ws.charAt(i);
                if(i==0 && ws.length()>2)
                res+=Character.toUpperCase(ch);
                else 
                res+=ch;
            }
             res=res+" ";
         }
         return res.trim();
    }
}