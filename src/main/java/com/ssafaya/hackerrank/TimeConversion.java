package com.ssafaya.hackerrank;

import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class TimeConversion {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        if(s == null || s.length() < 10) {
            throw new IllegalArgumentException("Invalid input : " + s);
        }
        //07:12:12PM

        String hrVal = s.substring(0, 2);
        String minVal = s.substring(3, 5);
        String secVal = s.substring(6, 8);
        String amPmVal = s.substring(8);

        StringBuffer result = new StringBuffer();
        int newHour = Integer.valueOf(hrVal);
        if(isAM(amPmVal)) {
            newHour = newHour % 12;
            // if(newHour == 12) {
            //     newHour = 0;
            // }
            //newHour = (newHour % 12) + 12;
        } else {
            newHour = (newHour % 12) + 12;
            // if(newHour < 12) {
            //     newHour += 12;
            // }
        }

        if(newHour < 10) {
            result.append("0");
        }
        result.append(newHour).append(":").append(minVal).append(":").append(secVal);
        return result.toString();
    }

    private static boolean isAM(String s) {
        return s.charAt(0) == 'A';
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
