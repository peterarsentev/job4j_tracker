package ru.job4j.stream;

/**
 * В данном классе описывается анкета клиента
 */
public class Profile {
    private Address address;

    public Profile(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
}
