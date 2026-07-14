// Last updated: 7/14/2026, 2:11:53 PM
class Solution {
    public String makeLargestSpecial(String s) {
        if(s.length() <= 2) {
            return s;
        }
        ArrayList<String> list = new ArrayList<>();
        int count = 0;
        int start = 0;
        for(int i = 0; i < s.length(); i++) {

            if(s.charAt(i) == '1') {
                count++;
            } else {
                count--;
            }

            if(count == 0) {

                String inner = s.substring(start + 1, i);

                list.add("1" + makeLargestSpecial(inner) + "0");

                start = i + 1;
            }
        }

        Collections.sort(list, Collections.reverseOrder());

        String ans = "";

        for(String str : list) {
            ans += str;
        }

        return ans;
    }
}