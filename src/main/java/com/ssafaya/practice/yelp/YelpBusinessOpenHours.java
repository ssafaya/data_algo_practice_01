package com.ssafaya.practice.yelp;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class YelpBusinessOpenHours {
    public static void main(String args[]) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */

        Scanner scanner = new Scanner(System.in);
        String time = scanner.nextLine();

        String businessHrs = scanner.nextLine();

        String arr1[] = time.split("-");

        float minTime = Float.valueOf(arr1[0]);
        float maxTime = Float.valueOf(arr1[1]);

        List<String> openHrs = new ArrayList<>();
        String[] arr2 = businessHrs.split(",");
        openHrs = Arrays.asList(arr2);

        float tot = totalOpenHrs(minTime, maxTime, openHrs);
        float ratio = tot / (maxTime - minTime);
        System.out.println(ratio);
    }

    private static float totalOpenHrs(float minTime, float maxTime, List<String> openHrs) {
        float tot = 0;
        for (String str : openHrs) {
            if (str.equals("")) {
                continue;
            }
            String[] arr = str.split("-");
            tot += findOpenHrs(minTime, maxTime, Integer.parseInt(arr[0]), Integer.parseInt(arr[1]));
        }
        return tot;
    }

    private static float findOpenHrs(float minTime, float maxTime, float minOH, float maxOH) {
        float a = Math.max(minTime, minOH);
        if (a > maxOH) {
            return 0;
        }
        float b = Math.min(maxTime, maxOH);

        return b - a;
    }
}
