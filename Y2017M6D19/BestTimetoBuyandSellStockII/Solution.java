package Y2017M6D19.BestTimetoBuyandSellStockII;

/**
 * Created by Allan Wong on 2017/6/19.
 */
public class Solution {
    //Runtime:2ms Better than or equals to 65%
    public int maxProfit(int[] prices) {
        if(prices.length==0)
            return 0;
        int lo=prices[0],hi=prices[0],profit=0;
        for(int i=0;i<prices.length-1;i++){
            if(prices[i]>=prices[i+1]){
                lo=prices[i+1];
                hi=lo;
            }else if (prices[i]<prices[i+1]){
                hi=prices[i+1];
                if(i<prices.length-2){
                    if(prices[i+1]>=prices[i+2])
                        profit+=hi-lo;
                }else if(i+2==prices.length)
                    profit+=hi>lo?hi-lo:0;
            }
        }
        return profit;
    }

    //Runtime:1ms
    /*
    public int maxProfit(int[] prices) {
        int ret=0;
        for(int i=0;i<prices.length-1;i++){
            if(prices[i+1]>prices[i])
                ret+=prices[i+1]-prices[i];
        }
        return ret;
    }
    */



    public static void main(String[] args) {
        Solution s=new Solution();
        int res=s.maxProfit(new int[]{5,2,3,2,6,6,2,9,1,0,7,4,5,0});
        System.out.println();
        System.out.println("Done.");
    }





}
