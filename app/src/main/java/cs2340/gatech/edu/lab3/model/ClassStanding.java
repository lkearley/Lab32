package cs2340.gatech.edu.lab3.model;

/**
 * Created by laurenkearley on 6/6/17.
 *
 */

public enum ClassStanding {
    FRESHMAN("FR"),
    SOPHOMORE("SO"),
    JUNIOR("JR"),
    SENIOR("SR");

    private String charRep;
    private ClassStanding(String _str) {
        this.charRep = _str;
    }
}
