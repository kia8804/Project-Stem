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
public class Coach extends Person
{
   private String role;
   
   public Coach(String firstName, String lastName, String role)
   {
       super(firstName, lastName);
       this.role = role;
   }
   
   public String toString()
   {
       return super.toString() + "\n   Role: " + this.role;
   }
   
}