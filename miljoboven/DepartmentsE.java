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
    TECH("Tekniska avloppshanteringen"),
    CLIMAT("Klimat och Energi"),
    ECO("Miljö och Hälskoskydd"),
    FORESTRY("Natur och Skogsvård"),
    SEWERS("Renhållning och Avfall"),
    UNKNOWN("");
    
    private String textForm;

    private DepartmentsE(String textForm) {
        this.textForm = textForm;
    }

    @Override
    public String toString() {
        return textForm;
    }
}

