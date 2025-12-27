class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int lead = 1;
        int majority = nums[0];

        for(int i=1 ; i<n ; i++){
            if(nums[i] == majority){
                lead++;
            }
            else if(lead == 0){
                majority = nums[i];
                lead = 1;
            }
            else{
                lead--;
            }
        } return majority;
    }
}