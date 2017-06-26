package Y2017.M6.D26.PascalsTriangle;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Allan Wong on 2017/6/26.
 */
public class Solution {

    //Runtime:2ms Better than or equals to 29%
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new LinkedList<>();
        LinkedList<Integer> last = new LinkedList();
        for (int i = 1; i <= numRows; i++) {
            LinkedList<Integer> temp = new LinkedList<>();
            temp.add(1);
            for (int j = 1; j < i - 1; j++) {
                temp.add(last.get(j - 1) + last.get(j));
            }
            if(i>1) temp.add(1);
            res.add(temp);
            last = temp;
        }
        return res;
    }
    //Runtime:0ms
    //Comment: Arrays.asList() can turn a 2D array into a nested list!
    /*
    public List<List<Integer>> generate(int numRows) {
        int list[][] = new int[numRows][];
        if(numRows == 0) {
            return new ArrayList<>();
        }
        list[0] = new int[1];
        list[0][0] = 1;
        for(int i=1; i<numRows; i++) {
            list[i] = new int[i+1];
            list[i][0] = 1;
            for(int j=0; j<i-1; j++) {
                list[i][j+1] = list[i-1][j] + list[i-1][j+1];
            }
            list[i][i] = 1;
        }

        List arrayList = Arrays.asList(list);
        return arrayList;
    }
    */

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println();
        System.out.println("Done.");
    }


}
