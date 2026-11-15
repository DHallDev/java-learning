# Minimum/Maximum Number Challenge

## Problem Summary:
Create an endless loop the continously asks the user for numbers. Keep track of the minimum and maximum number provided, and break 
out of the loop if a character is provided. The print out the minimum and maximum number out of the one's provided.

## Rules & Constraints:
* **User Input**: Must receive numbers from the console.
* **Cancellation**: If a character is provided the loop must end.
* **First Number**: The first number provided must be both the minimum and maximum number provided.
* **Early Quit**: If the user quits before entering a number, print a message about having no data.


### Pseudocode (Instructions)
1. Ask the user to input a number.
2. Check to see if the number entered is a valid integer.
    * If not, break out of the loop entirely.
3. Check to see if the number is the first number provided by the user.
   * If yes, number needs to be both the minimum and maximum number provided.
4. Check to see if that number is the smallest or the largest based on what the user already provided.
5. Continue until a character is provided.
6. Check to see if any number was provided by user
   * If not, print: `No valid data entered.`
7. Print out the smallest and largest number provided by the user.