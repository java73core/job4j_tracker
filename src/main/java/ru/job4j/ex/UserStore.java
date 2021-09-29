package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User result = null;
        for (int i = 0; i < users.length; i++) {
            if(users[i].equals(login)) {
                result = users[i];
            }
        }
        if(result == null){ throw new UserNotFoundException("User not found!");}
        return result;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if(!user.isValid() || user.getUsername().length() < 3) {
            throw new UserInvalidException("UserInvalidException!");
        }
        return true;
    }

    public static void main(String[] args) throws UserNotFoundException, UserInvalidException {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        User user = findUser(users, "Petr Arsentev");
        if (validate(user)) {
            System.out.println("This user has an access");
        }
    }
}