# Coding Exercises
This repository contains my implementations of foundational Java exercises. Each exercise includes a concise problem summary, my approach, key observations,
and the final solution file. The goal is to demonstrate clear reasoning, clean code, and consistent problem‑solving practices as I build my 
Java fundamentals.


---

# Coding Exercise 1: Positive, Negative, Or Zero Assessment

## Goal
Implement a method that prints whether a given integer is positive, negative or zero.

## Requirements:
### 1. Method checkNumber(int number)
- Return Type: `void`
- if number > 0 &rarr; Print `positive`
- if number < 0 &rarr; Print `negative`
- if number = 0 &rarr; Print `zero`

## Approach:
- Avoided nested ternaries for readability.
- No else used due to `if-statements` printing and exiting early.

## Key Observations:
- Early returns prevent fall-through to code below
- While concise, nested ternaries reduce readability

## Solution.File
`CodingExercise1.java`

---

# Coding Exercise 2: Implementing A Speed Converter

## Goal
Implement two methods: `toMilesPerHour` to calculates kilometers per hour to miles per hour rounded, and `printConversion` that prints out that 
conversion.

## Requirements
### 1. printConversion()
  - Return Type: `void`
  - Validation check:
    - if kilometersPerHour < 0 &rarr; Print "Invalid Value".
  - Use toMilesPerHour as a helper.
  - Prints the message **XX km/h = YY mi/h**:
    - **XX** is the `kilometersPerHour`.
    - **YY** is the `milesPerHour`.
### 2. toMilesPerHour(double kilometersPerHour)
  - Return Type: `long`
  - Validation Check: 
    - if kilometersPerHour < 0 &rarr; return -1
  - Use `Math.round()`
  - return the conversion of kilometers to miles:
    - 1 mile is 1.609 kilometers.

## Approach
- Validate inputs in `if` statements and early `return`.
- Avoided ternary for readability.
- Return the result directly from `Math.round()` calculation.

## Key Observations
- Returning calucation and validation as a ternary mixes logic impacting readability.
- Using helper methods help reduce duplication and improves readability.
- Better to not put calculation/method invocation directly into `println()` to keep it clean

## Solution File
`CodingExercise2.java`

---

## Coding Exercise 3: Accurate Megabytes Converter

### Goal:
Write a method that takes in kilobytes and calculates the total megabytes and remaining kilobytes, and then prints it out in a message.

### Requirements:
#### 1. printMegaBytesAndKiloBytes(`int` kiloBytes)
- Return Type: `void`
- Validation check: 
  - if kiloBytes < 0 &rarr; print "Invalid Value"
- Calculate total megabytes and remaining kilobytes
- Prints message: "**XX** KB = **YY** MB and **ZZ** KB"
  - XX = the original value of kilobytes
  - YY = the calculated megabytes
  - ZZ = the remaining kilobytes
  - 1 MB = 1024KB

### Approach:
- Had validation check at the start of the method.
- Created two variables to hold the results from converting kilobytes to megaBytes and remaining kilobytes.
- Printed message, using the variable names

### Observations
- I could have passed the calculations straight into the `println()`. I chose to pass variables to make the println clearner by just printing a String.

### Solution
`CodingExercise3.java`

--- 

## Coding Exercise 4: Developing A 'Barking Dog' Program

### Goal
Write a method that determines if I should wake up. I need to wake up if the dog is barking before 8:00 or after 22:00.

### Requirements
#### 1. shouldWakeUp(`boolean` barking, `int` hourOfDay)
- Return Type: `boolean`
- Validation check: 
  - if `hourOfDay < 0` OR `hourOfDay > 23` &rarr; return false
- Return true if dog is barking before 8:00 or after 22:00
- Otherwise return false

### Approach
- Chose to have validation check only check `hourOfDay < 0`
- Chose to have a single line return statement

### Key Observations
- Since according to a 24-hour clock (0-23), I just need to check if `hourOfDay == 23`.
- The `hourOfDay > 23` validation requiremnt will be met since I am checking `hourOfDay == 23`.
- Could include validation check directly to the `return` statement, causing it to be one line.
  - Decided against it due mixing logic.

### Solution
`CodingExercise4.java`

--- 

## Coding Exercise 5: Implementing A Precise Leap Year Calculator

### Goal:
Write a method that determines whether a year is a leap year

### Requirements:
#### 1. isLeapYear(`int` year)
- Return Type: `boolean`
- Validation check: 
  - `year < 1` or `year > 9999` &rarr; return false;
