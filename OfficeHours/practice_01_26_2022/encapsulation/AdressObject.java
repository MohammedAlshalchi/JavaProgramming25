package practice_01_26_2022.encapsulation;

public class AdressObject {
    public static void main(String[] args) {


  Adress home = new Adress();

        home.setStreet("1234 Abcd rd. Suite 756");
        home.setCity("Chicago");
        home.setState("IL");
        home.setZipCode("57896");

        System.out.println("Home address: "+ home);
        home.setZipCode("578762");
        home.setStreet("");
        System.out.println("Home address: "+home);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

       Adress work = new Adress("1234 Abcd rd. Suite 756","Chicago","IL","56784");
        System.out.println("Work Address: "+ work);




















    }
}
