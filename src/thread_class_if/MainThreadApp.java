package thread_class_if;

public class MainThreadApp
{

    public static void main(String[] args) {

      //  CountDown threadObj = new CountDown(); {
        //  ThreadnOBJ from Countdown
        //  }
//        ncow.start();
//      Use Thread Class instead of use Sub Class
        Thread threadObj = new Thread(new CountDown());
        // Implement for Runnable
        Thread calcsumObj01 = new Thread(new CalcSum());
        Thread calcsumObj02 = new Thread(new CalcSum());
        calcsumObj01.setName("White");
        calcsumObj02.setName("Black");






        CalcSum black = new CalcSum();
        CalcSum white = new CalcSum();
//        nwclac.run();


//        threadObj.setName("Thread from Countdown");
//        threadObj.start();
//        System.out.println(threadObj.getName());
//       // black.run();
        //white.run();

    }
}