- Return if the year is a leap year. (See NOTES)

### Notes:
To determine if a year is a leap year:
1. If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
2. If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
3. If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
4. The year is a leap year (it has 366 days). The method isLeapYear needs to return true.
5. The year is not a leap year (it has 365 days). The method isLeapYear needs to return false.

### Approach:
- Put validation check at the top of the method.

### Key Observations:
- The basic solution requires multiple nested `if-statements`.
- I can simplify the `if-statements` into a single return by only return everything that makes a year a leap year:
  - year % 4 **equals** 0
  - year % 100 **does not equal** 0
  - year % 400 **equals** 0
- The second bullet has conditions that are based on one another (i.e year % 4 and year % 100)

### Solution
`CodingExercise5.java`

---

## Coding Exercise 6: Building A Decimal Comparator

### Goal:
Write a method that returns true or false if two decimal numbers are the same up to three decimal places.

### Requirements
#### 1. areEqualByThreeDecimalPlaces(`double` firstValue, `double` secondValue)
- Return Type: `boolean`
- Return true/false if the two numbers are the same up to the third decimal place.

### Approach:
- Used single return statement to return the result of comparing both parameters after multiplying them by 1,000 and `casting` to an int.

### Key Observations:
- I can't just check firstValue == secondValue since that will compare the entire value.
- To compare up to three decimal places, I can multiply each number by 1,000, and `cast` the result
  to an `int`, which will truncate the remaining decimal.
- The comparison can be done cleanly in a single `return` statement.

### Solution
`CodingExercise6.java`

---

## Coding Exercise 7: Creating An Equal Sum Checker

### Goal
Write a method that returns true or false if the sum of the first two number equal the third.

### Requirements

#### hasEqualSum
- Three parameters: int firstValue, int secondValue, int goal
- `return` a boolean

### Solution
`CodingExercise7.java`

### Observations
- No observations: Rather clear just check if the value of `(firstValue + secondValue)` == `goal`.
  - Can all be done in a single return statement.

---

## Coding Exercise 8: Devising A Teen Number Checker

### Goal
Create a method that checks if there is a teen (between 13-19 inclusively) out of three numbers. Create
another method that checks if a single number is between 13-19 inclusively.

### Requirements

#### hasTeen
- 3 parameters: int firstAge, int secondAge, int thirdAge
- `return` a boolean

#### isTeen
- 1 parameters: int age
- `return` a boolean

### Solution
`CodingExercise8.java`

### Observations
- For `isTeen` I can just pass the check as one `return` statement.
- Instead of writing the same code that was inside `isTeen` inside `hasTeen` for each age we can just
pass each age as an argument to `isTeen`
- Noticed when I am solving exercises containing 2 methods, a lot of the time a method takes information
from the other, allowing me to cut out a lot of duplicate code.
  - After looking up, a method that helps break down a complex task, handle repetitive logic, or manage
  a specific piece of a larger calculation is called a `helper method`.

---

## Coding Exercise 9: A Comprehensive Area Calculator

### Goal
Write 2 method both named area. One calculates the area of a circle, the othe calculates the area of
a rectangle.

### Requirements

#### area (circle)
- 1 parameter: double radius
- `return` the value after finding the area of a circle
- Validation: `return` -1.0 if the parameters is negative to represent an invalid value

#### area (rectangle)
- 2 parameters: double x, double y
- `return` the value after finding the area of a rectangle
- Validation: `return` if either or both of the parameters are negative

### Observations
- For the first `area` we can you use the built-in Java method `Math.pow()` to get the exponent of a
value
- Requirements for the second `area` states "if either or both" but I can check if either value is negative
to get the same outcome.

---

## Coding Exercise 10: A Minutes-To-Years-And-Days Calculator

### Goal
Given a set number of minutes calculate the years and days then print them out.

### Requirements

#### printYearsAndDays
- 1 parameter: long minutes
- `void`
- Validation: print `Invalid Value` if parameter is less than 0
- Format: "`XX` min = `YY` y and `ZZ` d"
  - `XX` = original value of minutes
  - `YY` = calculated years
  - `ZZ` = calculated days

### Observations
- Whenever I'm tasked with the result being printed out. the method always seems the `return` type of
`void`
- Kept calculations as `long` to keep it simple
- To calculate `remainingDays` you have to find the remainder of days after determining how many years
can be made.

---

## Coding Exercise 11: An Equality Printer

### Goal
When given 3 numbers, determine if all numbers all the same, they are all different, or Neither are
equal or different.

### Requirements

