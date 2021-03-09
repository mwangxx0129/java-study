package com.xinxin.proxy.cglib;

public class Client {
    public static void main(String[] args) {
        TeacherDao proxyInstance = (TeacherDao) new ProxyFactory(new TeacherDao()).getProxyInstance();
        proxyInstance.teach();
    }
}
