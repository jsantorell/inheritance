package plant;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jerem
 */
public class startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Plant brusselSprouts = new cabbage(
                
                /*Select the shape of the cabbage*/
                
                "Ball",
                
                /*Select Months this plant takes to grow*/ 
                4, 
                
                /*Season the month to start to harvest >>>>>>EXAMPLE: March-November<<<<<<*/ 
                
                "");

        System.out.println(brusselSprouts);

    }

}
