class Solution {
    public String removeKdigits(String num, int k) {
        if(num.length() == k ){
            return "0";
        }
        Stack<Character> s = new Stack<>();
        for(int i=0;i<num.length();i++){
             while(k>0 && !s.isEmpty() && s.peek()>num.charAt(i)){
                 s.pop();
                 k--;
             }
            s.push(num.charAt(i));
        }
        while(k>0){
            s.pop();
            k--;
        }
        
        StringBuilder sb = new StringBuilder();
        while(!s.isEmpty())
            sb.append(s.pop());
        sb.reverse();
        
        while(sb.length()>1 && sb.charAt(0) == '0')
            sb.deleteCharAt(0);
        return sb.toString();
        
    }
}