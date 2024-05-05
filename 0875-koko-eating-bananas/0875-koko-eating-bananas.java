class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1, high=findMax(piles);
        while(low<=high){
            int mid=(low+high)/2;
            int totalH= calculateTotalHours(piles,mid);
            if(totalH<=h){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    
    public int findMax(int[] piles){
        int maxnum=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            maxnum = Math.max(maxnum,piles[i]);
        }
        return maxnum;
    }
    
    public int calculateTotalHours(int[] piles, int h){
        int totalH=0;
        for(int i=0;i<piles.length;i++){
            totalH +=Math.ceil((double)(piles[i])/(double)(h));
        }
        return totalH;
    }
}