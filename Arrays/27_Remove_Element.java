class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        // int k = 0;
        int j = n-1;
        int i = 0;
        while(i<=j){
            if(nums[i] == val){
                nums[i] = nums[j];
                if(nums[i] == val){
                    j = j-1;
                    continue;
                }
                j = j-1;
                i++;
                // k++;
            }
            else{
                i++;
                // k++;
            }
            
        }
        return i;
    }
}