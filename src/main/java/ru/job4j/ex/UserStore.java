package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        int rsl = -1;
        for (int i = 0; i < users.length; i++) {
            if (users[i].getUsername().equals(login)) {
                rsl = i;
            }
        }
        if (rsl == -1) {
            throw new UserNotFoundException("User is not listed.");
        }
        return users[rsl];
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.getUsername().length() < 3 || user.isValid()) {
            throw new UserInvalidException("Username less than 3 letters or invalid user.");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException in) {
            in.printStackTrace();
        } catch (UserNotFoundException fo) {
            fo.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
