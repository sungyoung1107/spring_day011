package com.kbstar;

import com.kbstar.frame.TV;
import com.kbstar.tv.LTV;
import com.kbstar.tv.STV;

public class App {
    public static void main (String[] args){
        TV tv = new STV();
        TV tv2 = new LTV();
        tv.turnOn();
        tv.turnOff();
        tv2.turnOn();
        tv2.turnOff();
//        LTV stv = new LTV();
//        stv.turnon();

    }
}
