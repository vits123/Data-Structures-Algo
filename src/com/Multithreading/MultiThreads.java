package com.Multithreading;

class NewThread_1 implements Runnable {

  String name;
  Thread t;

  NewThread_1(String threadname) {
    name = threadname;
    t = new Thread(this, name);
    System.out.println("New Thread " + t);
    t.start();  // start thread
  }


  @Override
  public void run() {
    try {
      for (int i = 5; i > 0; i--) {
        System.out.println(name + " : " + i);
        Thread.sleep(1000);
      }

    } catch (InterruptedException e) {
      System.out.println(name + " Interrupted ");

    }
    System.out.println(name + "exiting");
  }
}


public class MultiThreads {

  public static void main(String[] args) {
    new NewThread_1("one");
    new NewThread_1("two");
    new NewThread_1("Three");

    try {
      Thread.sleep(10000);
    } catch (InterruptedException e) {
      System.out.println("Main Thread interrupted");
    }
    System.out.println("Main Thread exiting");

  }

}
