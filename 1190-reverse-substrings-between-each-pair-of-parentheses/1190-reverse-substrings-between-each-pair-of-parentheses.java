class Solution {
    public String reverseParentheses(String s) {
        int n=s.length();
        Stack<Integer> st = new Stack<>();
        int[] pair = new int[n];
        
        for(int i=0;i<n;++i){
            if(s.charAt(i) == '('){
                st.push(i);
            }
            if(s.charAt(i)==')'){
                int j=st.pop();
                pair[i]=j;
                pair[j]=i;
            }
        }
        
        StringBuilder result = new StringBuilder();
        for(
            int currIndex =0, direction=1;
            currIndex<n;
            currIndex +=direction
        ){
            if(s.charAt(currIndex) == '(' || s.charAt(currIndex)==')'){
                currIndex=pair[currIndex];
                direction =-direction;
            }else{
                result.append(s.charAt(currIndex));
            }
        }
        return result.toString();
    }
}