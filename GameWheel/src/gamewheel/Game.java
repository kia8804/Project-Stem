/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamewheel;


import java.util.ArrayList;

public class Game
{
  public static void play(GameWheel g)
  {
      int won = 0;
      boolean bonus = false;
      Slice spin1 = g.spinWheel();
      Slice spin2 = g.spinWheel();
      Slice spin3 = g.spinWheel();
      
      won = spin1.getPrizeAmount()+spin2.getPrizeAmount()+spin3.getPrizeAmount();

      //Checks if all three spins have the same color.
      if(spin1.getColor() == spin2.getColor() && spin2.getColor() == spin3.getColor())
      {
          won*=2;
          bonus = true;
      }
      
      System.out.println("Total prize money: $" + won);
      
      System.out.println("\nSpin 1 - " + spin1.toString());
      System.out.println("Spin 2 - " + spin2.toString());
      System.out.println("Spin 3 - " + spin3.toString());
      
      if(bonus) System.out.println("Three " + spin1.getColor() + "s = double your money!");

  }
}
