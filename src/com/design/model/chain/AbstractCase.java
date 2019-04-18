package com.design.model.chain;

public abstract class AbstractCase {

    public AbstractCase(int flag) {
        this.flag = flag;
    }
    private int flag;
    private AbstractCase nextcase;
    public void doResquest(int condition){
        if(flag == condition){
            handle();
        }
        else{
            nextcase.doResquest(condition);
        }

    }
    abstract void handle();
    public void setNextcase(AbstractCase nextcase) {
        this.nextcase = nextcase;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }
}
