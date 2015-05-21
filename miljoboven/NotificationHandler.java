package miljoboven;

/**
 *
 * @author johan
 */
class NotificationHandler {

    void createAndSendNotification(Case currentCase) {
        System.out.println("Avisering om nytt tilldelat ärende skickat till " 
                + currentCase.getDepartment());
    }
    
}
