class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> openbracket = new Stack<Integer>();
        Stack<Integer> star = new Stack<Integer>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
           
            if(ch == '('){
                openbracket.push(i);
            }else if(ch == '*'){
                star.push(i);
            }else{
                if(!openbracket.empty()){
                    openbracket.pop();
                }else if(!star.isEmpty()){
                    star.pop();
                }else{
                    return false;
                }
            }
        }
        while(!openbracket.isEmpty() && !star.isEmpty()){
            if(openbracket.pop()>star.pop()){
                return false;
            }
        }
        return openbracket.isEmpty();
    }
        
}