class Solution {
    public int maxProduct(int[] nums) {
        int max=nums[0], min=nums[0], result=nums[0];
        
        for(int i=1;i<nums.length;i++){
            int temp =   Math.max(Math.max(nums[i]*max,nums[i]*min),nums[i]);
            min=    Math.min(Math.min(nums[i]*min,nums[i]*max),nums[i]);
             max = temp;
            
            result = Math.max(result,max);
        }
        return result;
    }
}