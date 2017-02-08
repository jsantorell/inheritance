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
public class Plant {

    private int growTimeInMonths;

    public void GetTheSeasonAndOutput(String a) {
        
        if(a == null || a.isEmpty()){
            a = "no season given";
            System.out.println(a);    
                }else{
        System.out.println(a);}
    }

    public Plant(int growTimeInMonths) {
        this.growTimeInMonths = growTimeInMonths;
    }
    
    

    public int getGrowTimeInMonths() {
        return growTimeInMonths;
    }

    public void setGrowTimeInMonths(int growTimeInMonths) {
        this.growTimeInMonths = growTimeInMonths;
    }

}
