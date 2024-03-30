class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] arr = new int[n1+n2];
        int i=0,j=0,k=0;
        while(i<n1 && j<n2){
            if(nums1[i]<nums2[j]){
                arr[k++]  =nums1[i++];
            }else{
                arr[k++] = nums2[j++];
            }
        }
        if(i<n1){
            while(i<n1){
            arr[k++] = nums1[i++];
            }
        }
        if(j<n2){
            while(j<n2){
            arr[k++]= nums2[j++];
            }
        }
        
        int n = n1+n2;
        if(n%2  == 1){
            return arr[((n+1)/2)-1];
        }else
            return ((double)arr[(n/2)-1]+(double)arr[(n/2)])/2.0;
    }
}