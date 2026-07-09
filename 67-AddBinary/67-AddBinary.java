// Last updated: 7/9/2026, 10:01:15 AM
class Solution {
    public String addBinary(String a, String b) {
        if(a.length() < b.length()) return addBinary(b,a);
        int i = a.length();
        int j = b.length();
        int carry = 0;
        char[] arr = new char[i+1];
        while(i > 0) {
            carry += a.charAt(--i) - '0';
            if(j > 0) carry += b.charAt(--j) - '0';
            arr[i+1] = (char) (carry % 2 + '0');
            carry/=2;
        }
        if(carry==0) return new String(arr , 1 , arr.length-1);
        arr[0] = '1';
        return new String(arr);
        }
}