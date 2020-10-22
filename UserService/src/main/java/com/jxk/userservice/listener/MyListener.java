package com.jxk.userservice.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class MyListener implements ServletRequestListener {
    public   static  Integer a=0;
    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        a++;
    }
}
