class Solution {
    public int secondHighest(String s) {
        int high = -1;
        int secondhigh = -1;
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                int digit = ch-'0';
            if(digit > high){
                secondhigh=high;
                high = digit;
            }
            else if(digit!=high && digit>secondhigh){
                secondhigh = digit;
            }
        }
        }
        return secondhigh;
    }
}