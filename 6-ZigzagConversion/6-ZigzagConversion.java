// Last updated: 7/14/2026, 2:12:49 PM
class Solution {
    public String convert(String s, int numRows) {

        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        String ans = "";
        int cycleLen = 2 * (numRows - 1);

        for (int row = 0; row < numRows; row++) {

            for (int j = row; j < s.length(); j += cycleLen) {

                // Vertical character
                ans += s.charAt(j);

                // Diagonal character for middle rows
                int diagonal = j + cycleLen - 2 * row;

                if (row != 0 &&
                    row != numRows - 1 &&
                    diagonal < s.length()) {

                    ans += s.charAt(diagonal);
                }
            }
        }

        return ans;
    }
}