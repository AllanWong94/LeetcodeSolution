package Y2017.M7.D31.Paint_House;

/**
 * Created by Allan Wong on 7/31/2017.
 */
public class Solution {
    //Runtime:5ms=>4ms=>1ms Better than or equals to 2%=>5%=>100%

//    public int minCost(int[][] costs) {
//        if (costs == null || costs.length == 0)
//            return 0;
//        int n = costs.length;
//        int min = Integer.MAX_VALUE;
//        int[][] sum = new int[n][3];
//        for (int j = 0; j < 3; j++) {
//            sum[0][j] = costs[0][j];
//        }
//        for (int i = 1; i < n; i++) {
//            for (int j = 0; j < 3; j++) {
//                int a = -1, b = -1;
//                for (int k = 0; k < 3; k++) {
//                    if (k == j)
//                        continue;
//                    if (a == -1)
//                        a = k;
//                    else
//                        b = k;
//                }
//                sum[i][j] = Math.min(sum[i - 1][a], sum[i - 1][b]) + costs[i][j];
//            }
//        }
//        for (int i = 0; i < 3; i++) {
//            min = Math.min(sum[n - 1][i], min);
//        }
//        return min;
//    }
//

    //Runtime:
    /*
    */
    public int minCost(int[][] costs) {
        if (costs == null || costs.length == 0)
            return 0;
        for(int i=1;i<costs.length;i++){
            costs[i][0]+=Math.min(costs[i-1][1],costs[i-1][2]);
            costs[i][1]+=Math.min(costs[i-1][0],costs[i-1][2]);
            costs[i][2]+=Math.min(costs[i-1][1],costs[i-1][0]);
        }
        return Math.min(costs[costs.length - 1][0], Math.min(costs[costs.length - 1][1], costs[costs.length - 1][2]));
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] costs = new int[][]{{7, 6, 2}};
        System.out.println(s.minCost(costs));
        System.out.println("Done.");
    }


}
