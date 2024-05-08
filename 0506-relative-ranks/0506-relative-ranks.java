class Solution {
    public String[] findRelativeRanks(int[] score) {
        int N= score.length;
        int[] scorecopy = new int[N];
        System.arraycopy(score,0,scorecopy,0,N);
        
        Map<Integer,Integer> scoreToIndex = new HashMap<>();
        for(int i=0;i<N;i++){
            scoreToIndex.put(scorecopy[i],i);
        }
        
        Arrays.sort(scorecopy);
        String[] rank = new String[N];
        for(int i=0;i<N;i++){
            if(i==0){
                rank[scoreToIndex.get(scorecopy[N-i-1])]="Gold Medal";
            }else if(i==1){
                rank[scoreToIndex.get(scorecopy[N-i-1])]="Silver Medal";
            }else if(i==2){
                rank[scoreToIndex.get(scorecopy[N-i-1])]="Bronze Medal";
            }else{
                rank[scoreToIndex.get(scorecopy[N-i-1])]=Integer.toString(i+1);
            }
        }
        return rank;
    }
}