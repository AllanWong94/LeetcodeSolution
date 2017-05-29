package LRUCache;

/**
 * Created by Allan Wong on 2017/5/28.
 */
public class Test {
    public static void main(String[] args) {
        LRUCache cache=new LRUCache(2);
        int res;
        cache.put(2, 1);
        cache.put(2, 2);
        res=cache.get(2);       // returns 2
        cache.put(3, 3);    // evicts key 2
        res=cache.get(2);       // returns -1 (not found)
        cache.put(4, 4);    // evicts key 1
        res=cache.get(1);       // returns -1 (not found)
        res=cache.get(3);       // returns 3
        res=cache.get(4);       // returns 4


    }




}
