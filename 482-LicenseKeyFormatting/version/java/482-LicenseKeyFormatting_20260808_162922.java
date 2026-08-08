// Last updated: 8/8/2026, 4:29:22 PM
1class Solution {
2    public String licenseKeyFormatting(String s, int k) {
3        String w[]=s.split("-");
4        String r="";
5        for(String ws:w){
6            for(int i=0;i<ws.length();i++){
7                char ch=ws.charAt(i);
8                r=r+Character.toUpperCase(ch);
9            }
10        }
11        String a="";
12        int c=0;
13        for(int i=r.length()-1;i>=0;i--){
14            a=r.charAt(i)+a;
15            c++;
16            if(c==k&&i!=0){
17                a='-'+a;
18                c=0;
19            }
20        }
21        return a;
22    }
23}
24