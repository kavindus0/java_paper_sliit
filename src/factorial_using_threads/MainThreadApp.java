package factorial_using_threads;

public class MainThreadApp {
    public static void main(String[] args) {
        Calculation calculation = new Calculation();
        calculation.factorial(5,10);
        System.out.println(calculation.getAns());
    }
}
