For this assignment, you will create a class which must be named Fraction to store fractions. The class will hold two integer values: a numerator and a denominator. For your class, we will stick to positive fractions, meaning the numerator and the denominator must both be greater than 0. Your Fraction class will also keep track of the number of Fraction objects created by a program. You will need to create appropriate variables to store the information in these fields, all of which should be private.

You will also need to add all of the public constructors and methods which are described below. You may choose to add other methods to help you implement these.

**Constructors**

* Fraction(): default constructor which creates a fraction 1/1
* Fraction(int n, int d): If n is positive, set numerator to n. Otherwise, set numerator to 1. If d is positive, set denominator to d. Otherwise, set denominator to 1.

**Accessors**

* int getNumerator(): Returns the numerator of the fraction.
* int getDenominator(): Returns the denominator of the fraction.
* static int getNumFractions(): Returns the number of fractions created in a program so far.
* String toString(): Returns the fraction as a string in the format “numerator/denominator”. For example 1/2 or 5/3.
* String mixedNumber(): Returns any improper (top-heavy) fraction as a mixed number, for example, 2 3/5. If the numerator of the fraction part is 0, return only the integer * part of the mixed number. If the fraction is proper, return only the fraction part.

**Mutators**

* void setNumerator(int n): Sets the numerator of the fraction to n if it is positive.
* void setDenominator(int d): Sets the denominator of the fraction to d if it is positive.
* void add(int n, int d): If n and d are both positive, add the fraction n/d to this fraction. Otherwise, leave the fraction unchanged. In general the sum of the fractions a/b and c/d is(a*d + c*b)/(b*d).
* void add(Fraction other): Add the fraction represented by other to this fraction. In general the sum of the fractions a/b and c/d is(a*d + c*b)/(b*d). Postcondition: the other Fraction is left unchanged.
* void multiply(int n, int d): If n and d are both positive, multiply the fraction n/d by this fraction. Otherwise, leave the fraction unchanged. Unsimplified is ok in this case, the formula for multiplying fractions a/b and c/d is (a * c)/(b*d).
* void multiply(Fraction other): Set this fraction to the product of this fraction and other. Unsimplified is ok in this case, the formula for multiplying fractions a/b and c/d is (a * c)/(b*d). Postcondition: the other Fraction is left unchanged.

This runner class is a little more advanced than some of the others you have seen so far. The runner first creates an initial fraction by using the default constructor which you write in the Fraction class. You then have the option to test each method individually by typing the name of the method, or to create a new Fraction using the other Fraction constructor. When a method requires parameters you'll be asked to input these, and if there is an overloaded method you'll be asked to specify which method signature you want to use by typing 1 or 2.

As the runner code has calls to all the required public Fraction methods, it won't compile or run until it can see headers for all these methods. So it's a good idea to add headers for each method you have to write in the Fraction class when you first start. You can leave the method bodies blank until you are ready to write them, or if a return is required add a dummy return like return 0; or return "";. This way you'll be able to test the methods you write as you go along.
