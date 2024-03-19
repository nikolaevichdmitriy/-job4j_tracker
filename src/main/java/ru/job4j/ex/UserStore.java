package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (User user : users) {
            if (user.getUsername().equals(login)) {
                return user;
            }
        }
        throw new UserNotFoundException("User not found");
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.getUsername().length() < 3) {
            throw new UserInvalidException("Username must be at least 3 characters long");
        }
        if (!user.isValid()) {
            throw new UserInvalidException(" User is not valid");
        }
        return user.isValid();
    }

    public static void main(String[] args) throws UserNotFoundException {
        User[] users = {new User("Petr Arsentev", true)};
        try {
            User user = findUser(users, "Petr Arsentev ");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserNotFoundException e) {
            System.out.println("User not found: " + e.getMessage());
        }
    }
}
