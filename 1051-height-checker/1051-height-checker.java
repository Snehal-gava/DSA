class Solution {
    public int heightChecker(int[] heights) {
        int[] expeted = heights.clone();
        bubblesort(expeted);
        
        int count=0;
        
        for(int i=0;i<expeted.length;i++){
            if(heights[i] != expeted[i]){
                count++;
            }
        }
        return count;
    }
    public void bubblesort(int[] arr){
        int n=arr.length;
        
        for(int i=0;i<n;++i){
            for(int j=0;j<n-i-1;++j){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}