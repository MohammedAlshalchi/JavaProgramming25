package day39_Recap.shapeTask;

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
    public Square (String name, double side) {
        super("Square");
        //this.side = side;
        setSide(side);// more safe , and make sure use the right data EX: we can not use -100 according to the req.
        // of setSide method
    }
}
