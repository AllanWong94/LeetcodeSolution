package Y2017.M7.D24.Single_Number_III;

/**
 * Created by Allan Wong on 7/24/2017.
 */
public class Solution {
    //Runtime:2ms Better than or equals to 80%
    public int[] singleNumber(int[] nums) {
        int temp=0;
        for(int num:nums)
            temp^=num;
//        int bit=1;
//        while((bit&temp)==0){
//            bit=bit<<1;
//        }
        temp&=-temp;
        int[] res=new int[]{0,0};
        for(int num:nums){
            if((num&temp)==0){
                res[0]^=num;
            }else{
                res[1]^=num;
            }
        }
        return res;
    }
    //Runtime:
    /*
    */




    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.singleNumber(new int[]{1,2,1,3,2,5}));
        System.out.println("Done.");
    }


}
