package miljoboven;

/**
 *
 * @author johan
 */
class NotificationHandler {

    void sendNotification(Case currentCase) {
        System.out.println("Avisering om nytt tilldelat ärende skickat till " 
                + currentCase.getDepartment());
    }
    
}
