class Solution {
    public int firstMatchingIndex(String s) {
        int n = s.length();
        int i = 0 ;
     int end = n-i-1;
     while(i<=end){
        if(s.charAt(i)==s.charAt(end)){
            return i;
        }
        i++;
        end--;
     }
     return -1;
    }
}