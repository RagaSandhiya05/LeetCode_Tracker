// Last updated: 7/9/2026, 9:53:46 AM
class Solution {
    public int minimumDeletions(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        int ans = 0;
        for(char ch : s.toCharArray()){
            if(ch == 'b'){
                st.push('b');
            }
            else {
                if(!st.isEmpty()){
                    ans++;
                    st.pop();
                }
            }
        }
        return ans;
    }
}
               