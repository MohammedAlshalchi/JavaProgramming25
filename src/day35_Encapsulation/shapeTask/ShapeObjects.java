package day35_Encapsulation.shapeTask;

public class ShapeObjects {
    public static void main(String[] args) {


        Square square = new Square(10); // NO need to pass the name and will check the condition

        System.out.println(square);
        square.setSide(10);
        System.out.println(square.getSide());
        System.out.println(square.getName());

        System.out.println("+++++++++++++++++++++++++++++++");

Rectangler rectangler = new Rectangler(15,10);
        System.out.println(rectangler);
rectangler.setLength(10);
        System.out.println(rectangler.getLength());
        System.out.println(rectangler.getName());


        System.out.println("+++++++++++++++++++++++++++++++");


Circle circle = new Circle(10);

        System.out.println(circle);

circle.setName("circl1");
circle.setRadius(10);
        System.out.println(circle.getRadius());
        System.out.println(circle.getName());











    }

    }


