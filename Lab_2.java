import java.util.Random;
public class Lab_2{

    public static void main(String[] args) {
         long[][] A = new long[5][5];
        long[][] B = new long[5][5];
        long[][] C = new long[5][5];

         Random rnd = new Random();
         long sum=0;

        for (int i=0;i < A.length;i++) {
            for (int j=0;j < A[i].length;j++) {
                A[i][j]=rnd.nextInt(10) + 1;
            }
        }

        for (int i=0;i < B.length;i++) {
            for (int j=0;j < B[i].length;j++) {
                B[i][j]=rnd.nextInt(10) + 1;
            }
        }

        for (int i=0;i < A.length;i++,System.out.println()) {
            for (int j=0;j < A[i].length;j++) {
                System.out.print(A[i][j]+" ");
            }
        }
        System.out.println('\n');

        for (int i=0;i < B.length;i++,System.out.println()) {
            for (int j=0;j < B[i].length;j++) {
                System.out.print(B[i][j]+" ");
            }
        }


        System.out.println('\n');


        for (int i = 0; i < A.length; i++) {
            long min=A[0][i];
            for (int j = 0; j < A.length-1 ; j++) {
                if(min>A[j+1][i]){
                    min=A[j+1][i];
                }

            }
            sum+=min;
        }



        System.out.println("Sum A="+sum);

        System.out.println('\n');
        for(int i=0;i<C.length;i++){
            for(int j=0;j<C.length;j++){
                C[i][j]=A[i][j]+B[i][j];
            }
        }
        System.out.println("Mas C:");
        System.out.println('\n');
        for (int i=0;i < C.length;i++,System.out.println()) {
            for (int j=0;j < C[i].length;j++) {
                System.out.print(C[i][j]+" ");
            }
        }

    }
    }



