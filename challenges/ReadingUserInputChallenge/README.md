# Reading User Input Challenge

## Problem Summary:
Read **5** valid numbers from the console entered by the user and print the sum of those **5** numbers. If they aren't valid integers print 
`Invalid number`, but continue to ask until you are given 5 valid numbers.

## Rules & Constraints:
* **User Input**: Must receive numbers from the console.
* **Validation**: No characters/Strings can be useed as a valid number.
* **Limits**: Code must ask for 5 **valid integer numbers**.
  * meaining 1,2,3 not 1.1, 2.2, 3.3
* 


### Pseudocode (Instructions)
1. Ask the user to input a number.
2. Check to see if the number entered is a valid integer.
    * If not, inform the user and ask again, but for the same number (i.e if you're asking for the 2nd number, the next time the user 
      inputs a number it should still count for the 2nd number.).
3. Add the valid number to a running total.
4. Continue until all 5 numbers have been provided.
5. Print out the total sum.
