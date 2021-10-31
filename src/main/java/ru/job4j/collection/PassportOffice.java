package ru.job4j.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PassportOffice {
    private Map<String, Citizen> citizens = new HashMap<>();

    public boolean add(Citizen citizen) {
        boolean rsl = false;
        if (!citizens.containsKey(citizen.getPassport())) {
            citizens.put(citizen.getPassport(), citizen);
            rsl = true;
        }
        return rsl;
    }

    public Citizen get(String passport) {
        return citizens.get(passport);
    }

    public static void main(String[] args) {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        Citizen citizen1 = new Citizen("2f44a", "Petr Arsentev");
        Citizen citizen2 = new Citizen("2f44", "Petr Arsentev");
        Citizen citizen3 = new Citizen("2f44", "Petr Arsentev");

        PassportOffice office = new PassportOffice();
        System.out.println(office.add(citizen));
        System.out.println(office.add(citizen1));
        System.out.println(office.add(citizen));
        System.out.println(office.add(citizen2));
        System.out.println(office.add(citizen3));

    }
}