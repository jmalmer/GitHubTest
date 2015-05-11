package miljoboven;

/**
 * 
 * @author Johan
 * @version 2015-05-11
 */
public class User {
    
    private String username;
    private char[] password;
    
    public User(String username, char[] password) {
        this.username = username;
        this.password = password.clone();
    }
}
