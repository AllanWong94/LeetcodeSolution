package Y2017.M6.Y2017M6D10.MovingAveragefromDataStream;

/**
 * Created by Allan Wong on 2017/6/10.
 */
public class MovingAverage {
    //Runtime:163ms Beats 44%
    //Improved:146ms Beats 79%
    int[] storage;
    int size,sum,count;//lra=>least recent element
    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        sum=0;
        count=0;
        this.size=size;
        storage=new int[size];
    }

    public double next(int val) {
        sum+=val;
        sum-=storage[count%size];
        storage[count%size]=val;
        count++;
        return sum*1.0/(count>=size?size:count);
    }




    //Runtime:172ms
    /*
        private int[] table;
    //private int size;
    private int count;
    private double sum;
    public MovingAverage(int size) {
        table = new int[size];
        //this.size = size;
        count = 0;
        sum = 0;
    }

    public double next(int val) {

        sum += val;
        sum -= table[count%table.length];
        table[count%table.length] = val;
        count++;
        return sum / (count >= table.length? table.length : count);
    }


     */
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */
