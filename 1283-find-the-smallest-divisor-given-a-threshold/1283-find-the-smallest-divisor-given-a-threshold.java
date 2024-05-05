class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1, high=maxNum(nums);
        
        while(low<=high){
            int mid=(low+high)/2;
            int smallestDiv=CalculateDivisor(nums,mid);
            
            if(smallestDiv<=threshold){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    
    public int maxNum(int[] nums){
        int maxnum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            maxnum=Math.max(maxnum,nums[i]);
        }
        return maxnum;
    }
    
    public int CalculateDivisor(int[] nums, int threshold){
        int sum=0;
        
        for(int i=0;i<nums.length;i++){
            sum += Math.ceil((double)nums[i]/(double)threshold);
        }
        return sum;
    }
}