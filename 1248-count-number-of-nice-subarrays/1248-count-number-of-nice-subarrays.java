class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n=nums.length;
        int l=0,r=0,oddcount=0;
        int totalCount=0;
        int temp=0;
        
        while(r<n){
            if(nums[r]%2 == 1){
                oddcount++;
                temp=0;
            }
        
            while(oddcount==k){
                temp++;
                if(nums[l]%2 ==1){
                        oddcount--;
                }
                l++;
            }
            totalCount += temp;
            r++;
            
        }
        return totalCount;
    }
}

        