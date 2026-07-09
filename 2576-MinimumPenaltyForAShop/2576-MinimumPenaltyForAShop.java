// Last updated: 7/9/2026, 9:51:08 AM
class Solution {
    public int bestClosingTime(String customers) {
        int n = customers.length();
        int[] countY = new int[n];
        countY[0] = customers.charAt(0) == 'Y' ? 1 : 0;
        for(int i = 1 ; i < n ; i++){
            countY[i] = countY[i-1] + (customers.charAt(i) == 'Y' ? 1 : 0);
        }
        int totalY = countY[n-1];
        int minPenalty = totalY;
        int bestHour = 0;
        for(int i = 1 ; i < n ; i++){
            int openPenalty = i-countY[i-1];
            int closedPenalty = totalY - countY[i];
            int hourPenalty = (customers.charAt(i) == 'Y') ? 1 : 0;
            int penalty = openPenalty + closedPenalty + hourPenalty;
            if(penalty < minPenalty){
                minPenalty = penalty;
                bestHour = i;
            }
        }
        int allDayOpenPenalty = n - totalY;
        return allDayOpenPenalty < minPenalty ? n : bestHour;
    }
}
            