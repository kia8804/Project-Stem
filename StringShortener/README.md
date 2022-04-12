# String-Shortener
The assignment

Your job in this assignment is to write a program that takes a message as a string and reduces the number of characters it uses in two different set ways. The first thing your program will do is ask the user to type a message which will be stored as a String. The String entered should be immediately converted to lowercase as this will make processing much easier. You will then apply two different algorithms to shorten the data contained within the String.

Algorithm 1

This algorithm creates a string from the message in which every vowel (a, e, i, o, and u) is removed unless the vowel is at the very start of a word (i.e., it is preceded by a space or is the first letter of the message). Every repeated non-vowel character is also removed from the new string (i.e., if a character appears several times in a row it should only appear once at that location). So for example the string "I will arrive in Mississippi really soon" becomes "i wl arv in mssp rly sn".

After applying this algorithm, your program should output the shortened message, the number of vowels removed, the number of repeated non-vowel characters removed, and how much shorter the shortened message is than the original message. The exact format in which the program should print this information is shown in the sample runs.

Algorithm 2

This algorithm creates a string by taking each unique character in the message in the order they first appear and putting that letter and the number of times it appears in the original message into the shortened string. Your algorithm should ignore any spaces in the message, and any characters which it has already put into the shortened string. For example, the string "I will arrive in Mississippi really soon" becomes "8i1w4l2a3r1v2e2n1m5s2p1y2o".

After applying this algorithm, your program should output the shortened message, the number of different characters appearing, and how much shorter the shortened message is than the original message. The exact format in which the program should print this information is shown in the sample runs.
