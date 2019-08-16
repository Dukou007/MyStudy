package com.study.thread;

/**
 * @description:
 * @author:
 * @date:2019/8/8 17:09
 */
public class TicketWindowRunnable implements Runnable {

    private int index = 1;
    private final static int max = 50;

    public void run() {
        while (index <= max) {
            System.out.println(Thread.currentThread().getName() + " 号码是 ：" + (index++));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        final TicketWindowRunnable task = new TicketWindowRunnable();
        Thread 一号窗口 = new Thread(task, "一号窗口");
        Thread 二号窗口 = new Thread(task, "二号窗口");
        Thread 三号窗口 = new Thread(task, "三号窗口");
        Thread 四号窗口 = new Thread(task, "四号窗口");
        一号窗口.start();
        二号窗口.start();
        三号窗口.start();
        四号窗口.start();
    }
}
