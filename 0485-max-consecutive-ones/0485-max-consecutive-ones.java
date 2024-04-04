class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxLen = 0;
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                maxLen=maxLen+1;
                ans=Math.max(ans,maxLen);
            }else{
                maxLen=0;
            }
        }
        return ans;
    }
}
