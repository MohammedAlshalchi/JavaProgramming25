package day05_Concatenation;

public class ShippingAdress {
    public static void main(String[] args) {
        String name = "Mohammed Alshalchi";
        int BuildingNumber =15;
        int StreetNumber = 15;
        String city = "Dumfries";
        String state ="VA";
        int ZipCode =0000;
        System.out.println("Name: " + name + " ,Building NO.: "+BuildingNumber+ " ,Steert NO.: "+ StreetNumber+ " ,City: "+city+ " ,State: "+ state+ " ,ZIP: "+ ZipCode);
        System.out.println("----------");
        System.out.println(name + "\n"+ BuildingNumber+ " "+StreetNumber+"\n"+city+", "+state+" "+ZipCode);
        String address = name + "\n"+ BuildingNumber+ " "+StreetNumber+"\n"+city+", "+state+" "+ZipCode;// very good
        System.out.println(address);// next time just call asdress to print
        System.out.println("-------");
        System.out.println(address);
/*
String city = "Dumfries",      (we can use one ; in the end )... one data type ( String )
         state ="VA",
         streetName = " old road ";
 */











    }


















}
