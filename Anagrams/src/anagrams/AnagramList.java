package anagrams;

import java.util.ArrayList;

public class AnagramList
{
    private final ArrayList<String> anagrams;

    public AnagramList(String word)
    {
        anagrams = new ArrayList<>();
        completeAnagrams("", word);
        
        //remove duplicates
        for(int i = 0; i < anagrams.size(); i++)
        {
            for(int j = i+1; j < anagrams.size(); j++)
            {
                if(anagrams.get(i).equals(anagrams.get(j)))
                {
                    anagrams.set(j, " ");
                }
            }
        }
        for(int i = anagrams.size()-1; i >= 0; i--) if(anagrams.get(i).equals(" ")) anagrams.remove(i);
        
        sortAnagrams();
    }

    private void completeAnagrams(String start, String end)
    {
        if(end.length() == 0) anagrams.add(start+end);
        
        else
        {
            for(int i = 0; i < end.length(); i++)
            {
                char[] arr = end.toCharArray();
                
                char temp = arr[0];
                arr[0] = arr[i];
                arr[i] = temp;
                
                end = String.valueOf(arr);
                
                completeAnagrams(start + end.substring(0,1), end.substring(1));
            }

        }
    }

    //insertion sort
    private void sortAnagrams(){
        for (int j = 1; j < anagrams.size(); j++)
        {
          String temp = anagrams.get(j);
          int possibleIndex = j;
          while (possibleIndex > 0 && temp.compareTo(anagrams.get(possibleIndex - 1)) < 0)
          {
            anagrams.set(possibleIndex, anagrams.get(possibleIndex-1));
            possibleIndex--;
          }
          anagrams.set(possibleIndex, temp);
        }
    }

      public int searchAnagrams(String target){
          for(int i = 0; i < anagrams.size(); i++)
          {
              if(anagrams.get(i).equals(target)) return i;
          }
          return -1;
    }

    // Used to get list of anagrams externally, do not remove
    public ArrayList<String> getAnagrams()
    {
        return anagrams;
    }
}
