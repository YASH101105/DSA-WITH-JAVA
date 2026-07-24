class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
       Queue<Integer> queue = new LinkedList<>();
       for(int i = nums.length-1 ;i>=0;i--){
        queue.offer(nums[i]);
       }
        while (k > 1) {
            queue.poll();
            k--;
        }
return queue.peek();
}
}