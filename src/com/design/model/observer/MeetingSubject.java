package com.design.model.observer;

import java.util.ArrayList;
import java.util.List;

public class MeetingSubject implements Subject {
    List<Observer> observerList= null;
    @Override
    public void registerObserver(Observer o) {
        if(observerList ==null){
            observerList = new ArrayList<>();
        }
        observerList.add(o);

    }

    @Override
    public void removeObserver(Observer o) {
        if(observerList != null){
            observerList.remove(o);
        }
    }

    @Override
    public void notifyObserver(String msg) {
        for(Observer o:observerList){
            o.update(msg);
        }
    }
}
