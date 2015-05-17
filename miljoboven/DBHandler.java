package miljoboven;

import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author johan
 */
public class DBHandler {
    
    Map<Integer, Case> cases;

    public DBHandler() {
        this.cases = new HashMap<>();
    }
    
    /**
     * Adds new Case to the db.
     * @param newCase Case to be added
     * @return true if success
     */
    public boolean addCase(Case newCase) {
        boolean success = !(cases.containsKey(newCase.getCaseID()));
        if (success) {
            cases.put(newCase.getCaseID(), newCase);
        }
        return success;
    }
    
}
