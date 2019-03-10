public class Lab_1 {
    private double a1;
    private double b;
    private double n;
    private double m;
    private int con;
    private double s = 0;
    public void setA1(double a1){
        this.a1=a1;
    }

    public  void setB(double b){
        this.b=b;
    }

    public  void setN(double n){
        this.n=n;
    }

    public  void setM(double m){
        this.m=m;
    }

    public  void setCon(int con){
        this.con=con;
    }

    void lab1() {
        try {
            try {
                for (double i = a1; i <= n; i++) {
                    for (double j = b; j <= m; j++) {
                        s += (i % j) / (i - con);
                    }
                }
            }catch(ArithmeticException ex){
                System.out.println("i-con=0!Исправьте это");
            }
            System.out.println("s=" + s);
        }catch(java.util.InputMismatchException ex){
            System.out.println("Введите правильный тип переменных!!!");
        }

    }
}
