class Solution {

    public boolean checkRecord(String s) {

        int countA = 0;
        int countL = 0;

        for (char num : s.toCharArray()) {

            if (num == 'A') {
                countA++;
                countL = 0;
            }

            if (num == 'L') {
                countL++;
            }

            if (num == 'P') {
                countL = 0;
            }

            if (countA >= 2 || countL >= 3) {
                return false;
            }
        }

        return true;
    }
}