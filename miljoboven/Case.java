package miljoboven;

/**
 * Class that holds data for a case.
 * @author Johan
 * @author Kristoffer
 * @version 2015-05-22
 */
public class Case implements Cloneable {
    
    private DepartmentsE department;
    private int caseID;
    private User caseWorker;
    private String location;
    private String violationType;
    private String date;
    private String citizenName;
    private String citizenTele;
    private String misc;
    
    private static int nextCaseID = 1;

    public Case(String location, String violationType, String date, String citizenName, String citizenTele, String misc) {
        this.location = location;
        this.violationType = violationType;
        this.date = date;
        this.citizenName = citizenName;
        this.citizenTele = citizenTele;
        this.misc = misc;
        this.department = DepartmentsE.UNKNOWN;
        this.caseID = nextCaseID++;
    }

    public DepartmentsE getDepartment() {
        return department;
    }

    public int getCaseID() {
        return caseID;
    }

    public User getCaseWorker() {
        return caseWorker;
    }

    public String getLocation() {
        return location;
    }

    public String getViolationType() {
        return violationType;
    }

    public String getDate() {
        return date;
    }

    public String getCitizenName() {
        return citizenName;
    }
    
    public String getCitizenTele() {
        return citizenTele;
    }
    
    public void setMisc(String misc){
        this.misc = misc;
    }
    

    public String getMisc() {
        return misc;
    }

    public static int getNextCaseID() {
        return nextCaseID;
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /**
     * Sets department responsible for the case.
     * @param department
     */
    public void setDepartment(DepartmentsE department) {
        this.department = department;
    }
    
    
}
