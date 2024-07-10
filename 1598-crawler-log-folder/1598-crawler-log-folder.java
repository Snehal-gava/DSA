class Solution {
    public int minOperations(String[] logs) {
        int count = 0,i=0;
        for(String currentOperation: logs){
            if(currentOperation.equals("../")){
                count=Math.max(0,count-1);
            }
            else if(!currentOperation.equals("./")){
                count++;
            }
        }
        return count;
    }
}