package thread_class_if;

public class CountDown extends Thread{

@Override
    public void run() {
    synchronized (CountDown.class) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i+1);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }
    }


        }
    }

