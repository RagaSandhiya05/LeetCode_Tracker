// Last updated: 7/9/2026, 9:56:34 AM
// Student Attendance Record I
class Solution {
    public boolean checkRecord(String s) {
        int countA = 0;
        int countL = 0;
        for(char ch : s.toCharArray()) {
            if(ch != 'L')
            countL = 0;
            if(ch == 'L')
            countL++;
            if(ch == 'A')
            countA++;
            if(countA == 2 || countL == 3)
            return false;
        }
        return true;
    }
}