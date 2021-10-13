package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User searchedUser = null;
        for (User user: users) {
            String username = user.getUsername();
            if (username.equals(login)) {
                searchedUser = user;
                break;
            }
        }
        if (searchedUser == null) {
            throw new UserNotFoundException("User [" + login + "] is not found.");
        }
        return searchedUser;
    }

    public static boolean validate(User user) throws UserInvalidException {
        String name = user.getUsername();
        if (!user.isValid() || name.length() < 3) {
            throw new UserInvalidException("User [" + name + "] is not valid");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {new User("Petr Arsentev", false)};
        try {
            User user = findUser(users, "Petr Arsentev");
            validate(user);
        } catch (UserInvalidException eInvalid) {
            eInvalid.printStackTrace();
        } catch (UserNotFoundException eNotFound) {
            eNotFound.printStackTrace();
        }
    }
}
