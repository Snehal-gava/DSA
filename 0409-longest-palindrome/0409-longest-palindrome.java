class Solution {
    public int longestPalindrome(String s) {
        Set<Character> charSet = new HashSet<>();
        int res=0;
        
        for(char c:s.toCharArray()){
            if(charSet.contains(c)){
                charSet.remove(c);
                res +=2;
            }else{
                charSet.add(c);
            }
        }
        if(!charSet.isEmpty()) res++;
        return res;
    }
}