// Last updated: 8/13/2026, 9:16:14 AM
1// Longest Substring of One Repeating Character
2class Solution {
3    static class Node { char leftChar ; char rightChar ; int length ; int prefix ; int suffix ; int best;
4    Node(char leftChar , char rightChar , int length , int prefix , int suffix , int best) {
5        this.leftChar = leftChar;
6        this.rightChar = rightChar;
7        this.length = length;
8        this.prefix = prefix;
9        this.suffix = suffix;
10        this.best = best;
11    }
12    }
13    private Node[] tree;
14    private Node merge(Node left , Node right) {
15        int length = left.length + right.length;
16        int prefix = left.prefix;
17        if(left.rightChar == right.leftChar && left.prefix == left.length) {
18            prefix = left.length + right.prefix;
19        }
20        int suffix = right.suffix;
21        if(left.rightChar == right.leftChar && right.suffix == right.length) {
22            suffix = right.length + left.suffix;
23        }
24        int best = Math.max(left.best , right.best);
25        if(left.rightChar == right.leftChar) {
26            best = Math.max(best , left.suffix + right.prefix);
27        }
28        return new Node(left.leftChar , right.rightChar , length , prefix , suffix , best);
29    }
30    private void build(int node , int start , int end , String s) {
31        if(start == end) {
32            tree[node] = new Node(s.charAt(start) , s.charAt(start) , 1 , 1 , 1 , 1);
33            return;
34        }
35        int mid = (start + end) / 2;
36        build(node * 2 , start , mid , s);
37        build(node * 2 + 1 , mid + 1 , end , s);
38        tree[node] = merge(tree[node * 2] , tree[node * 2 + 1]);
39    }
40    private void update(int node , int start , int end , int index , char ch) {
41        if(start == end) {
42            tree[node] = new Node(ch , ch , 1 , 1 , 1 , 1);
43            return;
44        }
45        int mid = (start + end) / 2;
46        if(index <= mid) {
47            update(node * 2 , start , mid , index , ch);
48        }
49        else {
50            update(node * 2 + 1 , mid + 1 , end , index , ch);
51        }
52        tree[node] = merge(
53            tree[node * 2] ,
54            tree[node * 2 + 1]
55        );
56    }
57    public int[] longestRepeating(String s, String queryCharacters, int[] queryIndices) {
58        int n = s.length();
59        tree = new Node[4 * n];
60        build(1 , 0 , n - 1 , s);
61        int answer[] = new int[queryIndices.length];
62        for(int i = 0 ; i < queryIndices.length ; i++) {
63            update(1 , 0 , n - 1 , queryIndices[i] , queryCharacters.charAt(i));
64            answer[i] = tree[1].best;
65        }
66        return answer;
67    }
68}