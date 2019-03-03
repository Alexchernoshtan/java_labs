import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

            try {

                Scanner in = new Scanner(System.in);
                System.out.println("Input lab number: ");
                int a = in.nextInt();
                switch (a) {
                    case 1:
                        Lab_1 one = new Lab_1();
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

