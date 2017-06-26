package TrappingRainWater;

/**
 * Created by Allan Wong on 2017/5/29.
 */
public class Solution {

    //Runtime:166ms Beats:0% Boooooooooo!
    //Runtime:Big Theta(N^2)
    /*
    public int trap(int[] height) {
        if(height.length<3)
            return 0;
        int ans=0;
        for(int i=1;i<height.length-1;i++){
            ans+=depth(height,i);
        }
        return ans;
    }

    public int depth(int[] height,int index){
        int maxLeft=0,maxRight=0,depth=0;
        for(int i=index-1;i>=0;i--){
            maxLeft=height[i]>maxLeft?height[i]:maxLeft;
        }
        for(int j=index+1;j<height.length;j++){
            maxRight=height[j]>maxRight?height[j]:maxRight;
        }
        depth=Math.min(maxLeft,maxRight);
        if(depth<=height[index])
            return 0;
        return depth-height[index];
    }*/

/*  Runtime:18ms(Alleged)38ms(Actually) Sample Code
    public int trap(int[] height) {
        if(height.length < 3) return 0;
        int[] nums = height;
        int llevel = nums[0], rlevel = nums[nums.length - 1];
        int l = 0, r = nums.length - 1, level = Math.min(llevel, rlevel);
        int re = 0;
        while(l < r) {
            if(llevel <= rlevel) {
                re += (level - nums[l++]);
                llevel = Math.max(llevel, nums[l]);
            }
            else {
                re += (level - nums[r--]);
                rlevel = Math.max(rlevel, nums[r]);
            }
            level = Math.min(llevel, rlevel);
        }
        return re;
    }*/

    //Rewrite. Reference:http://blog.csdn.net/ljiabin/article/details/41803593
    //Runtime:21ms Beats 74%
    public int trap(int[] height) {
        if(height.length<3)
            return 0;
        int left,right,l=0,r=height.length-1,ans=0;
        while(l<r && height[l]<=height[l+1]) l++;//locate the two out-most edges that can hold water
        while(l<r && height[r-1]>=height[r]) r--;//Any ascending left edge and descending right edge is not capable.
        while(l<r){
            left=height[l];
            right=height[r];
            if(left<=right){
                while(l<r&&left>=height[++l]) ans+=left-height[l];
            }else{
                while(l<r&&right>=height[--r]) ans+=right-height[r];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution s=new Solution();
        int[] height=new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(s.trap(height));
    }
}
