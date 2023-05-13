public class Address {
    private String street;
    private String city;
    private String state;
    private String Zipcode;

    public Address(String street, String city, String state, String zipcode) {

        this.street = street;
        this.city = city;
        this.state = state;
        Zipcode = zipcode;
    }


    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipcode() {
        return Zipcode;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZipcode(String zipcode) {
        Zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", Zipcode='" + Zipcode + '\'' +
                '}';
    }
}
