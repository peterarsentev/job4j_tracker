package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User rsl = null;
        for (User user : users) {
            if (user.getUsername().equals(login)) {
                rsl = user;
                break;
            }
        }
        if (rsl == null) {
            throw new UserNotFoundException("User not found.");
        }
        return rsl;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid()) {
            throw new UserInvalidException("Invalid user.");
        }
        if (user.getUsername().length() < 3) {
            throw new UserInvalidException("Username must be greater than 2 symbols");

        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Pe7", true),
                new User("Pet", true),
                new User("Petr", true),
                new User("Petr A", true),
        };
        User user;
        try {
            user = findUser(users, "Petr");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
    }
}
