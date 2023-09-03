
package org.example.s3ThreadManipulation;

import java.util.concurrent.*;

//Singeton degsign pattern
enum Downloader{
    INSTANCE;

    private Semaphore semaphore = new Semaphore(1, true);
    void download(){
        try{
            semaphore.acquire();
            downloadData();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }finally {
            semaphore.release();
        }
    }

    private void downloadData(){
        try{
            System.out.println("Downloading the data from the web--");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}


public class Semphore2 {

    public static void main(String args[]){
        ExecutorService executor=Executors.newCachedThreadPool();
        for(int i=0;i<12;i++){
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    Downloader.INSTANCE.download();
                }
            });
        }
    }
}
