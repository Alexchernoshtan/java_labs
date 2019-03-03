import java.util.Scanner;
public class Lab_1 {
    void lab1() {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Input double a: ");
            double a = in.nextDouble();
            System.out.println("Input double b: ");
            double b = in.nextDouble();
            System.out.println("Input double n: ");
            double n = in.nextDouble();
            System.out.println("Input double m: ");
            double m = in.nextDouble();
            System.out.println("Input int con: ");
            int con = in.nextInt();
            double s = 0;
            try {
                for (double i = a; i <= n; i++) {
                    for (double j = b; j <= m; j++) {
                        s += (i % j) / (i - con);
                    }
                }
            }catch(ArithmeticException ex){
                System.out.println("i-con=0!Исправьте это");
            }
            System.out.println("s=" + s);
            in.close();
        }catch(java.util.InputMismatchException ex){
            System.out.println("Введите правильный тип переменных!!!");
        }

    }
}
