package Y2017.M7.D2.RotateImage;

/**
 * Created by Allan Wong on 2017/7/2.
 */
public class Solution {
    //Runtime:3ms Better than or equals to 65% One-time AC!
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        if(n%2==0){
            for(int i=0;i<n/2;i++){
                for(int j=0;j<n/2;j++){
                    rotate1(matrix,i,j,n);
                }
            }
        }else{
            for(int i=0;i<n/2+1;i++){
                for(int j=0;j<n/2;j++){
                    rotate1(matrix,i,j,n);
                }
            }
        }
    }



    public void rotate1(int[][] matrix,int i,int j,int n){
        int temp=matrix[i][j];
        matrix[i][j]=matrix[n-j-1][i];
        matrix[n-j-1][i]=matrix[n-i-1][n-j-1];
        matrix[n-i-1][n-j-1]=matrix[j][n-i-1];
        matrix[j][n-i-1]=temp;
    }

    //Runtime:2ms
    //Comment:swap([i,j],[j,i]) Then swap([i,j],[i,n-1-j])
    /*public void rotate(int[][] matrix) {
        for(int i = 0; i<matrix.length; i++){
            for(int j = i; j<matrix[0].length; j++){
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i =0 ; i<matrix.length; i++){
            for(int j = 0; j<matrix.length/2; j++){
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j] = temp;
            }
        }
    }
    */




    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println();
        System.out.println("Done.");
    }


}
