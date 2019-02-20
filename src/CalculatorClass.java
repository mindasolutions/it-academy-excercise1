public class CalculatorClass {

    private int x;
    private int y;

    public CalculatorClass(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int multiplyNumbers() {
        return x * y;
    }

    public double divideNumbers() {
        if(y != 0) {
            return (double)x / y;
        } else {
            return 0;
        }
    }
}
