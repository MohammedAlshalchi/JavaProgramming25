package day39_Recap.shapeTask;

public class Rectangler extends Shape{
    /*
    Rectangle extends Shape:
	variables:
		length
		width
	Encapsulate the fields
	Add a constructor to set the filed
	area(): length * width
	perimeter(): 2 * ( width + length)
	toString(): length, width, area, perimeter
     */

   private double length ,width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
       if (length <= 0 ){
           System.out.println("Invalid Length: "+length);
           System.exit(1);
       }
       this.length= length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangler(double length, double width) {
        super("Rectangle");// no need to provide name each time
//        this.length = length;==> we have to put the condition here
//        this.width = width;
        setLength(length);
        setWidth(width);
    }

    @Override// we can move it
    public double area() {
//        return super.area();
        return length   * width;
    }


    public double perimeter() {
//        return super.perimeter();
        return 2 * (length * width);
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
