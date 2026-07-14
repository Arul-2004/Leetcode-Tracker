// Last updated: 7/14/2026, 2:12:01 PM
class Solution {
    public List<String> fizzBuzz(int n) {
        int i;
        ArrayList<String> r = new ArrayList<>();
        for ( i = 1; i <= n; i++) 
        {
            if (i % 3 == 0 && i % 5 == 0) 
            {
                r.add("FizzBuzz");
            } else if (i % 3 == 0) 
            {
                r.add("Fizz");
            } else if (i % 5 == 0)
            {
                r.add("Buzz");
            } else {
                r.add(Integer.toString(i));
            }
        }
        for (i=0;i<r.size();i++) {
           
        }
        return r;
    }
}
