package com.design.model.event;

/**
 * @Description
 * @Author YCKJ1423
 * @Date 2019/7/2 16:57
 * Version 1.0
 **/
public class MouseVMEvent implements IVMEvent{
    private String name;
    private Object obj;

    public MouseVMEvent(String name, Object obj) {
        this.name = name;
        this.obj = obj;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }
}
