/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship;


public class Board{

  private String[][] squares = new String[10][10];

  public Board(){
    for(int i = 0; i < 10; i++)
    {
      for(int j = 0; j < 10; j++)
      {
        squares[i][j] = "-";
      }
    }
  }

  public String toString(){
    String visualization = "";
    for(String[] i : squares)
    {
      for(String j : i)
      {
        visualization+=j + " ";
      }
      visualization+="\n";
    }
    
    return visualization;
  }

  public boolean addShip(int row, int col, int len, boolean horizontal){
    if(row >= 10 || row < 0 || col >= 10 || col < 0) return false;
    
    else if(horizontal)
    {
      if(col+len > 10) return false;
      else
      {
        for(int i = col; i < col+len && i < 10; i++)
        {
          if(squares[row][i].equals("b")) return false;
        }
        for(int i = col; i < col+len && i < 10; i++)
        {
          squares[row][i] = "b";
        }
      }
      return true;
    }
    else
    {
      if(row+len > 10) return false;
      else
      {
        for(int i = row; i < row+len && i < 10; i++)
        {
          if(squares[i][col].equals("b")) return false;
        }
        for(int i = row; i < row+len && i < 10; i++)
        {
          squares[i][col] = "b";
        }
      }
      return true;
    }
  }

  public boolean foundShip(int len){
    for(int i = 0; i < 10; i++)
    {
      int countH = 0, countV = 0;
      for(int j = 0; j < 10; j++)
      {
        
        if(squares[i][j].equals("b"))countH++;
        if(!squares[i][j].equals("b"))
        {
          if(countH == len)return true;
          countH = 0;
        }
        
        if(squares[j][i].equals("b"))countV++;
        if(!squares[j][i].equals("b"))
        {
          if(countV == len)return true;
          countV = 0;
        }
      }
      if(countH == len || countV == len)return true;
    }
    return false;
  }

  public int shoot(int row, int col){
    if(row >= 10 || row < 0 || col >= 10 || col < 0) return -1;
    else if(squares[row][col].equals("-"))
    {
      squares[row][col] = "m";
      return 0;
    }
    else if(squares[row][col].equals("b"))
    {
      squares[row][col] = "x";
      return 1;
    }
    else return 2;
  }

  public boolean gameOver(){
    for(String[] i : squares)
    {
      for(String j : i)
      {
        if(j.equals("b"))return false;
      }
    }
    return true;
  }

}
