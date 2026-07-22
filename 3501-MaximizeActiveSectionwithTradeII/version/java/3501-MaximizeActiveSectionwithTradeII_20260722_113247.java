// Last updated: 7/22/2026, 11:32:47 AM
1// Maximize Active Section with Trade II
2import java.util.*;
3import java.util.regex.*;
4import java.util.stream.IntStream;
5class Solution {
6    private int[] zs , ze , V;
7    private int nblocks;
8    private List<int[]> sparse;
9    public List<Integer> maxActiveSectionsAfterTrade(String s , int queries[][]) {
10        int ones = (int) s.chars().filter(c -> c == '1').count();
11        List<Integer> zsL = new ArrayList<>() , zeL = new ArrayList<>();
12        Matcher mo = Pattern.compile("0+").matcher(s);
13        while(mo.find()) {
14            zsL.add(mo.start());
15            zeL.add(mo.end() - 1);
16        }
17        zs = zsL.stream().mapToInt(Integer::intValue).toArray();
18        ze = zeL.stream().mapToInt(Integer::intValue).toArray();
19        nblocks = zs.length;
20        V = IntStream.range(0 , nblocks - 1).map(j -> (ze[j] - zs[j] + 1) + (ze[j + 1] - zs[j + 1] + 1)).toArray();
21        int nv = V.length;
22        sparse = new ArrayList<>();
23        sparse.add(V);
24        for(int half = 1 ; half * 2 <= nv ; half = half * 2) {
25            int prev[] = sparse.get(sparse.size() - 1);
26            int next[] = new int[prev.length - half];
27            for(int i = 0 ; i < next.length ; i++)
28            next[i] = Math.max(prev[i] , prev[i + half]);
29            sparse.add(next);
30        }
31        List<Integer> ans = new ArrayList<>(queries.length);
32        for(int q[] : queries)
33        ans.add(ones + gain(q[0] , q[1]));
34        return ans;
35    }
36    private int rmq(int low , int high) {
37        int t = 31 - Integer.numberOfLeadingZeros(high - low + 1);
38        return Math.max(sparse.get(t)[low] , sparse.get(t)[high - (1 << t) + 1]);
39    }
40    private int clip(int j , int l , int r) {
41        return V[j] - Math.max(0 , l - zs[j]) - Math.max(0 , ze[j + 1] - r);
42    }
43    private int gain(int l , int r) {
44        if(nblocks < 2)
45        return 0;
46        int ja = lowerBound(ze , l);
47        int jb = upperBound(zs , r) - 2;
48        if(ja > jb)
49        return 0;
50        return Math.max(Math.max(clip(ja , l , r) , clip(jb , l , r)) , jb - ja >= 2 ? rmq(ja + 1 , jb - 1) : 0);
51    }
52    private static int lowerBound(int a[] , int x) {
53        int low = 0;
54        int high = a.length;
55        while(low < high) {
56            int mid = (low + high) >>> 1;
57            if(a[mid] < x)
58            low = mid + 1;
59            else
60            high = mid;
61        }
62        return low;
63    }
64    private static int upperBound(int a[] , int x) {
65        int low = 0;
66        int high = a.length;
67        while(low < high) {
68            int mid = (low + high) >>> 1;
69            if(a[mid] <= x)
70            low = mid + 1;
71            else
72            high = mid;
73        }
74        return low;
75    }
76}
77       