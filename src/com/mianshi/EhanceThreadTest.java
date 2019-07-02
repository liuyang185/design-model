package com.mianshi;

import com.mianshi.bean.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class EhanceThreadTest {
    public static void main(String[] args) throws InterruptedException {
        List<Home> homeList =initHomes();
//        System.out.println(JSON.toJSONString(homeList));
        final AtomicInteger count = new AtomicInteger(0);
        ExecutorService homeService = Executors.newFixedThreadPool(20);
        for(Home home:homeList){
            homeService.submit(new Runnable() {
                @Override
                public void run() {
//                    count.incrementAndGet();
                    System.out.println(Thread.currentThread().getName()+"=="+home.getName());
                    ExecutorService doorService = Executors.newFixedThreadPool(10);
                    for(House house:home.getHouses())
                    doorService.submit(new Runnable() {
                        @Override
                        public void run() {
                            count.incrementAndGet();
                            System.out.println(Thread.currentThread().getName()+"=="+house.getName());
                        }
                    });
                    try {
                        doorService.shutdown();
                        while(! doorService.awaitTermination(1, TimeUnit.SECONDS)){
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            });

        }
        homeService.shutdown();
        while(!homeService.awaitTermination(10,TimeUnit.SECONDS)){

        };
        System.out.println(count);

    }
    public static List<Home> initHomes(){
        List<Home> homeList = new ArrayList<>();
        Home home= null;
        for (int i = 0; i < 20 ; i++) {
            home = new Home("home"+i);
            List<House> houses = new ArrayList<>();
            home.setHouses(houses);
            for(int j=0;j<10;j++){
                House house = new House("house"+j);
                List<Door> doors = new ArrayList<>();
                house.setDoors(doors);
                for(int k=0;k<10;k++){
                    Door door = new Door("door"+k);
                    doors.add(door);
                }
                houses.add(house);
            }
            homeList.add(home);
        }
        return homeList;
    }
}
