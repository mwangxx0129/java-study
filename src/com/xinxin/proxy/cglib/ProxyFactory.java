package com.xinxin.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyFactory implements MethodInterceptor {
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    // return the target proxy instance
    public Object getProxyInstance() {
        // create tool class
        Enhancer enhancer = new Enhancer();
        // set parent class
        enhancer.setSuperclass(target.getClass());
        // set callback method
        enhancer.setCallback(this);
        // create subclass, proxy object
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("Cglib proxy mode begin ...");
        Object returnVal = method.invoke(target, objects);
        System.out.println("Cglib proxy mode end!");
        return null;
    }
}
