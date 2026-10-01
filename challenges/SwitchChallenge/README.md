# Traditional Switch Challenge

## Goal
Using a `traditional switch` when given a letter, print out the NATO word for it, from A-E.

## Test Values
- Letters A-E

## Notes
- This challenge helped reinforce the helpfulness of using code to help cut down on code duplication.
- I originally had the guard clauses set up in an `else-if` chain. While this code works as intended,
  I think it's better served to have them as separate `if` statements, just like Tim has in his solution
  video. I think the reasoning behind this is because these are not mutual checks (seconds does not need
  minutes to be positive to be under 0 or over 59). I also believe this will tie into logging errors in
  future lessons if we ever go into it.

--- 

# Enhanced Switch Challenge

## Goal

Create a method that returns an String value contain they day of the week based on the number given.  
As a comparison create another method that does the same thing but uses an `if-else` statement.

## Requirements:

### printDayOfWeek
- `return` type: void
- 1 parameter: int day
- assign the String to a variable
- print out the day parameter and the String it stands for.
- must be used using the `enahnced switch` statement

### printWeekDay
- `return` type: void
- 1 parameter: int day
- assign the String to a variable
- print out the day parameter and the String it stands for.
- must be done using `if-else` statements

## Notes:
- `printWeekDay` showcased how much of a hassle having mulitple `if-else if` chains can be when you are just conduction simple checks
- You can't just assign the value to variable in an `if-else` the same way you can in an `enhanced switch`
- The second method can be seen as unoptimal since we technically destroyed the String and made a new one if day is between 0-6.