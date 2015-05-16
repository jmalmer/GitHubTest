package miljoboven;

import java.util.Arrays;

/**
 * Class for user data.
 * @author Johan
 * @version 2015-05-16
 */
public class User {
    
    private String username;
    private char[] password;
    
    /**
     * Constructs a new User object with username and password.
     * Does not check if username is unique. Class may be changed to use
     * factory method that checks for unique username.
     * @param username The User's username
     * @param password The User's password
     */
    public User(String username, char[] password) {
        this.username = username;
        this.password = password.clone();
    }
    
    /**
     * Verifies if password is correct for the user.
     * @param password
     * @return true if the password is correct
     */
    public boolean verifyPassword(char[] password) {
        return Arrays.equals(password, this.password);
    }

    /**
     * Gets the username.
     * @return username.
     */
    public String getUsername() {
        return username;
    }
    
}
