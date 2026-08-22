// Last updated: 8/22/2026, 10:25:48 PM
1// Remove K Digits
2class Solution {
3    public String removeKdigits(String num , int k) {
4      int l = num.length();
5      if(k == l) 
6      return "0";
7      Stack<Character> st = new Stack<>();
8      for(char digit : num.toCharArray()) {
9        while(!st.isEmpty() && k > 0 && st.peek() > digit) {
10            st.pop();
11            k--;
12        }
13        st.push(digit);
14      }
15      while(!st.isEmpty() && k > 0){
16         st.pop();
17            k--;
18      }
19      StringBuilder sb = new StringBuilder();
20      while(!st.isEmpty()){
21        sb.append(st.pop());
22      }
23      sb.reverse();
24      while(sb.length() > 1 && sb.charAt(0) == '0'){
25       sb.deleteCharAt(0);
26      }
27      return sb.toString();
28    }
29}