package Day_06_01_22_2022.Qeustion4;

public class Room {
    double width;
    double length;

    public String print() {
        return "Width: " + width + ", Length: " + length;
    }
//    public String toString() {===> remove line 10 from Room class
//        return "Width: " + width + ", Length: " + length;
//    }
    public void setInfo(double width, double length) {
        this.width = width;
        this.length = length;
    }
}
