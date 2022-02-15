package day45_Abstraction.shapeTask;

public abstract class Shape {

    private final String name;


    public Shape(String name) {// create constructor
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double area ();

    public abstract double perimeter ();

//    public String toString() {
//        return getClass().getSimpleName()+ "{" +
//                "area='" + area() + '\'' +
//                " perimeter='" + perimeter() + '\'' +
//                " name='" + name + '\'' +
//                '}';
//    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", area='" + area() + '\'' +
                        ", perimeter='" + perimeter() + '\'';

    }


}
