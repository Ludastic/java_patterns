package prac4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Main {
    public static void main(String[] args) {
        MyExecServ executorService = new MyExecServ(2);
        executorService.execute(() -> {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Second");
        });

        executorService.execute(() ->{
            try {
                Thread.sleep(190);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int a=0;
            for (int i =0; i<1000; i++) {
               a++;
            }
            System.out.println("First");
        });
        executorService.shutdown();
    }
}
