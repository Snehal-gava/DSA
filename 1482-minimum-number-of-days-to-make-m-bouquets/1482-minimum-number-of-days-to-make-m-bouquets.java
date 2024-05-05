class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        long val = (long)m*k;
        if(bloomDay.length<val) return -1;
        
        int minval=Integer.MAX_VALUE;
        int maxval = Integer.MIN_VALUE;
        for(int i=0;i<bloomDay.length;i++){
            minval=Math.min(minval,bloomDay[i]);
            maxval=Math.max(maxval,bloomDay[i]);
        }
        
        int low=minval, high=maxval;
        
        while(low<=high){
            int mid=(low+high)/2;
            if(possible(bloomDay,mid,m,k)){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    } 
    
    public boolean possible(int[] bloomDay,int mid,int m,int k){
        int cnt=0;
        int noOfB=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=mid){
                cnt++;
            }else{
                noOfB += cnt/k;
                cnt=0;
            }
        }
        noOfB += cnt/k;
        return noOfB >= m;
    }
}