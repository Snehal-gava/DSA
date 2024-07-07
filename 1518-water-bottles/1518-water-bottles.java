class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int consumedBottels=0;
        
        while(numBottles >= numExchange){
            int k= numBottles/numExchange;
            
            consumedBottels += numExchange*k;
            numBottles -= numExchange *k;
            numBottles +=k;
        }
        
        return consumedBottels+numBottles;
    }
}