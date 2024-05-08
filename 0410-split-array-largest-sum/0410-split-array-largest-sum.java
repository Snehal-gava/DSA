class Solution {
     public int splitArray(int[] nums, int m) {
       int low=Integer.MIN_VALUE;
        int high = 0;
         for(int i=0;i<nums.length;i++){
             low= Math.max(low,nums[i]);
             high +=nums[i];
         }
         
         while(low<=high){
             int mid=(low+high)/2;
             int partition = maxSum(nums,mid);
             if(partition>m){
                 low=mid+1;
             }else{
                 high=mid-1;
             }
         }
         return low;
    }
    public int maxSum(int[] nums, int mid){
        int n = nums.length;
        int partition=1;
        int subArraySum=0;
        for(int i=0;i<n;i++){
            if(subArraySum+nums[i] <=mid){
                subArraySum +=nums[i];
            }else{
                subArraySum=nums[i];
                partition++;
            }
        }
        return partition;
    }
}