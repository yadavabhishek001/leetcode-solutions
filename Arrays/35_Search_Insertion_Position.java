class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        while(left <= right){
            if(nums[left] > target){
                return left;
            }
            if(nums[right] < target){
                return right+1;
            }
            int mid = left + (right - left)/2 ;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return left+1;
    }
}
