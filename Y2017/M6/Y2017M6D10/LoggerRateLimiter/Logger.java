package Y2017.M6.Y2017M6D10.LoggerRateLimiter;

import java.util.HashMap;

/**
 * Created by Allan Wong on 2017/6/10.
 */
public class Logger {


    //Runtime:153ms Beats 90%
    HashMap<String, Integer> m;
    /** Initialize your data structure here. */
    public Logger() {
        m=new HashMap<>();
    }

    /** Returns true if the message should be printed in the given timestamp, otherwise returns false.
     If this method returns false, the message will not be printed.
     The timestamp is in seconds granularity. */
    public boolean shouldPrintMessage(int timestamp, String message) {
        if(m.isEmpty() || !m.containsKey(message)){
            m.put(message,timestamp);
            return true;
        }
        int old=m.get(message);
        if(timestamp-old>=10){
            m.put(message, timestamp);
            return true;
        }
        return false;
    }



    public static void main(String[] args) {
        Logger s=new Logger();
        s.shouldPrintMessage(1,"foo");
        s.shouldPrintMessage(2,"bar");
        s.shouldPrintMessage(3,"foo");
        s.shouldPrintMessage(8,"bar");
        s.shouldPrintMessage(10,"foo");
        System.out.println(s.shouldPrintMessage(11,"foo"));
        System.out.println("Done.");
    }

}

/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */