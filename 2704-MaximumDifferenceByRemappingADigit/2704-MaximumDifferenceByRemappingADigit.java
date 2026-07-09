// Last updated: 7/9/2026, 9:50:57 AM
class Solution {
    public int minMaxDifference(int num) {
        String n = String.valueOf(num);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(char d = '0' ; d <= '8' ; d++) {
            String replaced = n.replace(d , '9');
            int value = Integer.parseInt(replaced);
            max=Math.max(max , value);
        }
        for(char d= '1' ; d <='9'; d++){
            String replaced = n.replace(d , '0');
            int value = Integer.parseInt(replaced);
            min=Math.min(min,value);
        }
        return max-min;
    }
}