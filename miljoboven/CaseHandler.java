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

    public startPageUI login(String username, char[] password) {
        user = SecurityCheck.verifyLogin(username, password);
        return null; // TODO
    }
    
    public void confirmLogout() {
        user = null;
    }

}
