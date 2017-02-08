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
 Plant p = new Plant();
 
    public LeafyGreen(int months) {
       
        int growTimeInMonths = getGrowTimeInMonths();
        growTimeInMonths = months;
        System.out.println("Grow time is: " + growTimeInMonths + " months");
        System.out.print("Growing Season: ");
        p.season();
    }

}
