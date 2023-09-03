package org.example.s6Executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Work implements Runnable{
    private static int id=0;
    Work(int i ){
        this.id=id;
    }
    @Override
    public void run() {
        System.out.println("Task with id " + id + " in is work - thread id: " + Thread.currentThread().getName());
        long duration = (long) (Math.random()*5);

        try {
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ExecutorStop {
    public static void main(String args[]){
        ExecutorService executorService= Executors.newFixedThreadPool(10);
        for(int i=0;i<30;i++){
            executorService.execute(new Work(i+1));
           // executorService.shutdown();

        }
    }
}
