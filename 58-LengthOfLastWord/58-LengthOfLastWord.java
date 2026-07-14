// Last updated: 7/14/2026, 2:12:35 PM
class Solution {
    public int lengthOfLastWord(String s) {
    String[] w =s.trim().split(" ");
    return w[w.length-1].length();
    }
}