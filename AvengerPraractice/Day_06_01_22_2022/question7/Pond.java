package Day_06_01_22_2022.question7;

public class Pond {

    static Water water;

    public void setWater(String color) {// using setter====>1
        water = new Water(color);
    }   // object          variable

    public Pond(String color) {// using constructor ===>2
        water = new Water(color);
    }
}
