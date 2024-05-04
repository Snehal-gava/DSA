class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = firstElement(nums,target);
        int last=lastElement(nums,target);
        return new int[] {first,last};
    }
    public int firstElement(int[] nums,int target){
        int start=0;
        int end=nums.length-1;
        int first=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]>=target){
                end=mid-1;
            }else{
                start=mid+1;
            }
            if(nums[mid] == target)
                first=mid;
        }
        return first;
    }
    
    public int lastElement(int[] nums,int target){
        int start=0;
        int end=nums.length-1;
        int last=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]<=target){
                start=mid+1;
                
            }else{
                end=mid-1;
            }
            if(nums[mid] == target)
                last=mid;
        }
        return last;
    }
    
}