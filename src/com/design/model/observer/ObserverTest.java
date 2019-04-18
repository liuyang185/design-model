package com.design.model.observer;

public class ObserverTest {
    public static void main(String[] args) {
        Observer o1 = new TalkObserver("小明");
        Observer o2 = new TalkObserver("小红");
        Observer o3 = new TalkObserver("小蓝");
        Subject subject = new MeetingSubject();
        subject.registerObserver(o1);
        subject.registerObserver(o2);
        subject.registerObserver(o3);
        subject.notifyObserver("明天不上课");

    }
}
