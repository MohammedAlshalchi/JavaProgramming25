package day39_Recap.shapeTask;

public class Shape {
/*
Shape:
	variables:
			name
	Encapsulate the field
	Add a constructor to set the filed
	Methods:
		area(){}
		perimeter(){}
 */
  private String name; // we should use getter and setter so we can overriding

  public String getName() {
    return name;
  }

  public void setName (String name) {
    if (name == null){
      System.out.println("Name can not be null");
      System.exit(1);// 1: something went wrong ... 0: means nothing wrong just end the programme
    }
    if(name.isEmpty() || name.isBlank()){
      System.err.println("Invalid name");
      System.exit(1);
    }
    this.name = name;
  }

  public Shape (String name) {// adding constructor
    //this.name = name;

   setName(name); // better way
  }


public double area (){
    return 0;
}

public double perimeter (){
    return 0;
}

  public String toString() {
    return "Shape{" +
            "name='" + name + '\'' +
            ", area='" + area() + '\'' +
            ", perimeter='" + perimeter() + '\'' +
            '}';
  }





}
