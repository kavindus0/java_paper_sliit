package thread_class_if;

public class MainThreadApp
{

    public static void main(String[] args) {

        CountDown threadObj = new CountDown();
//        ncow.start();
//      Use Thread Class instead of use Sub Class


        CalcSum black = new CalcSum();
        CalcSum white = new CalcSum();
//        nwclac.run();

        threadObj.start();

    }
}
