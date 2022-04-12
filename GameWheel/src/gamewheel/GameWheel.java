/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamewheel;


import java.util.ArrayList;
import java.util.Random;

public class GameWheel
{
  private ArrayList<Slice> slices; // List of slices making up the wheel
  private int currentPos;   // Position of currently selected slice on wheel


  /* Returns string representation of GameWheel with each numbered slice
   * on a new line
   */
  public String toString(){
    String s = "";
    for(int i = 0; i < 20; i++)
    {
       s+= i + " - " + slices.get(i) + "\n";
    }
    return s;
  }


  /* Randomizes the positions of the slices that are in the wheel, but without
   * changing the pattern of the colors
   */
  
  private void scrambleAlgorithm(int index, int factor, int odd)
  {
    Random random = new Random();
    
    // Finds numbers which are odd or even between 1-19.
    int randomIndex = random.nextInt(19/factor)*factor+odd;

 /* Generates new randomIndex while randomIndex is
    multiple of five, but factor isn't five.
   */
    while(randomIndex%5==0 && factor != 5)
    {
      randomIndex = random.nextInt(19/factor)*factor+odd;
    }
    Slice temp = slices.get(index);
    slices.set(index, slices.get(randomIndex));
    slices.set(randomIndex, temp);
  }
          
          
  public void scramble()
  {
    
    for(int i = 0; i < 20; i++)
    {
     
   /* Verifies the index of the slice before scrambling
      in order to maintain color pattern.
     */
        if(i%5 == 0) scrambleAlgorithm(i, 5, 0);
        else if(i%2 == 0) scrambleAlgorithm(i, 2, 0);
        else scrambleAlgorithm(i, 2, 1);
    }
  }


  /* Sorts the positions of the slices that are in the wheel by prize amount,
   * but without changing the pattern of the colors.
   */
  
  
  // Apply insertion sort algorithm
  private void insertSort(ArrayList<Slice> arr)
  {
      for(int i = 1; i < arr.size(); i++)
      {
          Slice temp = arr.get(i);
          int possibleIndex = i;
          
          for(int j = i; j > 0; j--)
          {
              if(temp.getPrizeAmount() < arr.get(possibleIndex-1).getPrizeAmount())
              {
                  arr.set(possibleIndex, arr.get(possibleIndex-1));
                  possibleIndex--;
              }
          }
          arr.set(possibleIndex, temp);
      }
  }
  
  
  public void sort(){
  
    // Initialize Array Lists for each color slice
    ArrayList<Slice> black = new ArrayList<Slice>();
    ArrayList<Slice> blue = new ArrayList<Slice>();
    ArrayList<Slice> red = new ArrayList<Slice>();
  
    // Organize slices into respective color
    for(int i = 0; i < 20; i++)
    {
        if(i%5 == 0)black.add(slices.get(i));
        else if(i%2 == 0) blue.add(slices.get(i));
        else red.add(slices.get(i));
    }
    
    // Apply insertion sort on each (color) array
    insertSort(black);
    insertSort(blue);
    insertSort(red);
  
    //Sort black slices in original array 
    for(int i = 0, j = 0; i < 20; i+=5, j++)
    {
   /* Swapping incorrect red slice position in
      original array with correct wheel slice
      (ascending order)
     */
      slices.set(i, black.get(j));
    }
    
    // Sort blue slices in original array
    for(int i = 2, j = 0; i < 20; i+=2)
    {
        if(i%5 != 0)
        {
         /* Swapping incorrect blue slice position in
            original array with correct wheel slice
            (ascending order)
            */
            slices.set(i, blue.get(j));
            j++;
        }
    }
    
    // Sort red slices in original array
    for(int i = 1, j = 0; i < 20; i+=2)
    {
        if(i%5 != 0)
        {
         /* Swapping incorrect red slice position in
            original array with correct wheel slice
            (ascending order)
            */
            slices.set(i, red.get(j));
            j++;
        }
    }
  }

  /* COMPLETED METHODS - YOU DO NOT NEED TO CHANGE THESE */

  /* Creates a wheel with 20 preset slices
   */
  public GameWheel()
  {
    this(getStandardPrizes());
  }

  /* Creates a wheel with 20 slices, using values from array parameter
   */
  public GameWheel(int[] prizes)
  {
    currentPos = 0;
    slices = new ArrayList<Slice>();
    for(int i = 0; i < 20; i++){
      int pa = 0;
      String col = "blue";
      if(i < prizes.length)
        pa = prizes[i];
      if (i%5 == 0)
        col = "black";
      else if (i%2 == 1)
        col = "red";
      slices.add(new Slice(col, pa));
    }
  }

  /* Spins the wheel by so that a different slice is selected. Returns that
   * slice (Note: the 10 slices following the current slice are more likely to
   * be returned than the other 10).
   */
  public Slice spinWheel()
  {
    // spin power between range of 1-50 (inclusive)
    int power = (int)(Math.random()*50 + 1);
    int newPos = (currentPos + power) % slices.size();
    currentPos = newPos;
    return slices.get(currentPos);
  }

  public Slice getSlice(int i){
    int sliceNum = i;
    if(i < 0 || i > 19)
      sliceNum = 0;
    return slices.get(sliceNum);
  }

  // Makes an array with a standard list of prizes
  private static int[] getStandardPrizes()
  {
    int[] arr = new int[20];
    for (int i=0; i < 20; i++)
    {
      if (i%5 == 0)
        arr[i] = i*1000;
      else if (i%2 == 1)
        arr[i] = i*100;
      else
        arr[i] = i*200;
    }
    return arr;
  }
}
