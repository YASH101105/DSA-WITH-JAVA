class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
       int sum =0;
       for(int a :apple){
        sum+=a;
       }
    Integer[] CapArray = new Integer[capacity.length];
    for(int i = 0;i<capacity.length;i++){
        CapArray[i] = capacity[i];
    }

    Arrays.sort(CapArray,Collections.reverseOrder());
    int ans= 0;
    while(sum>0){
        sum -= CapArray[ans];
        // yha pr boxes km hote ja rahe h or sum of apples jarha h 
        ans+=1;// or yha pr hum no. of boxes kitne need h bo de rahe h 

    }
    return ans;
 }
}