package com.xinxin.designpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class WebSiteFactory {
    private Map<String, ConcreteWebSite> pool = new HashMap<>();

    // return a website based on type of website;
    // If not exist, create new
    public WebSite getWebSiteCategory(String type) {
        if (!pool.containsKey(type)) {
            pool.put(type, new ConcreteWebSite(type));
        }
        return (WebSite) pool.get(type);
    }

    public int getWebSiteCount() {
        return pool.size();
    }
}
