package com.design.model.event;

import java.util.ArrayList;
import java.util.EventListener;
import java.util.List;

/**
 * @Description
 * @Author YCKJ1423
 * @Date 2019/7/2 16:48
 * Version 1.0
 **/
public class Computor {
    public void mouseClick(){
        for(VmEventListener l:listeners){
            if(l instanceof MouseVmEventListener){
                l.doEvent(new MouseVMEvent("點擊網頁",new Object()));
            }
        }
        System.out.println("电脑执行");
    }
    private List<VmEventListener> listeners = new ArrayList<>();

    public List<VmEventListener> getListeners() {
        return listeners;
    }

    public void setListeners(List<VmEventListener> listeners) {
        this.listeners = listeners;
    }
    public void addListerner(VmEventListener listener){
        this.listeners.add(listener);
    }

    public static void main(String[] args) {
        Computor computor = new Computor();
        computor.addListerner(new MouseVmEventListener());
        computor.mouseClick();
    }
}
