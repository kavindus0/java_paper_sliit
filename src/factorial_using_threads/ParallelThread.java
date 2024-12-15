package factorial_using_threads;

public class ParallelThread {
    int start;
    int end;
    Calculation myCalc;

    public ParallelThread(int end, Calculation myCalc, int start) {
        this.end = end;
        this.myCalc = myCalc;
        this.start = start;
    }
}
