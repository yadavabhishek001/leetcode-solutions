class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==0) return 0;

        int curr = nums[0];
        int ms = nums[0];

        for(int i = 1; i<nums.length; i++){
            curr = Math.max(nums[i],curr+nums[i]);
            ms = Math.max(ms,curr);
        }
        return ms;
    }
}