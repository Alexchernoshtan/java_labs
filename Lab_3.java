public class Lab_3 {

    void lab3() {
        String text="hehho wwos ffas";
        String[] words= text.split(" ");
        text=" ";
        for(int i=0; i<words.length;i++){
            if(words[i].isEmpty()){
                continue;
            }
            String first = String.valueOf(words[i].charAt(0));
            words[i] = words[i].replaceAll(first,"");
            first +=words[i];
            text += first+ " ";
        }
        System.out.println(text);
    }
}

