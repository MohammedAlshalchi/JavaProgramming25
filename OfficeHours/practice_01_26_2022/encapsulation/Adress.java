package practice_01_26_2022.encapsulation;

public class Adress {
    /*
            AdressTask

            Create a class named Address

            Private variables:
                    street, city, state, zipCode,country

            encapsulate all the fields

            add a constructor that can set all the instances
                  overload constr with no arg constr

            - if the street name isEmpty or street length is bigger than 50
             otherwise
                 ERROR : Invalid Street

            - ZipCode length should be equal 5 otherwise
                 ERROR :Invalid ZipCode

            DO NOT duplicate any code fragments
        */

   private String street, city,state,zipCode;
   private final String country= "UAS";// no NEED TO MAKE SETTER because it is final and NOT put in constructor

public Adress () {// as default with NO arguments constructor

}
    public Adress(String street, String city, String state, String zipCode) {
        setStreet(street);
       setCity(city);
       setState(state);
        setZipCode(zipCode);
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {

    if (street.isEmpty() || street.length() > 50){
        System.out.println("Invalid Street ");
        return;// exit the statement
    }
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
if (zipCode.length() != 5){
    System.out.println("Invalid ZipCode ");
    return;
}
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public String toString() {
        return "Adress{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
