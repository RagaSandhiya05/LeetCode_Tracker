// Last updated: 7/9/2026, 9:57:19 AM
class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder s1 = new StringBuilder();
        int i = num1.length() - 1 , j = num2.length() - 1 , carry = 0;
        while(i >= 0 || j >= 0 || carry != 0) {
            int digit1 = (i >= 0) ? num1.charAt(i--)-'0' : 0;
            int digit2 = (j >= 0) ? num2.charAt(j--)-'0' : 0;
            int sum = digit1 + digit2 + carry;
            carry = sum / 10;
            s1.append(sum % 10);
        }
        return s1.reverse().toString();
    }
}