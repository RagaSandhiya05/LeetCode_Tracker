// Last updated: 7/9/2026, 9:55:10 AM
class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] brokenArray = brokenLetters.split("");
        String[] textArray = text.split(" ");
        int count = textArray.length;
        if(brokenLetters.equals("")){
            System.out.println(count);
            return count;
        }
        else {
            for (int i = 0; i < textArray.length; i++) {
                for (int j = 0; j < brokenArray.length; j++) {
                    if (textArray[i].contains(brokenArray[j])){
                        count--;
                        break;
                    }
                }
            }
            System.out.println(count);
            return count;
        }
    }
}
