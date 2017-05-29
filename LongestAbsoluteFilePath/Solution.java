package LongestAbsoluteFilePath;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Allan Wong on 2017/5/29.
 */
public class Solution {




    //Not working because can't take in '\t' in forms of multiple spaces
    //In fact, the '\t' represents the spaces needed padding to achieve that
    //the string length is of the multiple of 8.
    //Therefore this method will not recognize any spaces that do the same thing
    //as '\t', which fails the test.
    //It certainly can be fixed, but the workload is too much. Instead we can use
    //input.lastIndexOf("\t") to recognize the spaces easily.
    /*public int lengthLongestPath(String input) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        input+="\n";
        int temp=0,count=0,depth=0,maxLength=0;
        char[] chars=input.toCharArray();
        boolean isFile=false;
        for(char c:chars){
            if(c=='\n'&&count>0){
                if(isFile){
                    for(int i=0;i<hm.size();i++){
                        temp+=(hm.get(i)+1);
                    }
                    temp+=count;
                    maxLength=Math.max(temp,maxLength);
                    temp=0;
                }else{
                    hm.put(depth,count);
                }
                count=0;
                depth=0;
                isFile=false;
            }else if(c=='\t'){
                depth++;
            }else if(c=='.'){
                count++;
                isFile=true;
            }else if(c==' '&&count==0){
                continue;
            }else{
                count++;
            }
        }
        return maxLength;
    }*/




    public static void main(String[] args) {
        String string="\t123456\t890123\t\t678";
        String fn="123241txt";
        String sample1="dir\n        file.txt";
        String sample2="dir\n    file.txt";
        Solution s=new Solution();
        System.out.println(s.lengthLongestPath(sample1));
        System.out.println(s.lengthLongestPath(sample2));
    }

    //Runtime:8ms Beats 17%
    public int lengthLongestPath(String input) {
        int res = 0;
        HashMap<Integer, Integer> m = new HashMap<>();
        m.put(0, 0);
        for (String s : input.split("\n")) {
            int level = s.lastIndexOf("\t") + 1;
            int len = s.substring(level).length();
            if (s.contains(".")) {
                res = Math.max(res, m.get(level) + len);
            } else {
                m.put(level + 1, m.get(level) + len + 1);
            }
        }
        return res;
    }



/*  Runtime:3ms
    public int lengthLongestPath(String input) {
        String[] strs = input.split("\n");
        int max = 0;
        int[] length = new int[strs.length + 2];//Genius! 2 extra spaces to avoid ifs about whether index is -1;
        for(String str : strs){
            int index = str.lastIndexOf("\t");
            length[index + 2] = length[index + 1] + str.length() - index;
            if(str.indexOf('.') != -1) max = Math.max(max, length[index + 2] - 1);
        }
        return max;
    }
*/
    //Too heavy!
    /*
    public int maxLength;
    public Solution(){
        maxLength=0;
    }
    public int lengthLongestPath(String input) {
        Directory d = buildDirectory(input);
        return maxLength;
    }

    public Directory buildDirectory(String input){
        input+="\n";
        StringBuilder sb=new StringBuilder();
        String name;
        int next=0;
        Directory cur=null,root=null;
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)=='\n'&&sb.length()>0){
                name=sb.toString();
                if(root==null){
                    if(!isFile(name)){
                        root=new Directory(null,name);
                        cur=root;
                    }else
                        maxLength=name.length();
                }else{
                    cur=root;
                    for(int k=1;k<next;k++){
                        cur=cur.Directories.get(cur.Directories.size()-1);
                    }
                    next=0;
                    cur.add(name);
                }


            }else if(input.charAt(i)=='\t'){
                sb.delete(0,sb.length());
                next++;
            }else if(input.charAt(i)==' '){
                continue;
            }else{
                sb.append(input.charAt(i));
            }
        }
        return root;
    }



    public boolean isFile(String s){
        return s.indexOf('.')!=-1;
    }

    public class Directory{
        public int depth;
        public String name;
        public int length;
        public ArrayList<String> files;
        public ArrayList<Directory> Directories;
        public Directory parent;
        public Directory(Directory p,String s){
            name=s;
            files=new ArrayList<>();
            Directories=new ArrayList<>();
            if(p==null){
                length=name.length()+1;
                depth=0;
            }
            else{
                parent=p;
                length=p.length+name.length()+1;
                depth=p.depth+1;
            }
        }
        public void addFile(String s){
            files.add(s);
            int l=length+s.length();
            if(l>maxLength)
                maxLength=l;
        }
        public void addDirectory(Directory d){
            Directories.add(d);
        }

        public int LongestFilenameLength(){
            if(files.size()==0)
                return 0;
            int max=Integer.MIN_VALUE;
            for(String s:files){
                if(s.length()>max)
                    max=s.length();
            }
            return max;
        }

        public Directory add(String s){
            if(isFile(s))
                addFile(s);
            else{
                Directory d=new Directory(this,s);
                addDirectory(d);
                return d;
            }
            return this;
        }

        public int LAFP(){
            return LongestFilenameLength()+length;
        }
    }



*/
}
