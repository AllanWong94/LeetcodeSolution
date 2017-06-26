package EncodeandDecodeTinyURL;

import java.util.HashMap;

/**
 * Created by Allan Wong on 2017/6/3.
 */
public class Codec {

    //Runtime:6ms Beats 63%
    /*
    HashMap<Integer, String> urls=new HashMap<>();
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        int code=0;
        for(char c:longUrl.toCharArray()){
            code+=c;
        }
        urls.put(code, longUrl);
        return String.valueOf(code);
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return urls.get(Integer.parseInt(shortUrl));
    }*/

    //Revised
    String[] s=new String[1000];
    int code=0;
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        code++;
        s[code]=longUrl;
        return String.valueOf(code);
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return s[Integer.parseInt(shortUrl)];
    }
    //Unit test
    public static void main(String[] args) {
        Codec c=new Codec();
        String s=c.encode("https://leetcode.com/problems/design-tinyurl");
        String sd=c.decode(s);
        System.out.println(s);
        System.out.println(sd);
    }




}
