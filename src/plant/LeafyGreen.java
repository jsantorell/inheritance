/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plant;

/**
 *
 * @author jerem
 */
public class LeafyGreen extends Plant {

    private String cuizineItISUsedIn;

    public LeafyGreen(int months, String a) {
        super(months);
        this.cuizineItISUsedIn = "Greek, Irish, Polish";
        Plant p = new Plant(months);
        int growTimeInMonths = getGrowTimeInMonths();
        growTimeInMonths = months;
        Reporter r = new Reporter(months, a, cuizineItISUsedIn, p);

    }

    public String getColor() {
        return cuizineItISUsedIn;
    }

    public void setColor(String color) {
        this.cuizineItISUsedIn = color;
    }

}