#### printEqual
- 3 parameters: int numValue1, int numValue2, int numValue3
- `void`
- Validation: If any number is less than 0: print "Invalid Value"
- All numbers are equal example: 1, 1, 1
- All number are different example: 1, 2, 3
- Neither all are equal or different example: 1, 1, 2

### Observations
- I don't know if there is a way to reduce the checking the same number over again in `else-if` without
creating a nested `if`

---

## Coding Exercise 12: Designing A 'Playing Cat' Logic Program

### Goal
Create a method that needs to determine if the cat is playing based on if it's summer and the temperature 

### Requirements

#### isCatPlaying
- 2 parameters: boolean summer; int temperature
- `return`: boolean
- Cat is playing if temperature is 25-35
  - If it's summer Cat is playing if temperature is 25-45

#### Observations
- Since the upper limit is variable so we can use a ternary operator
- `return` can be one line of code, but reads better if there are to have variables for said choke points

---

# Coding Exercise 13: Determining Word Representation Of Numbers Accurately

## Goal:

Write a method called printNumberInWord. The method has one parameter **number** which is the whole number. The method needs to print
**"ZERO", "ONE", "TWO",... "NINE", "OTHER"** if the int parameter number is **0, 1, 2, ... 9** or **other** for any other number including negative numbers. 

## Requirements:
- `printNumberInWord`
  - Parameter(s): `int` number
  - Return Type: `void`
  - Output: Print out the number in word format

## Notes/Observations:
- Problem can be solved with either an `if-else` statement or a `switch` statement.
- If you use an `enhanced switch` you can place it inside an `System.out.println` statement.
- Can assign the word directly to a variable
  - Makes it more readable
  - Doesn't have the problem of changing a `String` since variable is discarded once method is done running.

---

# Coding Exercise 14: Computing Month Length with Leap Year Consideration

## Goal:

Write a method isLeapYear with a parameter of type int named **year**. The parameter needs to be **greater than or equal to 1** and
**less than or equal to 9999**. If the parameter is not in that range return **false**. Otherwise, if it is in the valid range,
calculate if the year is a leap year and return **true** if it is.

Write another method named **getDaysInMonth** with two parameters **month** and **year**. Both of type **int**. If month is **< 1** or **> 12** return -1. If year is
**< 1** or **> 9999** return **-1**. This method needs to return the number of days in the month.

## Requirements
- `isLeapYear`
  - Parameter(s): `int` year
  - Return Type: `boolean`
  - Validation: **year** needs to be > 1 and < 9999
  - Output: `true` &rarr; month is a leap year; `false` &rarr; if month is not a leap year

- `getDaysInMonth`
  - Parameter(s): `int` month, `int` year
  - Return Type: `int`
  - Validation: **month** needs to be >= 1 and <= 12; **year** needs to be > 1 and < 9999
  - Output: days in the month based on if the year is a leap year
    - The only month that changes is February

## Notes/Observations:
- I can use the code for `isLeapYear` from **Coding Exercise 5: Implementing A Precise Leap Year Calculator**
- I can use an `enhanced switch` to return directly from `getDaysInMonth`
- I can run the validation check for `month` inside of the `enhanced switch`
  - This mixes the responsibilities between the validation `if` statement and the `switch` statement.
- I can use the ternary operator to choose between 28 and 29 for February based on result from `isLeapYear`

---

# Coding Exercise 15 — Summing Odd Numbers in a Range

## Problem Summary
Implement two methods: `isOdd()` to determine if a number is positive and odd, and `sumOdd()` to return the sum of all odd numbers within a given 
inclusive range.

## Requirements
- `isOdd` returns `false` for numbers ≤ 0.
- `sumOdd` returns -1 if:
  - start ≤ 0
  - end ≤ 0
  - end < start
- Use a for loop to accumulate odd values.
- Use `isOdd` as a helper method.

## Approach
- Validate input using guard clauses.
- Loop from start to end and accumulate values where `isOdd(i)` is true.

## Key Observations
- Guard clauses reduce nesting.
- Helper method prevents duplicated odd-checking logic.

## Solution File
`CodingExercise15.java`

---

# Coding Exercise 16: Identifying Palindromic Numbers For Enhanced Numeric Validation

## Problem Summary:
Implement a method that returns `true` or `false` if the parameter is a Palindrome.

## Requirements:
- Method isPalindrome(int number)
- Return `true` if number is a Palindrome
- Return `false` if number isn't a Palindrome


## Approach:


## Key Observations:


## Solution.File
`CodingExercise16.java`
