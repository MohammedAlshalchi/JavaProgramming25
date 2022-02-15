package day45_Abstraction.shapeTask;

public  class  Circle extends Shape{

private double raduis;
public final static double pi = 3.14;// we should iniliazed directly

    public Circle(double raduis) {
        super("Circle");
        //this.raduis = raduis;
        setRaduis(raduis);
    }

    public double getRaduis() {
        return raduis;
    }

    public void setRaduis(double raduis) {
        if (raduis < 0){
            throw new RuntimeException("Invalid Raduis"+raduis);
        }
        this.raduis = raduis;
    }

    @Override
    public double area() {
       // return 0;
        return raduis * raduis * pi;
    }

    @Override
    public double perimeter() {
       // return 0;
        return 2 *raduis * pi  ;
    }

    @Override
    public String toString() {
        return "Circle{" +
                super.toString()+
                ", radius=" + raduis +
                '}';
    }






}
