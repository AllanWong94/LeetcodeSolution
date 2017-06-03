package NestedListWeightSum;

/**
 * Created by Allan Wong on 2017/6/3.
 */

import java.util.List;

/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return null if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class Solution {

    //Runtime:1ms Fastest
    public int depthSum(List<NestedInteger> nestedList) {
        int sum=0;
        sum=nestedListDepthSum(nestedList,1);
        return sum;
    }

    public int nestedListDepthSum(List<NestedInteger> nestedList, int depth) {
        int sum=0;
        for(NestedInteger ni:nestedList){
            if(ni.isInteger())
                sum+=ni.getInteger()*depth;
            else
                sum+=nestedListDepthSum(ni.getList(), depth+1);
        }
        return sum;
    }




    public interface NestedInteger {

        // @return true if this NestedInteger holds a single integer, rather than a nested list.
        public boolean isInteger();

        // @return the single integer that this NestedInteger holds, if it holds a single integer
        // Return null if this NestedInteger holds a nested list
        public Integer getInteger();

        // @return the nested list that this NestedInteger holds, if it holds a nested list
        // Return null if this NestedInteger holds a single integer
        public List<NestedInteger> getList();
    }
}

