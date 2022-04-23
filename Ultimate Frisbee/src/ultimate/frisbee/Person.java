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
public class Person
{
  
  private String firstName;
  private String lastName;
  
  public Person(String firstName, String lastName)
  {
    this.firstName = firstName;
    this.lastName = lastName;
  }
  
  public int throwDisc(int pow)
  {
      if(pow > 10) pow = 10;
      if(pow < 1) pow = 1;
      
      int dist = pow*2;
      
      return dist;
  }
  
  public String toString()
  {
      return lastName + ", " + firstName;
  }
  
}
