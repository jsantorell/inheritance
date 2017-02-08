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
   
    private String color;

    public LeafyGreen(int months, String a) {
        super(months);
        this.color = "Green or red";
        Plant p = new Plant(months);
        int growTimeInMonths = getGrowTimeInMonths();
        growTimeInMonths = months;
        System.out.println("Grow time is: " + growTimeInMonths + " months");
        System.out.print("Growing Season: ");
        p.season(a);
        System.out.print("color: ");
        System.out.println(color);
        
    }
 


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
