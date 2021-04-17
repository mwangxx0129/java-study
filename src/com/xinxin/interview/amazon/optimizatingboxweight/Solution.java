package com.xinxin.interview.amazon.optimizatingboxweight;

import java.util.*;

public class Solution {
    public static List<Integer> optimizingBoxWeights(List<Integer> arr) {
        // WRITE YOUR BRILLIANT CODE HERE
        List<Integer> res = new ArrayList<>();
        Collections.sort(arr);
        int total = 0;
        List<Integer> element = new ArrayList<>(), weight = new ArrayList<>();
        for(int i = arr.size() - 1; i >= 0; ){
            int cur = arr.get(i--), count = 1;
            total += cur;
            while(i >= 0 && cur == arr.get(i)) {
                i--;
                total += cur;
                count++;
            }
            element.add(cur);
            weight.add(count);
        }
        List<List<List<Integer>>> dp = new ArrayList<>();
        for(int i = 0; i < element.size(); i++){
            dp.add(new ArrayList<>());
            for(int j = 0; j <= total; j++){
                dp.get(i).add(null);
            }
        }
        int mincount = Integer.MAX_VALUE;
        for(int i = 0; i < element.size(); i++){
            for(int j = 1; j <= total; j++){
                List<Integer> noadd = null, added = null, addme =  null, temp = null;
                if(i > 0) noadd = copy(dp.get(i - 1).get(j));
                if (i > 0 && j - element.get(i) * weight.get(i) > 0) {
                    added = copy(dp.get(i - 1).get(j - element.get(i) * weight.get(i)));
                    if(added != null){
                        for(int m = 0; m < weight.get(i); m++) added.add(element.get(i));
                    }
                }
                if(element.get(i) * weight.get(i) == j){
                    addme = new ArrayList<>();
                    for(int m = 0; m < weight.get(i); m++) addme.add(element.get(i));
                }
                temp = addme == null ? added : addme;
                if(noadd != null) temp = (temp != null && temp.size() < noadd.size()) ? temp : noadd;
                dp.get(i).set(j, temp);
                if(j > total / 2 && temp != null)  mincount = Math.min(mincount, temp.size());
            }
        }
        for(int i = 0; i < element.size(); i++){
            for(int j = total / 2 + 1; j <= total; j++){
                if(dp.get(i).get(j) != null && dp.get(i).get(j).size() == mincount){
                    res = dp.get(i).get(j);
                    Collections.sort(res);
                    return res;
                }
            }
        }
        return res;
    }
    public static List<Integer> copy(List<Integer> list){
        if(list == null) return null;
        List<Integer> res = new ArrayList<>();
        for(int i : list) res.add(i);
        return res;
    }
}
