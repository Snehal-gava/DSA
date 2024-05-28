class Solution {
    public int characterReplacement(String s, int k) {
        int[] mp = new int[26];
        int n=s.length();
        int l=0,r=0,max=0;
        int maxlen=0;
        while(r<n){
            
            mp[s.charAt(r)-'A']++;
            max = Math.max(max, mp[s.charAt(r)-'A']);
            
            
            if(r-l+1-max>k){
                mp[s.charAt(l)-'A']--;
                l++;
            }
            maxlen = Math.max(maxlen,r-l+1);
            r++;
        }
        return maxlen;
    }
}