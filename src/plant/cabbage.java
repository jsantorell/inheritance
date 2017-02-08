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
public class cabbage extends LeafyGreen {

    private String shape;

    public cabbage(String shape, int months, String a) {
        super(months, a);
        this.shape = shape;
        System.out.print("Cabbage Shape: ");
        System.out.println(shape);
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    

}
