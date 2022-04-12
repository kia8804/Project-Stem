/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runner_fraction;


public class Fraction
{
    private int numerator;
    private int denominator;
    
    private static int counter = 0;
    private int id;
    
    public Fraction()
    {
        numerator=1;
        denominator=1;
        counter++;
        id = counter;
    }
    
    public Fraction(int n, int d)
    {
        if(n > 0)numerator=n;
        else numerator=1;
        
        if(d > 0)denominator=d;
        else denominator=1;
        
        counter++;
        id = counter;
    }
    
    public int getNumerator()
    {
        return numerator;
    }
    
    public int getDenominator()
    {
        return denominator;
    }
    
    public static int getNumFractions()
    {
        return counter;
    }
    
    public String toString()
    {
        return numerator+"/"+denominator;
    }
    
    public String mixedNumber()
    {
        if(numerator%denominator==0)
        {
            return Integer.toString(numerator/denominator);
        }
        else 
        {
            if(numerator/denominator==0) return numerator%denominator + "/" + denominator;
            else return numerator/denominator + " " + numerator%denominator + "/" + denominator;
        }
    }
    
    public void setNumerator(int n)
    {
        if(n > 0)numerator = n;
    }
    
    public void setDenominator(int d)
    {
        if(d > 0)denominator = d;
    }
    
    public void add(int n, int d)
    {
        if(n > 0 && d > 0)
        {
            numerator = numerator*d+denominator*n;
            if(d != denominator)denominator*=d;
        }  
        counter++;
        id = counter;
    }
    
    public void add(Fraction other)
    {
        numerator = numerator*other.getDenominator()+denominator*other.getNumerator();
        if(other.getDenominator()!=denominator)denominator*=other.getDenominator();
        counter++;
        id = counter;
    }
    
    public void multiply(int n, int d)
    {
        if(n > 0 && d > 0)
        {
            numerator*=n;
            denominator*=d;
        }
        counter++;
        id = counter;
    }
    
    public void multiply(Fraction other)
    {
        numerator*=other.getNumerator();
        denominator*=other.getDenominator();
        counter++;
        id = counter;
    }
    
}
