package ru.job4j.stream;

public class Profile {
    private Address address;

    public Profile(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

//    public int compareTo(Profile i2) {
//        return Integer.compare(this.address, i2.address);
//    }
}
