public class Lab_3 {
    void lab3() {
        String str1="hehho wwos ffas";
        System.out.println(str1);
        str1.trim();
        String [] str2=str1.split(" ");

        for(int i =0; i<str2.length;i++){
            for(int j=1;j<str2.length;j++){
                if(str2[i].charAt(0)==str2[i].charAt(j)){
                    //str2[i]=str2[i].substring(0,j) + str2[i].substring(j+1);
                    char l=str2[i].charAt(0);
                    str2[i]=str2[i].replace(l,'//s');
                }
            }

            System.out.println(str2[i]);
        }







    }
}
