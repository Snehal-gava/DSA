class Solution {
    public int maxDepth(String s) {
        int ans =0;
        int counter =0;        
        for(Character c : s.toCharArray()){
            if(c == '('){
                counter++;
            }else if (c == ')'){
               counter--;
            }
            ans = Math.max(ans,counter);
        }
        return ans;
    }
}