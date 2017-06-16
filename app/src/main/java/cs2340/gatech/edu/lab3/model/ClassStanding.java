package cs2340.gatech.edu.lab3.model;

import java.io.Serializable;


/**
 * Created by laurenkearley on 6/6/17.
 *
 */

public enum ClassStanding implements Serializable {
    FRESHMAN("FR"),
    SOPHOMORE("SO"),
    JUNIOR("JR"),
    SENIOR("SR");

    /**
     * Character repsentation of the strin
     */
    private String charRep;


    ClassStanding(String _str) {
        this.charRep = _str;
    }

    @Override
    public String toString() {
        return this.charRep;
    }
}

