package Y2017M6D15.BestTimetoBuyandSellStock;

/**
 * Created by Allan Wong on 2017/6/15.
 */
public class Solution {

    //Runtime:2ms Better than or equals to 87%
    public int maxProfit(int[] prices) {
        if (prices.length == 0)
            return 0;
        return recursive(prices, 0, prices.length - 1);
    }

    public int recursive(int[] prices, int begin, int end) {
        while(begin<=end&&prices[begin]>=prices[begin+1]) begin++;
        while(begin<=end&&prices[end-1]>=prices[end]) end--;
        if (begin >= end)
            return 0;
        int min = findMin(prices, begin, end), max = findMax(prices, begin, end);
        int rightMax = findMax(prices, min, end), leftMin = findMin(prices, begin, max);
        int res = Math.max((prices[rightMax] - prices[min]), (prices[max] - prices[leftMin]));
        return Math.max(res, recursive(prices, max + 1, min - 1));
    }

    public int findMin(int[] nums, int begin, int end) {
        int ans = begin;
        for (int i = begin; i <= end; i++) {
            if (nums[i] < nums[ans])
                ans = i;
        }
        return ans;
    }

    public int findMax(int[] nums, int begin, int end) {
        int ans = begin;
        for (int i = begin; i <= end; i++) {
            if (nums[i] > nums[ans])
                ans = i;
        }
        return ans;
    }

    //Runtime:1ms
    /*
    public int maxProfit(int[] prices) {
        if (prices == null) return 0;
        if (prices.length < 2) return 0;

        int result = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i<prices.length; i++){
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice > result){
                result = prices[i] - minPrice;
            }
        }
        return result;
    }


     */


    public static void main(String[] args) {
        int[] a = new int[]{7,1,5,3,6,4};
        Solution s = new Solution();
        int res = s.maxProfit(a);
        System.out.println();
        System.out.println("Done.");
    }


}
