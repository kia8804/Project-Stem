/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultimate.frisbee;

/**
 *
 * @author guest123
 */
public class Captain extends UltimatePlayer {
    
    private boolean type;
    
    public Captain(String firstName, String lastName, String position, boolean type)
    {
        super(firstName, lastName, position);
        this.type = type;
    }
    
    public int throwDisc(int pow)
    {
        int dist;
        if(pow < 1) pow = 1;
        if(pow > 10) pow = 10;
        dist = pow*5;
        
        return dist;
    }
    
    public String toString()
    {
        if(type) return super.toString() + "\n   Captain: offense";
        else return super.toString() + "\n   Captain: defense";
    }
}
