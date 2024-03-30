class Solution {
    public void moveZeroes(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                c++;
            }
        }
        int len = nums.length;
        int j=0,k=0;
        while(k<len){
            if(nums[k]!=0){
                nums[j++]=nums[k];
            }
            k++;
        }
        while(j<len){
            nums[j++]=0;
        }
        
    }
}