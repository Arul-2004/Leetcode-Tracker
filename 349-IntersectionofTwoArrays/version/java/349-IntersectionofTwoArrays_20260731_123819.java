// Last updated: 7/31/2026, 12:38:19 PM
1class Solution {
2    public int numJewelsInStones(String jewels, String stones) {
3        HashSet<Character> s1 = new HashSet<>();
4        for (char c1 : jewels.toCharArray()) {
5            s1.add(c1);
6        }
7        int c = 0;
8        for (char s : stones.toCharArray()) {
9            if (s1.contains(s)) {
10                c++;
11            }
12        }
13
14        return c;
15    }
16}