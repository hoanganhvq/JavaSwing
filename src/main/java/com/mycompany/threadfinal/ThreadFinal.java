/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.threadfinal;

/**
 *
 * @author MyPC
 */
public class ThreadFinal {

    public static void main(String[] args) {
        Thread highPriorityThread = new Thread(new MyThread(), "Thread 1");
        Thread lowPriorityThread = new Thread(new MyThread(), "Thread 2");

        highPriorityThread.setPriority(Thread.MAX_PRIORITY);
        lowPriorityThread.setPriority(Thread.MAX_PRIORITY);

        try {
            highPriorityThread.start();
            highPriorityThread.join();

            lowPriorityThread.start();
            lowPriorityThread.join();

        } catch (InterruptedException  e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
    }
}

class MyThread implements Runnable {

    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}
