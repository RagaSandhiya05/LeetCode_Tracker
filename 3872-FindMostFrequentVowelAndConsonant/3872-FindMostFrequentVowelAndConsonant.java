// Last updated: 7/9/2026, 9:47:22 AM
import java.util.*;

class Solution {
    public int maxFreqSum(String s) {
        Map<Character, Integer> v = new HashMap<>();
        Map<Character, Integer> c = new HashMap<>();

        for (char ch : s.toCharArray()) {
            if (Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch); // Optional: Normalize case
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    v.put(ch, v.getOrDefault(ch, 0) + 1);
                } else {
                    c.put(ch, c.getOrDefault(ch, 0) + 1);
                }
            }
        }

        int cMax = c.isEmpty() ? 0 : Collections.max(new ArrayList<>(c.values()));
        int vMax = v.isEmpty() ? 0 : Collections.max(new ArrayList<>(v.values()));

        return cMax + vMax;
    }
}