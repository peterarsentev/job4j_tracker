package ru.job4j.collection;

import java.util.Map;
import java.util.HashMap;

public class PassportOffice {
    private Map<String, Citizen> citizens = new HashMap<>();

    public boolean add(Citizen citizen) {
        boolean result = false;
        if (!citizens.containsKey(citizen.getPassport())) {
            citizens.put(citizen.getPassport(), citizen);
            result = true;
        }
        return result;
    }

    public Citizen get(String passport) {
        return citizens.get(passport);
    }
}
