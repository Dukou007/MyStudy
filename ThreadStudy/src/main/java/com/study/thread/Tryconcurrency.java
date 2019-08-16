package com.study.thread;

import java.util.concurrent.TimeUnit;

/**
 * @description:test
 * @author:zhou_xiaolong
 * @date:2019/8/7 14:42
 */
public class Tryconcurrency {
    public static void main(String[] args) {
        new Thread(Tryconcurrency::browseNews).start();
        enjoyMusic();
    }

    private static void enjoyMusic() {
        for (; ; ) {
            System.out.println("good music");
            asleep(1);
        }
    }

    private static void browseNews() {
        for (; ; ) {
            System.out.println("brwwseNews^^^^^^^^^");
            asleep(1);
        }
    }

    private static void asleep(int i) {
        try {
            TimeUnit.SECONDS.sleep(i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
