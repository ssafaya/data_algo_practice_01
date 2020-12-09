package com.ssafaya.hackerrank.easy;

import java.util.ArrayList;
import java.util.List;

public class ElectronicsShop {

    public static void main(String[] args) {
        int budget = 10;
        int[] keyboards = {3, 1};
        int[] drives = {5, 2, 8};
        int result = getMoneySpent(keyboards, drives, budget);
    }

    /*
     * Complete the getMoneySpent function below.
     */
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<keyboards.length; i++) {
            for(int j=0; j<drives.length; j++) {
                int kPrice = keyboards[i];
                int dPrice = drives[j];
                list.add(kPrice+dPrice);
            }
        }

        int maxPriceUnderBudget = -1;
        for(int pr : list) {
            if(pr <= b && pr > maxPriceUnderBudget) {
                maxPriceUnderBudget = pr;
            }
        }
        return maxPriceUnderBudget;
    }
}
