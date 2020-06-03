package watki;

public class MyRunnable implements Runnable {
    volatile boolean disable = false;

    @Override
    public void run() {
        while (!disable) {
            //cos rob
            //volataile wymusza zczytanie z pamieci
        }
    }

//    @Override
//    public void run() {
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("Jestem nowym wątkiem z interface Runnable");
//    }
}


