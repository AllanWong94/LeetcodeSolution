package FifthJune2017.ComplexNumberMultiplcation;

/**
 * Created by Allan Wong on 2017/6/5.
 */
public class Solution {
    //Runtime:5ms Beats 95% Fastest
    public String complexNumberMultiply(String a, String b) {
        int[] anum=new int[2],bnum=new int[2];
        int aIndex=find(a),bIndex=find(b);
        if(aIndex==-1){
            if(a.charAt(a.length()-1)!='i'){
                anum[0]=Integer.parseInt(a);
                anum[1]=0;
            }else{
                anum[0]=0;
                anum[1]=Integer.parseInt(a.substring(0,a.length()-1));
            }
        }else{
            anum[0]=Integer.parseInt(a.substring(0,aIndex));
            anum[1]=Integer.parseInt(a.substring(aIndex+1,a.length()-1));
        }
        if(bIndex==-1){
            if(b.charAt(b.length()-1)!='i'){
                bnum[0]=Integer.parseInt(b);
                bnum[1]=0;
            }else{
                bnum[0]=0;
                bnum[1]=Integer.parseInt(b.substring(0,b.length()-1));
            }
        }else{
            bnum[0]=Integer.parseInt(b.substring(0,bIndex));
            bnum[1]=Integer.parseInt(b.substring(bIndex+1,b.length()-1));
        }

        return (anum[0]*bnum[0]-anum[1]*bnum[1])+"+"+(anum[0]*bnum[1]+anum[1]*bnum[0])+"i";
    }


    public int find(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='+')
                return i;
        }
        return -1;
    }

    //Runtime:
    /*



     */




    public static void main(String[] args) {
        Solution s=new Solution();
        String s1="1+1i";
        String s2="1+1i";


        System.out.println(s.complexNumberMultiply(s1,s2));
        System.out.println("Done.");
    }






}
