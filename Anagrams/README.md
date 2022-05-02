# Anagrams
For this assignment you will write code for a class named AnagramList which is used to find possible anagrams of a word. Anagrams are formed by rearranging the letters of a word: for example brainy is an anagram of binary. For the purpose of this assignment anagrams do not have to be words themselves: for example raibyn would also be an anagram of binary.

The AnagramList class has a single member variable which is an ArrayList of strings called anagrams and an accessor method to get this variable. The constructor takes a single parameter word, and should use this to create an ordered list containing every possible rearrangement of the characters from word exactly once. See the sample runs for some examples of this.

To assist with this, the constructor should call two private void helper methods which you will implement. You will also write one public method for the class.

## completeAnagrams
* The completeAnagrams method has two String parameters, start and end, and should be written recursively.
* A call to completeAnagrams adds strings to the list anagrams formed by taking every possible rearrangement of the characters in end and adding these to the end of start. For example if start is “ab” and end is “cde” then the strings “abcde”, “abced”, “abdce”, “abdec”, “abecd”, and “abedc” should be added to anagrams.
* You will need to add an appropriate call to the completeAnagrams method in your constructor to add all possible anagrams of the parameter word. Think about what arguments would add all possible rearrangements of the characters in word to the list.
* The completeAnagrams method should ideally not add the same string to anagrams more than once. If you are unable to avoid doing this, you will need to remove any repeated strings in the constructor.
## sortAnagrams
* The sortAnagrams method should sort the list anagrams into alphabetical order.
* You may use any of the sorting algorithms you have encountered in the course to implement this method.
## searchAnagrams
* The public searchAnagrams method should return the index of target in the list anagrams, or -1 if this string is not in the list.
* You may use either of the searching algorithms you have seen in the course to implement this method.

You can test your code by using the runner class (note: the submitted assignment will be tested only with non-empty strings of lower-case letter characters). Be careful to only use small strings (8 characters or less) to test the code. This is because the number of possible anagrams of a word grows factorially as the number of characters increases; it is multiplied by a larger number each time the number of characters increases meaning it gets big very fast. For example the 4 letter word “code” has 24 possible anagrams, but the 8 letter word “computer” has 40,320 possible anagrams. Printing the anagrams of a string with 9 or more letters is likely to cause the code runner to crash.
