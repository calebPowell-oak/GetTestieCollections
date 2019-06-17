package rocks.zipcode;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Address implements Iterable<String>, Comparable<Address>{
    private String street;
    private String town;
    private String postCode;
    private String country;

    private String[] all;
    private Integer iterationCount;
    /**
     * Construct an Address without country
     */
    public Address(String street, String town, String postCode) {
        this(street, town, postCode, "");
         all = new String[] {street, town, postCode, country};
         iterationCount = 0;
    }

    /**
     * Construct an Address with full details
     */
    public Address(String street, String town, String postCode, String country) {
        this.street = street;
        this.town = town;
        this.postCode = postCode;
        this.country = country;
        iterationCount = 0;
        all = new String[] {street, town, postCode, country};
    }

    /**
     * Return a string representation of this object.
     */
    public String toString() {
        return street + "\n" + town + " " + postCode + "\n" + country + "\n";
    }

    @Override
    public Iterator<String> iterator() {
        return new AddressIterator();
    }

    @Override
    public int compareTo(Address o) {
        return street.compareTo(o.street);
    }

    class AddressIterator implements Iterator<String> {
        @Override
        public boolean hasNext() {
            return iterationCount < all.length;
        }

        @Override
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            } else {
                return all[iterationCount++];
            }
        }
    }
}
