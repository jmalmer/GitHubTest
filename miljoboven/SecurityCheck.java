package miljoboven;

/**
 * 
 * @author Johan & Kristoffer
 */
public class SecurityCheck {
    
    private final User[] users = { 
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
    public User verifyLogin(String username, char[] password) {
        User user = null;
        for (User u : users) {
            if (u.verifyPassword(username, password)) {
                user = u;
            }
        }
        return user;
    }
           
}
