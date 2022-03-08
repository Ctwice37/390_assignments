package assignment_7.prog1;

public class Exponential {

    public double power(double x,int n){
        if(n == 0)
            return 1.0;
        return x * power(x, n-1);

    }

    public static void main(String[] args) {
        Exponential x = new Exponential();
        System.out.println(x.power(2.0, 3));
    }

}
