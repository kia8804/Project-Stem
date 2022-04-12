/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraystatistics;


public class NumStatsArray {

    final private double[] arr;
    
    public NumStatsArray(double[] a) {
        arr = a;
    }

    public String toString() {
        String s= "";
        s+='{';
        for(int i = 0; i < arr.length-1; i++)
        {
            s+=Double.toString(arr[i]);
            s+=", ";
        }
        s+=Double.toString(arr[arr.length-1]) + '}';
        
        return s;
    }

    public double average() {
        double sum = 0;
        for(double i : arr)
        {
            sum+=i;
        }
        sum/=arr.length;
        return sum;
    }

    public double range() {
        double max = 0, min = Double.MAX_VALUE;
        for(double i : arr)
        {
            if(i > max) max = i;
            if(i < min) min = i;
        }
        return max-min;
    }

    public int sortStatus() {
        boolean increasing = true, decreasing = true;
        for(int i = 0; i < arr.length-1; i++)
        {
            if(arr[i] > arr[i+1]) increasing = false;
            if(arr[i] < arr[i+1]) decreasing = false;
            if(!decreasing && !increasing)break;
        }
        if(increasing) return 1;
        else if(decreasing) return -1;
        else return 0;
    }

}