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
public class LeafyGreen extends Plant{

    public LeafyGreen() {
        
        int growTimeInMonths = getGrowTimeInMonths();
        growTimeInMonths = 3;
        System.out.println("Grow time is: " + growTimeInMonths);
    }
    
    
        
}
