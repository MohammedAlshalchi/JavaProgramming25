package day37_Inheritance.phoneTask.shapeTask;

public class Square extends Shape{
 /*
   Square extends Shape:
	variables:
		side;
	Encapsulate the field
	Add a constructor to set the filed
	area(): side * side
	perimeter(): side * 4
	toString(): side, area, perimeter
  */

// first we should add the extra variables
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {

        if(side <= 0){
            System.err.println("Invalid Side: "+side);
            System.exit(1);
        }
        this.side = side;
    }

                                // we can not use -100
    public Square (double side) {
        super("Square");
        //this.side = side;
        setSide(side);// more safe , and make sure use the right data EX: we can not use -100 according to the req.
        // of setSide method
    }

    @Override
    public double area() {
        //return super.area();
        return side * side;
    }

    @Override
    public double perimeter() {
        return side * 4;
    }

    @Override
    public String toString() {
        //return super.toString();
        return "Square{" +
                "side='" + side + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }
}
