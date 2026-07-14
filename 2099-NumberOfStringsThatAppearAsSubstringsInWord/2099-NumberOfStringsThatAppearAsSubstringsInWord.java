// Last updated: 7/14/2026, 2:11:49 PM
class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int c=0;
        for(String p:patterns){
            if(word.contains(p)){
                c++;
            }
        }
    return c;
    }
}