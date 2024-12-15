package thread_class_if;

public class CalcSum implements Runnable {
    long sum = 0;
    @Override
    public void run() {
        System.out.println();
        synchronized (CalcSum.class) {
            for (int i = 1; i <= 100000; i++) {
                sum += i;
            }
            System.out.println("Current Thread: "+ Thread.currentThread().getName() + " Sum: " + sum);

        }

    }
}
