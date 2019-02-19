public class CalculatorClass {

    private int x;
    private int y;

    public CalculatorClass(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int multiplyNumbers() {
        return this.x * this.y;
    }

    public double divideNumbers() {
        if(this.y != 0) {
            return (double)this.x / this.y;
        } else {
            return 0;
        }
    }
}
