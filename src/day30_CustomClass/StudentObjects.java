package day30_CustomClass;
import java.util.ArrayList;

public class StudentObjects {

    public static void main(String[] args) {

        Setudent student1 = new Setudent();
        student1.setInfo("Aygun", 'F', 39, 2210, 'A');

        Setudent student2 = new Setudent();
        student2.setInfo("Hulya", 'F', 26, 2123, 'B');

        Setudent student3 = new Setudent();
        student3.setInfo("Elminur", 'F',26,2215,'A');

        Setudent student4 = new Setudent();
        student4.setInfo("Ali", 'M',28,5511,'B');

        Setudent student5 = new Setudent();
        student5.setInfo("Mert", 'M', 26 ,2252, 'C');


        Setudent [] students = {student1, student2, student3, student4, student5};

        for (Setudent student : students) {
            System.out.println(student);
        }

        System.out.println("-----------------------------------------------------");

        ArrayList<Setudent> earlyBirds = new ArrayList<>(); // grade: A
        ArrayList<Setudent> angryBirds = new ArrayList<>();

        for (Setudent student : students) {

            if(student.grade == 'A'){
                earlyBirds.add(student);
            }else{
                angryBirds.add(student);
            }


        }

        System.out.println("Early bird is :"+earlyBirds);

        System.out.println("angryBirds is :"+angryBirds);
    }
    }

