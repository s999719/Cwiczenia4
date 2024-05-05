public class Address {
    // Stwórz klasę Address reprezentującą adres zamieszkania.
    // Klasa powinna implementować przeciążoną metodę createAddress, która przyjmuje jako parametry:

    // a) kraj
    public String createAddress(String country) {
        return String.format("Country: %s", country);
    }

    // b) kraj, miasto
    public String createAddress(String country, String city) {
        return String.format("Country: %s, City: %s", country, city);
    }

    // c) kraj, miasto, kod pocztowy
    public String createAddress(String country, String city, String postalCode) {
        return String.format("Country: %s, City: %s, Postal Code: %s", country, city, postalCode);
    }

    // d) kraj, miasto, kod pocztowy, nazwę ulicy
    public String createAddress(String country, String city, String postalCode, String streetName) {
        return String.format("Country: %s, City: %s, Postal Code: %s, Street: %s", country, city, postalCode, streetName);
    }

    // e) kraj, miasto, kod pocztowy, nazwę ulicy, numer mieszkania
    public String createAddress(String country, String city, String postalCode, String streetName, int apartmentNumber) {
        return String.format("Country: %s, City: %s, Postal Code: %s, Street: %s, Apartment Number: %d", country, city, postalCode, streetName, apartmentNumber);
    }
}