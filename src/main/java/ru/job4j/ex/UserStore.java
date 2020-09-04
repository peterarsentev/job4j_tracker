package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User rsl = null;
        for (int i = 0; i < users.length; i++) {
            if (login.equals(users[i].getUsername())) {
                rsl = users[i];
                break;
            }
        }
        if (rsl == null) {
            throw new UserNotFoundException("no such user");
        }
        return rsl;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!(user.isValid()) || (user.getUsername().length() < 3)) {
                throw new UserInvalidException("Invalid user");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Pe", true)
        };
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserNotFoundException ex) {
            ex.printStackTrace();
        } catch (UserInvalidException ex2) {
            ex2.printStackTrace();
        }
    }
}