class Solution {
    public int scoreOfString(String s) {
        int i=0,j=i+1;
        int ans=0;
        while(j<s.length() && i<j){
            ans += Math.abs((s.charAt(i)-'a')-(s.charAt(j)-'a'));
            i++;
            j++;
        }
        return ans;
    }
}