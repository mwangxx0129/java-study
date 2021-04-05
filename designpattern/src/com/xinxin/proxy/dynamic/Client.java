package com.xinxin.proxy.dynamic;

public class Client {
    public static void main(String[] args) {
        ITeacherDao target = new TeacherDao();
        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(target).getProxyInstance();
        System.out.println(proxyInstance.getClass()); // class com.sun.proxy.$Proxy0


        proxyInstance.teach();

    }
}
