package miljoboven;

/**
 *
 * @author johan
 */
class Case {
    
    private String department;
    private int caseID;
    private User caseWorker;
    private String location;
    private String violationType;
    private String date;
    private String citizen;
    private String misc;
    
    private static int nextCaseID = 1;

    public Case(User caseWorker, String location, String violationType, String date, String citizen, String misc) {
        this.caseWorker = caseWorker;
        this.location = location;
        this.violationType = violationType;
        this.date = date;
        this.citizen = citizen;
        this.misc = misc;
        this.caseID = nextCaseID ++;
    }

    public String getDepartment() {
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

    public String getCitizen() {
        return citizen;
    }

    public String getMisc() {
        return misc;
    }

    public static int getNextCaseID() {
        return nextCaseID;
    }
    
    
    
}
