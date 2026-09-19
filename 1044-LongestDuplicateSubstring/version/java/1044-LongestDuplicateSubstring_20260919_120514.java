// Last updated: 9/19/2026, 12:05:14 PM
1import java.util.*;
2
3class Solution {
4    public String longestDupSubstring(String s) {
5        int n = s.length();
6
7        long base = 256;
8        long mod = 1_000_000_007L;
9
10        long[] prefix = new long[n + 1];
11        long[] power = new long[n + 1];
12
13        power[0] = 1;
14
15        for (int i = 0; i < n; i++) {
16            prefix[i + 1] = (prefix[i] * base + s.charAt(i)) % mod;
17            power[i + 1] = (power[i] * base) % mod;
18        }
19
20        int low = 1, high = n - 1;
21        int bestStart = -1;
22        int bestLen = 0;
23
24        while (low <= high) {
25            int len = low + (high - low) / 2;
26
27            int start = findDuplicate(s, len, prefix, power, base, mod);
28
29            if (start != -1) {
30                bestStart = start;
31                bestLen = len;
32                low = len + 1;
33            } else {
34                high = len - 1;
35            }
36        }
37
38        return bestStart == -1
39                ? ""
40                : s.substring(bestStart, bestStart + bestLen);
41    }
42
43    private int findDuplicate(
44            String s,
45            int len,
46            long[] prefix,
47            long[] power,
48            long base,
49            long mod
50    ) {
51        Map<Long, List<Integer>> map = new HashMap<>();
52
53        for (int i = 0; i + len <= s.length(); i++) {
54            long hash = getHash(prefix, power, i, i + len, mod);
55
56            List<Integer> positions = map.computeIfAbsent(
57                    hash,
58                    k -> new ArrayList<>()
59            );
60
61            // Verify actual strings to avoid hash collision.
62            for (int prev : positions) {
63                if (s.regionMatches(prev, s, i, len)) {
64                    return i;
65                }
66            }
67
68            positions.add(i);
69        }
70
71        return -1;
72    }
73
74    private long getHash(
75            long[] prefix,
76            long[] power,
77            int left,
78            int right,
79            long mod
80    ) {
81        return (prefix[right] -
82                prefix[left] * power[right - left] % mod + mod) % mod;
83    }
84}