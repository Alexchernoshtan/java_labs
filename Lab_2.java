import java.util.Random;
public class Lab_2 {
   void lab2() {

       int[][] mas = new int[5][5];
       Random rnd = new Random();
       for (int i=0;i < mas.length;i++) {
           for (int j=0;j < mas[i].length;j++) {
               mas[i][j]=rnd.nextInt(10) + 1;
           }
       }
       for (int i=0;i < mas.length;i++,System.out.println()) {
           for (int j=0;j < mas[i].length;j++) {
               System.out.print(mas[i][j]+" ");
           }
       }


        int sum=0;

        for (int i = 0; i < mas.length; i++) {
            int min=mas[0][i];
            for (int j = 0; j < mas.length-1 ; j++) {
                if(min>mas[j+1][i]){
                    min=mas[j+1][i];
                }


            }

            sum+=min;
        }
       System.out.println("Sum="+sum);

    }
}