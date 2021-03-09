package com.xinxin.flyweight;

public class Client {
    public static void main(String[] args) {
        WebSiteFactory webSiteFactory = new WebSiteFactory();
        webSiteFactory.getWebSiteCategory("news").use();
        webSiteFactory.getWebSiteCategory("blog").use();

        webSiteFactory.getWebSiteCategory("blog").use();
        System.out.println(webSiteFactory.getWebSiteCount());
    }
}
