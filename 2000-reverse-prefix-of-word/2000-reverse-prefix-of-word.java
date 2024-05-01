class Solution {
    public String reversePrefix(String word, char ch) {
       Stack<Character> st = new Stack<>();
        StringBuilder result = new StringBuilder();
        
        int index=0;
        while(index<word.length()){
            st.push(word.charAt(index));
            if(word.charAt(index) == ch){
                while(!st.isEmpty()){
                    result.append(st.pop());
                }
                index++;
                
                while(index<word.length()){
                    result.append(word.charAt(index));
                    index++;
                }
                return result.toString();
            }
            index++;
        }
        return word;
    }
}