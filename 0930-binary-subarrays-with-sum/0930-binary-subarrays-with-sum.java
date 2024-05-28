class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n=nums.length;
        int l=0,totalcount=0;
        int prefixZero=0;
        int currentSum=0;
        
        for(int r=0;r<n;r++){
            currentSum += nums[r];
            
            while(l<r && (nums[l]==0 || currentSum>goal)){
                if(nums[l]==1){
                    prefixZero=0;
                }else{
                    prefixZero++;
                }
                
                currentSum  -=nums[l++];
            }
            if(currentSum==goal){
                totalcount += 1+prefixZero;
            }
        }
        return totalcount;
    }
}