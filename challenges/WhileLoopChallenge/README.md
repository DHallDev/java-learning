# Challenge: While Loop Challenge

## What Fundamental Is Being Tested:
- `while` loops
- integer division
- loop termination logic

## What Was The Task:
Implement a method named `isEvenNumber` that has a single `int` parameter. It 
needs return if a number is even or not. Then print out how many even and odd
numbers were found between 5 and 20 inclusively, stopping when 5 even numbers 
are found.  

## Requirements/Constratints:
- Use a `break` to exit the loop
- Must include 20 as the ending number.

## My Approach
- Used `return number % 2 == 0` in `isEvenNumber` for the even check to more
  concise
- Implemented variables `number` and `finishedNumber` for 5 & 20 to make code
  more readable
- Used `if` to control whether `evenCount` or `oddCount` was incremented
- Added `break` before `number++` to stop loop before next increment if
  requirements were met.
- Incremented `number` at the bottom to be able to start from 5
- Printed out `oddCount` and `evenCount` outside of loop

## Concepts Demonstrated
- `while` loop
- Using `break` to exit loop
- Method Call inside `if` control-flow statement

## Mistakes / Lessons Learned
- Variables modified by a method aren't permanent unless the new value is assigned back to the variable.
- Forgetting `number /= 10` causes an infinite loop since number never changes
- Integer Division always truncates, making the digit removal work in this snippet