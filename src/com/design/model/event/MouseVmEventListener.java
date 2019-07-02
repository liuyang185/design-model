package com.design.model.event;

/**
 * @Description
 * @Author YCKJ1423
 * @Date 2019/7/2 16:58
 * Version 1.0
 **/
public class MouseVmEventListener implements VmEventListener{
    @Override
    public void doEvent(IVMEvent vmEvent) {
        MouseVMEvent mouseVMEvent = (MouseVMEvent)vmEvent;
        System.out.println("鼠标事件:"+mouseVMEvent.getName());

    }
}
