package com.zkx.factory;

import com.zkx.service.UsbSell;

//目标类
public class UsbKingFactory implements UsbSell {
    @Override
    public float sell(int amount) {
        //目标方法
        System.out.println("目标类中，执行sell目标方法");
        return 85.0f;
    }

    @Override
    public void print() {

    }
}
