package practice_01_19_2022;

import java.util.ArrayList;

public class Classroom {
    ArrayList<Student> students;

    public Classroom(){
        students = new ArrayList<>();
    }
}

class Student {
    public static void main(String[] args) {
        Classroom classroom = new Classroom();
        classroom.students.add(new Student());// ====> student 1 but No name
        classroom.students.add(new Student());// =====> student 2 but No name
        System.out.println(classroom.students.size());
    }
}
