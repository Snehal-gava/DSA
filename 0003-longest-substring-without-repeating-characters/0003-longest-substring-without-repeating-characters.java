class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int i=0,j=0,max=0;
        Set<Character> st = new HashSet<>();
        
        while(j<n){
            if(!st.contains(s.charAt(j))){
                st.add(s.charAt(j++));
                max = Math.max(st.size(),max);
            }else{
                st.remove(s.charAt(i++));
            }
        }
        return max;
    }
}