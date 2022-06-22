package com.codedifferentlty.regex.practice.part00;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Result {
    /*
     * Complete the 'repeatedString' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. LONG_INTEGER n
     */

    public long repeatedString(String s, long n) {
        //count number of times a shows up in substring
        Integer count = 0;
        Pattern p = Pattern.compile("a");
        Matcher m = p.matcher(s);
        while(m.find()) {
            count++;
        }

        //calculate the number of times A  shows up  withing first N characters of infinite string
        long wholeCount = (n/s.length()) * count;
        //find number of time a shows up in remainder substring
        int remainder = (int)n%s.length();
        Matcher l = p.matcher(s.substring(0,remainder));

        while(l.find()) {
            wholeCount++;
        }
        System.out.println(s + " appears " + wholeCount + " times.");
        return wholeCount;
    }
}
