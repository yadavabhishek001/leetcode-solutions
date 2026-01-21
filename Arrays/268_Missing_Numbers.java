class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int totalSum = ( n+1 ) * n / 2 ;
        int arrSum = 0;
        for(int i = 0; i < n ; i++){
            arrSum += nums[i];
        }
        int x = totalSum - arrSum;
        return x;
    }
}