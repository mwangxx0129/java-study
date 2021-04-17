package com.xinxin.interview.amazon.shoppingoptions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public long getNumberOfOptions(final List<Integer> priceOfJeans,
                                   final List<Integer> priceOfShoes,
                                   final List<Integer> priceOfSkirts,
                                   final List<Integer> priceOfTops,
                                   final int dollars) {
        final List<Integer> a = getCombination(priceOfJeans, priceOfShoes, dollars);
        final List<Integer> b = getCombination(priceOfSkirts, priceOfTops, dollars);

        int result = 0;
        for (int e : a) {
            int index = Collections.binarySearch(b, dollars - e + 1);
            if (index < 0) index = - (index + 1);
            result += index;
        }
        return result;
    }

    private List<Integer> getCombination(final List<Integer> a,
                                         final List<Integer> b,
                                         final int target) {
        List<Integer> res = new ArrayList<>();
        for (int e : a) {
            for (int f: b) {
                int tmp = e + f;
                if (tmp <= target) {
                    res.add(tmp);
                }
            }
        }
        Collections.sort(res);
        return res;
    }
}
