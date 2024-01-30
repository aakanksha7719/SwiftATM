import java.util.Scanner;
class Bank {
    private User[] users;

    public Bank() {
        // Initialize user accounts (replace with a database in a real application)
        users = new User[] {
                new User("12345", "6789", 1000.0),
                new User("54321", "9876", 500.0)
        };
    }

    public boolean authenticateUser(String userId, String pin) {
        for (User user : users) {
            if (user.getUserId().equals(userId) && user.getPin().equals(pin)) {
                return true;
            }
        }
        return false;
    }

    public User getUser(String userId) {
        for (User user : users) {
            if (user.getUserId().equals(userId)) {
                return user;
            }
        }
        return null;
    }
}
