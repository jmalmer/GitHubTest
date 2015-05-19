package miljoboven;

/**
 * Class to check user credentials.
 * @author Johan
 * @version 2015-05-16
 */
public class SecurityCheck {
    
    // Data för prototyp
    private static final User[] users = { 
        new User("johan", "password".toCharArray()),
        new User("kristoffer", "password".toCharArray())
    };
      
    /**
     * Returns the User with the username and password provided. If no User
     * corresponds to the parameters null is returned
     * @param username The User's username
     * @param password The User's password
     * @return The User with the corresponding username and password or null
     */
    public static User verifyLogin(String username, char[] password) {
        User user = null;
        for (User u : users) {
            if (username.equals(u.getUsername()) && 
                    u.verifyPassword(password)) {
                user = u;
                break;
            }
        }
        return user;
    }
           
}
