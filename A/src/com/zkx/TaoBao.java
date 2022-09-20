package com.zkx;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by DESK0 on 2022/9/20 6:24
 */
public class TaoBao implements InvocationHandler {
    private Object target = null;

    public TaoBao(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object rst = method.invoke(target, args);
        return rst;
    }
}
