class Solution {
    public int smallestNumber(int n) {
       
       int x = n;
       while((x&(x+1))!=0){//checking the number is 1 lesss than the greater power of the 2 
        x++;
       }
       return x;
    }
}