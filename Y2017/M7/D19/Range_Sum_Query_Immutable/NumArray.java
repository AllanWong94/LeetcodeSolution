package Y2017.M7.D19.Range_Sum_Query_Immutable;

/**
 * Created by Allan Wong on 7/19/2017.
 */
public class NumArray {
    private int[] nums;
    private int[] sum;
    //Runtime:793ms=>218ms Better than or equals to 1%=>75%
    public NumArray(int[] nums) {
        this.nums=nums;
        sum=new int[nums.length];
        if (nums.length>0){
            sum[0]=nums[0];
            for(int i=1;i<nums.length;i++){
                sum[i]=sum[i-1]+nums[i];
            }
        }
    }



    public int sumRange(int i, int j) {
        if(nums==null)
            return 0;
        return i==0?sum[j]:sum[j]-sum[i-1];
    }


    public static void main(String[] args) {
        NumArray na=new NumArray(new int[]{-2,0,3,-5,2,-1});

        System.out.println(na.sumRange(0,2));
        System.out.println(na.sumRange(2,5));
        System.out.println(na.sumRange(0,5));
        System.out.println("Done.");
    }

}



/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */