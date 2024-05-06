class Solution {
    public int shipWithinDays(int[] weights, int days) {
       int low = Integer.MIN_VALUE,high=0;
        for(int num:weights){
            low = Math.max(low,num);
            high += num;
        }
        
        while(low<=high){
            int mid = (low + high)/2;
            int numOfDays = findDays(weights,mid);
            if(numOfDays<=days){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    
    public static int findDays(int[] weights, int mid){
        int days=1;
        int load=0;
        for(int i=0;i<weights.length;i++){
            if(load+weights[i]>mid){
                days += 1;
                load = weights[i];
            }else{
                load += weights[i];
            }
        }
        return days;
    }
}