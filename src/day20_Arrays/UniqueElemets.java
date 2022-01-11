package day20_Arrays;

public class UniqueElemets {
    public static void main(String[] args) {

     String[] words ={"Java", "Java", "C#", "Python","Python"};


        for (int j = 0; j <words.length ; j++) {
            String elements  = words[j];
            int frequency =0;

            for (int i = 0; i < words.length; i++) {
                if (words[i].equals(elements)){
                    frequency++;
                }

            }
            if (frequency ==1 ){
                System.out.println(elements);
            }
        }























    }
}
