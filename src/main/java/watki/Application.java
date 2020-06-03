package watki;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Application {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Thread myThread = new MyThread();
        myThread.start();

        MyRunnable myRunnable = new MyRunnable();

        Thread thread = new Thread(myRunnable);
        thread.start();

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> future = executorService.submit(() -> {
            Thread.sleep(5000);
            return "plik";
        });

        if (!future.isDone()) {
            System.out.println("Ciągle pracuję...");
            Thread.sleep(1000);
        }

        System.out.println(future.get());
    }

}
