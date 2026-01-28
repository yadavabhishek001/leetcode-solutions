class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        float sum = 0;
        for(int i = 0; i<n ; i++){
            sum += nums[i];
        }
        float sum1 = 0;
        for(int i = 0; i<n ; i++){
            float a = (sum - nums[i]) / 2;
            if(  a == sum1 ){
                return i;
            }
            else{
                sum1 += nums[i];
            }
        }
        return -1;
    }
}
