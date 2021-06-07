package com.xinxin.casestudy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CategoryIdentifier {
    public Map<String, String> map = new HashMap<>();

    // load data
    public void loadData() {
        map.put("gun1 ", "weapon");
        map.put(" gun2", "weapon");
        map.put("Gun3 ", "weapon");
        map.put("drug1", "CBD");
        map.put("druG2", "CBD");
        map.put("drug3", "CBD");
    }

    // data clean
    public void cleanData() {
        Map<String, String> copy = new HashMap<>();
        // scan every key value pair in map
        for (Map.Entry<String, String> kv : map.entrySet()) {
            String cleanKey = kv.getKey().trim().toLowerCase();
            copy.put(cleanKey, kv.getValue());
        }
        map = copy;
    }

    // check category
    public List<Map.Entry<String, String>> checkCategory(String desp) {
        List<Map.Entry<String, String>> result = new ArrayList<>();
        for (Map.Entry<String, String> kv : map.entrySet()) {
            String key = kv.getKey();
            if (desp.contains(key)) {
                result.add(kv);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        CategoryIdentifier categoryIdentifier = new CategoryIdentifier();
        categoryIdentifier.loadData();
        categoryIdentifier.cleanData();
        for (Map.Entry<String, String> kv : categoryIdentifier.map.entrySet()) {
            System.out.println(kv);
        }


        // test
        List<Map.Entry<String, String>> result = categoryIdentifier.checkCategory("hello, gun1,afsjfosf,  drug3");
        System.out.println(result);
    }
}
