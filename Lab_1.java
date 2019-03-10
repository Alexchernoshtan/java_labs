import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

            try {

                Scanner in = new Scanner(System.in);
                System.out.println("Input lab number: ");
                int a = in.nextInt();
                switch (a) {
                    case 1:
                        System.out.println("Input double a1: ");
                        double a1 = in.nextDouble();
                        System.out.println("Input double b: ");
                        double b = in.nextDouble();
                        System.out.println("Input double n: ");
                        double n = in.nextDouble();
                        System.out.println("Input double m: ");
                        double m = in.nextDouble();
                        System.out.println("Input int con: ");
                        int con = in.nextInt();

                        Lab_1 one = new Lab_1();
                        one.setA1(a1);
                        one.setB(b);
                        one.setCon(con);
                        one.setM(m);
                        one.setN(n);
                        one.lab1();
                        break;
                    case 2:
                        Lab_2 two = new Lab_2();
                        two.lab2();
                        break;
                    case 3:
                        Lab_3 three = new Lab_3();
                        three.lab3();
                        break;
                    default:
                        System.out.println("Этой лабораторной нету,введите другой номер");
                }

            } catch (java.util.InputMismatchException ex) {
                System.out.println("Введите число!!");
            }
    }

}

