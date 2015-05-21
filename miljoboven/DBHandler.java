package miljoboven;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Acts as an interface to a database.
 * @author Johan
 * @version 2015-05-22
 */
public class DBHandler {

    Map<Integer, Case> cases;

    public DBHandler() {
        this.cases = new HashMap<>(); // Simulerar en databas
    }

    /**
     * Adds new Case to the db.
     *
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

    /**
     * Returns a "deep copy" of the cases in the database.
     *
     * @return List of cases
     */
    public ArrayList<Case> fetchCases() {
        ArrayList<Case> list = new ArrayList<>();
        for (Case c : cases.values()) {
            try {
                list.add((Case) c.clone());
            } catch (CloneNotSupportedException ex) {
                Logger.getLogger(DBHandler.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return list;
    }

    /**
     * Saves changed case to the database.
     * @param changedCase
     * @return true if success
     */
    public boolean saveCase(Case changedCase) {
        cases.put(changedCase.getCaseID(), changedCase);
        return true;
    }

}
