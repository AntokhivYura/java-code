package json;

public class Address {
    private String country;
    private String state;

    public Address(String country, String state) {
        this.country = country;
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
