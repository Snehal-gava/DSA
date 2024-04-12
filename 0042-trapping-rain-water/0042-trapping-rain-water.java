class Solution {
    public int trap(int[] height) {
        int left[] = new int[height.length];
        int[] right = new int[height.length];
        if(height.length<=0)
            return 0;
        
        left[0] = height[0];
        for(int i=1;i<height.length;i++){
            left[i] = Math.max(height[i], left[i-1]);
        }
        
        right[height.length-1] = height[height.length-1];
        for(int j=height.length-2;j>=0;j--){
            right[j] = Math.max(right[j+1],height[j]);
        }  
        
        int ans = 0;
        for(int i=0;i<height.length;i++){
            ans+= (Math.min(right[i], left[i])) - height[i];
        }
        return ans;
    }
}