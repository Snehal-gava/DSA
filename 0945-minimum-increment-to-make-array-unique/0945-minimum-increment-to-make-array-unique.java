class Solution {
    public int minIncrementForUnique(int[] nums) {
       int minIncreaments = 0;
        
        Arrays.sort(nums);
        
        for(int i=1;i<nums.length;i++){
            if(nums[i]<=nums[i-1]){
                int increament = nums[i-1]+1-nums[i];
                minIncreaments += increament;
                
                nums[i]=nums[i-1]+1;
            }
        }
        return minIncreaments;
    }
}