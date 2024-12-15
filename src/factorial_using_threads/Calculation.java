package factorial_using_threads;

public class Calculation {


    private double ans=1;

    void factorial(int start, int end) {
        while (start <= end) {
            ans = ans * (double) start;
            start++;
        }

    }
    public double getAns() {
        return ans;
    }

}
