public class MyMathClass {
    long factorial(int num){
        if(num < 0)
            throw new IllegalArgumentException("argument must be none negative");
        if(num == 0) return 1;
        else return num * factorial(num - 1);
    }
    double intPow(double x,int a){
        double result = 1;
        while (a>0){
            result = result * x;
            a--;
        }
        return result;
    }
    long Ackerman(long m, long n){
        if (m == 0) {
            return n + 1;
        } else if (n == 0) {
            return Ackerman(m - 1, 1);
        } else {
            return Ackerman(m - 1, Ackerman(m, n - 1));
        }
    }
}
