class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int zero = 0;
        int sum = 1;
        int arr[] = new int[n];
        int count = 0;
        boolean x = false;
        for(int i = 0; i<n ; i++){
            if(nums[i] == 0){
                x = true;
                count++;
                continue;
            }
            sum *= nums[i];
        }
        if(count == n || count > 1){
            sum = 0;
        }
        for(int i = 0; i<n ; i++){
            if(x){
                if(nums[i] == 0){
                    arr[i] = sum;
                }
                else{
                    arr[i] = 0;
                }
            }
            else{
                if(nums[i] == 0){
                    arr[i] = sum;
                }
                else{
                    arr[i] = sum / nums[i];
                }
            }
        }
        return arr;
    }
}