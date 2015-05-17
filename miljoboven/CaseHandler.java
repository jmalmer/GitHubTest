package miljoboven;

import java.util.List;

/**
 *
 * @author Johan
 * @version 2015-05-16
 */
public class CaseHandler {

    private List<Case> caseList;
    private DBHandler dbHandler;
    private NotificationHandler notificationHandler;
    private User user;
    private Case currentCase;

    public CaseHandler() {

    }

    public List<Case> getCaseList() {
        return caseList;
    }

    public void setCaseList(List<Case> caseList) {
        this.caseList = caseList;
    }

    public DBHandler getDbHandler() {
        return dbHandler;
    }

    public void setDbHandler(DBHandler dbHandler) {
        this.dbHandler = dbHandler;
    }

    public NotificationHandler getNotificationHandler() {
        return notificationHandler;
    }

    public void setNotificationHandler(NotificationHandler notificationHandler) {
        this.notificationHandler = notificationHandler;
    }

    public User getUser() {
        return user;
    }

    /**
     * Creates a new Case-object and adds it to the dbHandler.
     * If not logged in no object is created.
     * @param location Location of the violation
     * @param violationType Type of violation
     * @param date Date when the violation was found
     * @param citizen Name of citizen that has reported the violation
     * @param misc Miscellaneous information
     * @return caseID of new Case, 0 if no object was created
     */
    public int addCase(String location, String violationType, String date,
            String citizen, String misc) {
        int caseID = 0;
        if (user != null) {
            currentCase = new Case(user, location, violationType, date, citizen, misc);
            caseID = currentCase.getCaseID();
            dbHandler.addCase(currentCase);
        }
        return caseID;
    }
    
    /**
     * Log in user.
     * @param username
     * @param password
     * @return TODO
     */
    public StartPageUI login(String username, char[] password) {
        user = SecurityCheck.verifyLogin(username, password);
        return null; // TODO
    }
    
    public void confirmLogout() {
        user = null;
    }

}
