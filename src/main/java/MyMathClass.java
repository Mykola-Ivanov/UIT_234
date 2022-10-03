public class MyMathClass {
    Object object;
    long factorial(int num){
        if(num < 0)
            throw new IllegalArgumentException("argument must be none negative");
        if(num == 0) return 1;
        else return num * factorial(num - 1);
    }
    double intPow(double x,int a){
        double result = 1;
        boolean negative = a<0 ? true : false;
        if(negative) a = -a;
        while (a>0){
            result = result * x;
            a--;
        }
        if(negative) result = 1.0 / result;
        return result;
    }
}
