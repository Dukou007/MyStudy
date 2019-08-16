package com.study.thread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @description:
 * @author:
 * @date:2019/8/8 17:37
 */
public class ThreadCounter extends Thread {
    final static AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args) {
        try {
            while (true) {
                new ThreadCounter().start();
            }
        } catch (Exception e) {
            System.out.println("faild at ===>   " + counter.get());
        }
    }

    @Override
    public void run() {

        try {
            System.out.println("The " + counter.getAndIncrement() + " thread be created");
            TimeUnit.MINUTES.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
