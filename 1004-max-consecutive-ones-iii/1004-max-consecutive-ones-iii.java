class Solution {
    public int longestOnes(int[] nums, int k) {
        int start=0;
        int end=0;
        int countZero=0;
        while(end<nums.length){
            if(nums[end] == 0){
                countZero++;
            }
            end++;
            if(countZero>k){
                if(nums[start]==0){
                    countZero--;
                }
                start++;
            }
            
        }
        return end-start;
    }
}