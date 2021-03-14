package ru.job4j.colllection;

import java.util.HashMap;
import java.util.Map;

public class PassportOffice {
    private Map<String, Citizen> citizens = new HashMap<>();

    public boolean add(Citizen citizen) {
        boolean rsl = false;
        if (!citizens.containsKey(citizen)) {
            citizens.put(citizen.getPassport(), citizen);
            rsl = true;
        }
        return rsl;
    }

    public Citizen get(String passport) {
        Citizen citizen;
        for (String s : citizens.keySet()) {
            citizen = citizens.get(s);
            if (citizen.getPassport().equals(passport)) {
                return citizen;
            }
        }
        return null;
    }
}
