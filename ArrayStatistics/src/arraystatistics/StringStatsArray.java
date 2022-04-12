/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraystatistics;


public class StringStatsArray {

    final private String[] arr;
    
    public StringStatsArray(String[] a) {
        arr = a;
    }

    public String toString() {
        String s= "";
        s+='{';
        for(int i = 0; i < arr.length-1; i++)
        {
            s+= '"' + arr[i] + "\", ";
        }
        s+= '"' + arr[arr.length-1] + "\"}";
        
        return s;
    }

    public double averageLength() {
        double sum = 0;
        for(String i : arr)
        {
            sum+=i.length();
        }
        sum/=arr.length;
        
        return sum;
    }

    public int search(String target) {
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i].equals(target))return i;
        }
        return -1;
    }

    public int sortStatus() {
        boolean increasing = true, decreasing = true;
        for(int i = 0; i < arr.length-1; i++)
        {
            if(arr[i].compareTo(arr[i+1]) > 0) increasing = false;
            if(arr[i].compareTo(arr[i+1]) < 0) decreasing = false;
            if(!increasing && !decreasing)break;
        }
        if(increasing) return 1;
        else if(decreasing) return -1;
        else return 0;
    }

}