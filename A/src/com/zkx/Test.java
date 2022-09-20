package com.zkx;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by DESK0 on 2022/9/20 6:31
 */
public class Test {
    public static void main(String[] args) {
        Usell king = new King();
        InvocationHandler invocationHandler = new TaoBao(king);

        Usell proxy = (Usell) Proxy.newProxyInstance(king.getClass().getClassLoader(), king.getClass().getInterfaces(), invocationHandler);
        float rst = proxy.sell();
        System.out.println(rst);

    }
}
