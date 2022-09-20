package com.zkx.shangjian;

import com.zkx.factory.UsbSanFactory;
import com.zkx.service.UsbSell;

public class WeiShangSanDi implements UsbSell {
    //代理的是 闪迪，定义目标厂家类
    private UsbSanFactory factory = new UsbSanFactory();
    @Override
    public float sell(int amount) {
        //调用目标方法
        float price = factory.sell(amount);
        //只增加1元
        price = price + 1;
        return price;
    }
}
