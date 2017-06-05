package ZigzagIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Allan Wong on 2017/6/2.
 */
public class ZigzagIterator {


    //Runtime:5ms Beats 47%
    private List<Integer>[] lists;
    private int cur,size;
    private Iterator[] iterators;

    public ZigzagIterator(List<Integer> v1, List<Integer> v2) {
        lists=new List[2];
        iterators=new Iterator[2];
        lists[0]=v1;
        lists[1]=v2;
        cur=0;
        size=2;
        iterators[0]=v1.iterator();
        iterators[1]=v2.iterator();
    }

    public int next() {
        Iterator i;
        if(!iterators[0].hasNext()){
            i=iterators[1];
        }else if(!iterators[1].hasNext()){
            i=iterators[0];
        }else{
            i=iterators[cur%size];
        }
        return (int)i.next();
    }

    public boolean hasNext() {
        return iterators[0].hasNext()||iterators[1].hasNext();
    }



/*  //Runtime;3ms
    private int idx_1 = 0, idx_2 = 0, curr_v=-1;
    private List<Integer> v1, v2;
    public ZigzagIterator(List<Integer> v1, List<Integer> v2) {
        this.v1 = v1;
        this.v2 = v2;
        curr_v = 1;
    }

    public int next() {
        if (curr_v == 1) {
            curr_v = 2;
            if (idx_1 < v1.size())
                return v1.get(idx_1++);
            else
                return next();
        } else if (curr_v == 2) {
            curr_v = 1;
            if (idx_2 < v2.size())
                return v2.get(idx_2++);
            else
                return next();
        }
        else {
            //error
            return -1;
        }
    }

    public boolean hasNext() {
        return (idx_1 < v1.size()) || (idx_2 < v2.size());
    }*/

}
