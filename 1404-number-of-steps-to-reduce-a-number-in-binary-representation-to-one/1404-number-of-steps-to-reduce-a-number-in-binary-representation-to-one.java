class Solution {
    public int numSteps(String s) {
        int operations =0,carry=0;
        int N =s.length();
        for(int i=N-1;i>0;i--){
            int digit = Character.getNumericValue(s.charAt(i))+carry;
            
            if(digit%2 == 1){
                operations +=2;
                carry=1;
                
            }else{
                operations++;
            }
        }
        return operations+carry;
    }
}