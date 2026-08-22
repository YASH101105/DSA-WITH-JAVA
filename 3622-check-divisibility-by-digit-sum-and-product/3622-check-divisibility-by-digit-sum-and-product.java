class Solution {
    public boolean checkDivisibility(int n) {
        int s = 0;
        int p = 1;
        int original = n;
        while(n>0){
        int r = n%10;
        s+=r;
        p*=r;
        n= n/10;
        }
        return original % (s+p)==0;
    }
}