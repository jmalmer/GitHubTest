/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miljoboven;

/**
 *
 * @author Kristoffer
 */
public enum DepartmentsE {
    UNKNOWN("Ej tilldelad", ""),
    CLIMAT("Klimat och Energi", "klimatenergi@kommunen.se"),   
    ECO("Miljö och Hälskoskydd", "miljohalsa@kommunen.se"),
    FORESTRY("Natur och Skogsvård", "naturskog@kommunen.se"),
    SEWERS("Renhållning och Avfall", "renhallning@kommunen.se"),
    TECH("Tekniska avloppshanteringen", "avlopp@kommunen.se");
    
    private String textForm;
    private String email;

    private DepartmentsE(String textForm, String email) {
        this.textForm = textForm;
        this.email = email;
    }

    @Override
    public String toString() {
        return textForm;
    }

    /**
     * Returns e-mail for the department.
     * @return e-mail address
     */
    public String getEmail() {
        return email;
    }
}

