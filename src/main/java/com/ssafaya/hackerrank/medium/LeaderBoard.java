package com.ssafaya.hackerrank.medium;

import java.util.*;

public class LeaderBoard {

    public static void main(String[] args) {
        Integer[] rr = {100,100,50,40,40,20,10};
        Integer[] ll = {5,25,50,120};
        List<Integer> r = Arrays.asList(rr);
        List<Integer> l = Arrays.asList(ll);
        List<Integer> result = climbingLeaderboard(r, l);
        System.out.println(result);
    }

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        List<Integer> result = new ArrayList<>();

        // create rank list
        Set<Integer> rSet = new HashSet<>();
        for(int r : ranked) {
            rSet.add(r);
        }
        for(int p : player) {
            List<Integer> ts = new ArrayList<>(rSet);
            ts.add(p);
            Collections.sort(ts);
        }

        // compare score to rank
        for(int i = 0; i < player.size(); i++) {
            int plScore = player.get(i);
            int j = 0;
            int calculatedRank = 0;
            for(int rs : rSet) {
                if(plScore >= rs) {
                    calculatedRank = j+1;
                    break;
                }
                j++;
            }
            if(calculatedRank == 0) {
                calculatedRank = rSet.size() + 1;
            }
            j=0;
            result.add(calculatedRank);
        }

        return result;
    }

    // Working - Non-optimized
    public static List<Integer> climbingLeaderboard_NonOpt(List<Integer> ranked, List<Integer> player) {
        List<Integer> result = new ArrayList<>();

        // create rank list
        Set<Integer> rSet = new LinkedHashSet<>();
        for(int r : ranked) {
            rSet.add(r);
        }

        // compare score to rank
        for(int i = 0; i < player.size(); i++) {
            int plScore = player.get(i);
            int j = 0;
            int calculatedRank = 0;
            for(int rs : rSet) {
                if(plScore >= rs) {
                    calculatedRank = j+1;
                    break;
                }
                j++;
            }
            if(calculatedRank == 0) {
                calculatedRank = rSet.size() + 1;
            }
            j=0;
            result.add(calculatedRank);
        }

        return result;
    }
}
