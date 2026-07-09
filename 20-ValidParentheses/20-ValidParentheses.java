// Last updated: 7/9/2026, 10:01:58 AM
import java.util.Stack;
class Solution {
    public boolean isValid(String str) {
        Stack<Character> sc = new Stack<>();
        int n = str.length();
        for(int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[') {
                sc.push(ch);
            } else {
                if(sc.isEmpty()) return false;
                char top = sc.pop();
                if ((ch == ')' && top != '(') ||
                (ch == '}' && top != '{') ||
                (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return sc.isEmpty();
    }
}
              