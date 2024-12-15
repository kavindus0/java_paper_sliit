package thread_class_if;

public class ClacSum implements Runnable {
    long sum = 0;
    @Override
    public void run() {
        synchronized (ClacSum.class) {
            for (int i = 1; i <= 100000; i++) {
                sum += i;
            }
            System.out.println(sum);

        }

    }
}
