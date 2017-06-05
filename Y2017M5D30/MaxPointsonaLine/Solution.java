package MaxPointsonaLine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created by Allan Wong on 2017/5/30.
 */
public class Solution {
    //Runtime:53ms Beats 25%
    public int maxPoints(Point[] points) {
        if(points.length<2)
            return points.length;
        int max=0;
        double slope=0;
        Point p1,p2;
        ArrayList<Double> slopes=new ArrayList<>();
        for(int i=0;i<points.length;i++){
            slopes.clear();
            for(int j=0;j<points.length;j++){
                if(i==j)
                    continue;
                p1=points[i];
                p2=points[j];
                if(p1.x==p2.x && p1.y!=p2.y){
                    slope=Double.MAX_VALUE;
                }else if(p1.x==p2.x && p1.y==p2.y){
                    slope=Double.NaN;
                }else
                    slope=((double)p2.y-(double)p1.y)*1000000/(p2.x-p1.x);
                slopes.add(slope);
            }
            max=Math.max(max,contains(slopes));
        }
        return max;
    }


    public int contains(ArrayList<Double> slopes){
        int max=0;
        int count=0;
        if(slopes.size()>0){
            for(double d:slopes){
                count=0;
                for(double x:slopes){
                    if(d==x||Double.isNaN(x)){
                        count++;
                    }
                }
                max=Math.max(count+1,max);
            }
        }
        return max;
    }

    public static class Point {
        int x;
        int y;

        public Point() {
            x = 0;
            y = 0;
        }

        public Point(int a, int b) {
            x = a;
            y = b;
        }
    }



/*  Runtime:10ms
    public int maxPoints(Point[] points) {
        if (points == null || points.length == 0) {
            return 0;
        } else if (points.length < 3) {
            return points.length;
        }
        int max = 0, count = 0;
        for (int i = 1; i < points.length; i++) {
            double k = calculateK(points[i], points[i - 1]);
            double b = calculateB(points[i], points[i - 1]);
            count = 2;
            for (int j = 0; j < points.length; j++) {
                if (j == i || j == i - 1) {
                    continue;
                }
                if (k ==  Double.POSITIVE_INFINITY && points[i].x == points[j].x) {
                    count++;
                } else if (points[i].x == points[j].x && points[i].y == points[j].y
                        || points[i - 1].x == points[j].x && points[i - 1].y == points[j].y) {
                    count++;
                } else {
                    double localK = calculateK(points[i], points[j]);
                    double localB = calculateB(points[i], points[j]);
                    if (k == localK && b == localB) {
                        count++;
                    }
                }
            }
            if (max < count) {
                max = count;
            }
        }
        return max;
    }

    private double calculateK(Point point1, Point point2) {
        return point2.x == point1.x ? Double.POSITIVE_INFINITY : ((point2.y - point1.y) * 1.0 / (point2.x - point1.x));

    }

    private double calculateB(Point point1, Point point2) {
        return point2.x == point1.x ? Double.POSITIVE_INFINITY :  ((point2.y * point1.x - point1.y * point2.x) * 1.0 / (point1.x - point2.x));
    }
*/

}
