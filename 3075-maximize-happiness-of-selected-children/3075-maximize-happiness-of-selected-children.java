class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        int n = happiness.length;
        Integer[] arr = new Integer[n];
        for(int i=0;i<n;i++){
            arr[i]=happiness[i];
        }
        
        Arrays.sort(arr,Collections.reverseOrder());
        long res=0;
        int turn =0;
        
        for(int i=0;i<k;i++){
            res += Math.max(arr[i]-turn,0);
            turn++;
        }
        return res;
    }
}