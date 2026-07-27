// Last updated: 7/27/2026, 2:27:04 PM
1class Solution {
2    public int maxVowels(String s, int k) {
3    int c=0;
4    for(int i=0;i<k;i++){
5        char ch=s.charAt(i);
6        if(ch=='a'||ch=='i'||ch=='e'||ch=='o'||ch=='u'){
7            c++;
8        }
9    }
10    int m=c;
11    for(int i=k;i<s.length();i++){
12        char ch=s.charAt(i);
13        char l=s.charAt(i-k);
14        if(l=='a'||l=='i'||l=='e'||l=='o'||l=='u'){
15            c--;
16    }
17        char r=s.charAt(i);
18        if(r=='a'||r=='e'||r=='i'||r=='o'||r=='u'){
19            c++;
20        }
21        m=Math.max(c,m);
22    }
23    return m;
24    }
25}