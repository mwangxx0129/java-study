package com.xinxin.flyweight;

public class Client {
    public static void main(String[] args) {
        WebSiteFactory webSiteFactory = new WebSiteFactory();
        webSiteFactory.getWebSiteCategory("news").use(new User("Zhang"));
        webSiteFactory.getWebSiteCategory("blog").use(new User("Li"));

        webSiteFactory.getWebSiteCategory("blog").use(new User("Wu"));
        System.out.println(webSiteFactory.getWebSiteCount());
    }
}
