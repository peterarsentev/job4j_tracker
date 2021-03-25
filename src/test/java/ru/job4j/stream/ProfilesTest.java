package ru.job4j.stream;
import org.junit.Test;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ProfilesTest {

    @Test
    public void adressCollect() {
        Profile profile1 = new Profile(new Address("Saint Petersburg", "Nevskiy Prospect", 10, 10));
        Profile profile2 = new Profile(new Address("Moskow", "Arbat", 10, 6));
        Profile profile3 = new Profile(new Address("Novgorod", "Lenina Street", 1, 56));
        List<Profile> profiles = List.of(profile1, profile2, profile3);
        Profiles pr = new Profiles();
        List<Address> rsl = pr.collect(profiles);
        List<Address> expected = List.of(new Address("Saint Petersburg", "Nevskiy Prospect", 10, 10),
                new Address("Moskow", "Arbat", 10, 6),
                new Address("Novgorod", "Lenina Street", 1, 56));
        assertThat(rsl, is(expected));
    }

}