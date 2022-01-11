package day01_JavaIntro;

public class InterviewQA {
    public static void main(String[] args) {

        String str ="how  are thats    cool ";

      // System.out.println(str);

        while (str.contains("  ")){

            str=str.replace("  "," ");
        }

        System.out.println(str);



    }
}
