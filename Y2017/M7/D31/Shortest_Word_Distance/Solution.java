package Y2017.M7.D31.Shortest_Word_Distance;

/**
 * Created by Allan Wong on 7/31/2017.
 */
public class Solution {
    //Runtime:4ms=>2ms Better than or equals to 56%=>99%
    public int shortestDistance(String[] words, String word1, String word2) {
        int index1=+100,index2=-100000,min=Integer.MAX_VALUE;
        for(int i=0;i<words.length;i++){
            String s=words[i];
            if(s.equals(word1)){
                index1=i;
                min=Math.min(min,Math.abs(index1-index2));
            }
            else if(s.equals(word2)){
                index2=i;
                min=Math.min(min,Math.abs(index1-index2));
            }
        }
        return min;
    }
    //Runtime:
    /*
    */




    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println();
        System.out.println("Done.");
    }


}
