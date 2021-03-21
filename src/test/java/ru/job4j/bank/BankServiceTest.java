package ru.job4j.bank;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BankServiceTest {

    @Test
    public void addUser() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        assertThat(bank.findByPassport("3434"), is(user));
    }

    @Test
    public void whenEnterInvalidPassport() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150D));
        assertNull(bank.findByRequisite("34", "5546"));
    }

    @Test
    public void addAccount() {
        User user = new User("3434", "Petr Arsentev");
        BankService bank = new BankService();
        bank.addUser(user);
        bank.addAccount(user.getPassport(), new Account("5546", 150D));
        assertThat(bank.findByRequisite("3434", "5546").getBalance(), is(150D));
    }

    @Test
    public void transferMoney() {
        User user = new User("3434", "Petr Arsentev");
        User user2 = new User("3435", "Petr Arsentev");

        BankService bank = new BankService();
        bank.addUser(user);
        bank.addUser(user2);
        bank.addAccount(user.getPassport(), new Account("5546", 150D));
        bank.addAccount(user2.getPassport(), new Account("113", 50D));
        bank.transferMoney(user.getPassport(), "5546", user2.getPassport(), "113", 150D);
        assertThat(bank.findByRequisite(user2.getPassport(), "113").getBalance(), is(200D));
    }
}