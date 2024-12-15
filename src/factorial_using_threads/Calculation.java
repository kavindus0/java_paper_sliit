package factorial_using_threads;

public class Calculation {

    public double getAns() {
        return ans;
    }

    private double ans = 1;

    void factorial(int start, int end) {
        while (start <= end) {
            ans = ans * start;
            start++;
        }
        System.out.println(ans);

    }

}
