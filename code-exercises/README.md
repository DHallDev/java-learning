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

- Returning calculation and validation as a ternary mixes logic impacting readability.
- Using helper methods help reduce duplication and improves readability.
- Better to not put calculation/method invocation directly into `println()` to keep it clean

## Solution File

`CodingExercise2.java`

---

# Coding Exercise 3: Accurate Megabytes Converter

## Goal:

Write a method that takes in kilobytes and calculates the total megabytes and remaining kilobytes, and then prints it out in a message.

## Requirements:

### 1. printMegaBytesAndKiloBytes(`int` kiloBytes)

- Return Type: `void`
- Validation check: 
  - if kiloBytes < 0 &rarr; print "Invalid Value"
- Calculate total megabytes and remaining kilobytes
- Prints message: "**XX** KB = **YY** MB and **ZZ** KB"
  - XX = the original value of kilobytes
  - YY = the calculated megabytes
  - ZZ = the remaining kilobytes
  - 1 MB = 1024KB

## Approach:

- Had validation check at the start of the method.
- Created two variables to hold the results from converting kilobytes to megaBytes and remaining kilobytes.
- Printed message, using the variable names

## Observations

- I could have passed the calculations straight into the `println()`. I chose to pass variables to make the println cleaner by just printing a String.

## Solution

`CodingExercise3.java`

--- 

# Coding Exercise 4: Developing A 'Barking Dog' Program

## Goal

Write a method that determines if I should wake up. I need to wake up if the dog is barking before 8:00 or after 22:00.

## Requirements

### 1. shouldWakeUp(`boolean` barking, `int` hourOfDay)

- Return Type: `boolean`
- Validation check: 
  - if `hourOfDay < 0` OR `hourOfDay > 23` &rarr; return false
- Return true/false if dog is barking before 8:00 or after 22:00

## Approach

- Chose to have validation check only check `hourOfDay < 0`
- Chose to have a single line return statement

## Key Observations

- Since according to a 24-hour clock (0-23), I just need to check if `hourOfDay == 23`.
- The `hourOfDay > 23` validation requirement will be met since I am checking `hourOfDay == 23`.
- Could include validation check directly to the `return` statement, causing it to be one line.
  - Decided against it due mixing logic.

## Solution

`CodingExercise4.java`

--- 

# Coding Exercise 5: Implementing A Precise Leap Year Calculator

## Goal:

Write a method that determines whether a year is a leap year

## Requirements:

### 1. isLeapYear(`int` year)

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

## Approach:
- Put validation check at the top of the method.

## Key Observations:

- The basic solution requires multiple nested `if-statements`.
- I can simplify the `if-statements` into a single return by only return everything that makes a year a leap year:
  - year % 4 **equals** 0
  - year % 100 **does not equal** 0
  - year % 400 **equals** 0
- The second bullet has conditions that are based on one another (i.e. year % 4 and year % 100)

## Solution

`CodingExercise5.java`

---

# Coding Exercise 6: Building A Decimal Comparator

## Goal:

Write a method that returns true or false if two decimal numbers are the same up to three decimal places.

## Requirements

### 1. areEqualByThreeDecimalPlaces(`double` firstValue, `double` secondValue)

- Return Type: `boolean`
- Return true/false if the two numbers are the same up to the third decimal place.

## Approach:

- Used single return statement to return the result of comparing both parameters after multiplying them by 1,000 and `casting` to an int.

## Key Observations:

- I can't just check firstValue == secondValue since that will compare the entire value.
- To compare up to three decimal places, I can multiply each number by 1,000, and `cast` the result
  to an `int`, which will truncate the remaining decimal.
- The comparison can be done cleanly in a single `return` statement.

## Solution

`CodingExercise6.java`

---

# Coding Exercise 7: Creating An Equal Sum Checker

## Goal:

Write a method that returns true or false if the sum of the first two number equal the third.

## Requirements:

### 1. hasEqualSum(`int` firstValue, `int` secondValue, `int goal)

- Return Type: `boolean`
- Return true if the sum of firstValue & secondValue is the same

## Approach:

- Used a single return statement to return the comparison

## Key Observations:

- No observations

## Solution:

`CodingExercise7.java`

---

# Coding Exercise 8: Devising A Teen Number Checker

## Goal

Create a method that checks if there is a teen (between 13-19 inclusively) out of three numbers. Create another method that checks if a single number is between 13-19 inclusively.

## Requirements

### 1. hasTeen(`int` firstAge, `int` secondAge, `int` thirdAge)

- Return Type: `boolean`
- Use isTeen() to determine if any of the ages are teens

### 2.  isTeen(`int` age)

- Return Type: `boolean`
- Return if the age is between 13-19 inclusively

## Approach:

- For `isTeen()`, passed the check in one `return` statement.
- For `hasTeen()` passed the check in one `return` statement, using `isTeen()` as a helper

## Key Observations:

- Noticed when I am solving exercises containing 2 methods, a lot of the time a method takes information from the other, allowing me to cut out a lot of duplicate code.
  - After looking up, a method that helps break down a complex task, handle repetitive logic, or manage a specific piece of a larger calculation is called a `helper method`.

## Solution

`CodingExercise8.java`

---

# Coding Exercise 9: A Comprehensive Area Calculator

## Goal

Write 2 method both named area. One calculates the area of a circle, the other calculates the area of a rectangle.

## Requirements

### 1. area(`double` radius)

- Return Type: `double`
- Validation Check: 
  - radius < 0 &rarr; return -1
- Return the area of a circle


### 2. area(`double` x, `double` y)

- Return Type: `double`
- Validation Check: 
  - x < 0 OR y < 0 &rarr; return -1
- Return the area of a rectangle


## Approach: 

- First `area()`
  - I combined the check with the calculation, It mixes the validation with the actual work but since it read as a simple `if-else statement` I thought it read better this way.
  - I used the built-in Java method `Math.pow()` to get the exponent of a value.
  - I used the built-in Java method `Math.PI` to get the value of pi.
- Second `area()`
  - Same as first `area()`, combined the validation with actual work
  - Returned the value of multiplying x and y directly.

## Key Observations

I was very adamant that I was not going to mix validation with the return value. But after contemplating it, I believe it would read better to do it for simple guard clauses that read basically as a simple `if-else 
statement`.

## Solution File

`CodingExercise9.java`

---

# Coding Exercise 10: A Minutes-To-Years-And-Days Calculator

## Goal

Given a set number of minutes calculate the years and days then print them out.

## Requirements:

### 1. printYearsAndDays(`long` minutes)

- Return Type: `void`
- Validation Check: 
  - Minutes < 0 &rarr; print `Invalid Value`
- Print "`XX` min = `YY` y and `ZZ` d"
  - `XX` = original value of minutes
  - `YY` = calculated years
  - `ZZ` = calculated days

## Approach:

- Had validation check at the top of the method.
- Calculated the total hours, days, years, and remaining days from the parameter.
- Printed format using the calculated values.

## Key Observations:

- Whenever I'm tasked with the result being printed out. the method always seems the return type of`void`
- Kept calculations as `long` to keep it simple
- Could have placed the validation check inside the `println()` with the format as a ternary, but with all the `()` and other symbols for the ternary it appeared cluttered.

## Solution File

`CodingExercise10.java`

---

# Coding Exercise 11: An Equality Printer

## Goal

When given 3 numbers, determine if all numbers all the same, they are all different, or Neither are equal or different.

## Requirements

### printEqual(`int` num1, `int` num2, `int` num3)

- Return Type: `void`
- Validation Check: 
  - num1 < 0 OR num2 < 0 OR num3 < 0 &rarr; Print "Invalid Value"
- Print All numbers are equal 
  - example: 1, 1, 1
- Print All number are different 
  - example: 1, 2, 3
- Print Neither all are equal or different 
  - example: 1, 1, 2

## Approach:

- Added validation check at top of method.
- Used `if-else if statements` to print the message

## Key Observations

- Original had the `return` keyword to cut out the `else` block, but it didn't seem to cut down on code
- Originally had the variable names as "firstValue" etc. but it was long to type, and I felt that "num1" conveyed the same meaning as "firstValue".

## Solution File

`CodingExercise11.java`

---

# Coding Exercise 12: Designing A 'Playing Cat' Logic Program

## Goal:

Create a method that needs to determine if the cat is playing based on if it's summer and the temperature 

## Requirements:

### 1. isCatPlaying(`boolean` summer, `int` temperature)

- Return Type: `boolean`
- Cat is playing if temperature is 25-35
  - If it's summer Cat is playing if temperature is 25-45

## Approach:

- Created a variable for the upper limit of temperature
- Returned directly the comparison if temperature is within the range of the lower/upper limits

## Key Observations:

- Since the upper limit is variable, I attached the possible value to a variable using a ternary operator
- I thought about using a variable for the lower limit, but I assumed that it was implied with the variable temperature being used and `maxTemp` to signify a max temperature. I assume that the using a variable for 
this single value will make the code look cluttered.

## Solution File

`CodingExercise12.java`

---

# Coding Exercise 13: Determining Word Representation Of Numbers Accurately

## Goal:

Write a method called printNumberInWord. The method has one parameter **number** which is the whole number. The method needs to print
**"ZERO", "ONE", "TWO",... "NINE", "OTHER"** if the int parameter number is **0, 1, 2, ... 9** or **other** for any other number including negative numbers. 

## Requirements:

### 1. printNumberInWord(`int` number)
  - Return Type: `void`
  - Prints the number in word format or other for any number below 0 or above 9

## Approach:
- Use `switch` statement as an expression to assessing a value to variable
- Print out that word directly in a `println()`

## Key Observations:

- Problem can be solved with either an `if-else` statement or a `switch` statement.
- If you use an `enhanced switch` you can place it inside an `System.out.println` statement.
- Can assign the word directly to a variable
  - Makes it more readable
  - Doesn't have the problem of changing a `String` since variable is discarded once method is done running.

## Solution File

`CodingExercise13.java`

---

# Coding Exercise 14: Computing Month Length with Leap Year Consideration

## Goal:

Write a method isLeapYear with a parameter of type int named **year**. The parameter needs to be **greater than or equal to 1** and
**less than or equal to 9999**. If the parameter is not in that range return **false**. Otherwise, if it is in the valid range,
calculate if the year is a leap year and return **true** if it is.

Write another method named **getDaysInMonth** with two parameters **month** and **year**. Both of type **int**. If month is **< 1** or **> 12** return -1. If year is
**< 1** or **> 9999** return **-1**. This method needs to return the number of days in the month.

## Requirements

### 1. isLeapYear(`int` year)

  - Return Type: `boolean`
  - Validation Check: 
    - **year** needs to be >= 1 and <= 9999
  - Output: `true` &rarr; month is a leap year; `false` &rarr; if month is not a leap year

### 2. getDaysInMonth(`int` month, `int` year)

  - Return Type: `int`
  - Validation Check: 
    - **month** needs to be >= 1 and <= 12; **year** needs to be >= 1 and <= 9999
  - Output: days in the month based on if the year is a leap year
    - The only month that changes is February

## Approach:

- Used the code done in Coding Exercise 5 to complete the `isLeapYear()`
- Used a `switch expression` to return directly from `getDaysInMonth()`
- Use a ternary to return 28 or 29 based on if it's a leap year
- I put the default as 31 since so many months, and any month not listed would automatically have 31 days

## Key Observations:

- I can run the validation check for `month` inside of the `enhanced switch`
  - This mixes the responsibilities between the validation `if` statement and the `switch` statement.

## Solution File

`CodingExercise14.java`

---

# Coding Exercise 15 — Summing Odd Numbers in a Range

## Problem Summary

Implement two methods: `isOdd()` to determine if a number is positive and odd, and `sumOdd()` to return the sum of all odd numbers within a given 
inclusive range.

## Requirements

### 1. isOdd(`int` number)
- Return Type: `boolean`
- Validation Check:
  - numbers ≤ 0 &rarr; return false
- Return if the number is odd

### 2. sumOdd(`int` start, `int` end)

- Validation Check:
  - end < start &rarr; return -1
  - start < 0 AND end < 0 &rarr; return -1
- Use `isOdd` as a helper method.
- Return the sum of the odd values from start to end

## Approach

- Validated input using guard clauses.
  - Combined validation check with the return statement in `isOdd()`
  - Only checked if `end < start || start < 0`
- `isOdd()` checked if number is not evenly divisible by 2.
- Created a variable to ensure that the first number we start with is odd called `oddStart`
- Created a variable to hold the sum called `sumOfOddNumbers`
- Looped from oddStart until end incrementing the variable by 2

## Key Observations

- Guard clauses reduce nesting.
- Helper method prevents duplicated odd-checking logic.
- the "initialization" part of a for loop is optional, still need a `;` for that portion however.
- When trying to understand how to optimize my loop, I should look for 3 things:
  - Can I skip the Line
  - Am I looking at things I don't need to look at?
  - Am I doing the same chore twice?

## Solution File

`CodingExercise15.java`

---

# Coding Exercise 16: Identifying Palindromic Numbers For Enhanced Numeric Validation

## Problem Summary:

Implement a method that returns `true` or `false` if the parameter is a Palindrome. Please note that a negative number can be a palindrome.

A palindrome is a number that when reversed is the same as the original number (e.g. 1111 or 1221)

## Requirements:

### 1. isPalindrome(`int` number)

- Return if the parameter is a palindrome or not.


## Approach:

- Created variable of type `int` named originalNumber that holds the original value of number which mutated
- Created variable of type `int` named numberInReverse that holds the value 0, but will hold the number in reverse order
- Created a while loop that will continue as long as `originalNumber` doesn't equal 0.
  - Covers negative numbers since negative numbers can be considered palindromes.
- Multiplied numberInReverse by 10.
- Added the last digit from `originalNumber` to `numberInReverse`
- Got rid of the last digit in `originalNumber`
- Compared `number` to `numberInReverse` and return the result

## Key Observations:

- When removing the last digit `/ 10` removes it regardless of if its negative or positive.
- In order to compare the numbers, a temp variable was needed to hold the value temporarily.
- In order to add the next digit you need to `* 10` to add a 0, therefore being able to add the next digit from `originalNumber`
- Depending on where you put this expression, you could end up adding another 0 at the end of reverse, resulting in the return statement always return `false`.

## Solution.File

`CodingExercise16.java`

---

# Coding Exercise 17: Summing The First And Last Digits Of An Integer

## Problem Summary

Implement a method that takes the first and last number of a given number and return their sum. If the number is negative, return 
-1 to indicate an invalid value.

## Requirements:

### 1. SumFirstAndLastDigit(`int` number)

- Validation Check:
  - If number is negative &rarr; return -1
- Get the last digit of `number`
- Get the first digit of `number`
- Add them together
- Return the result

## Approach:

- Validation check at the top
- Created a variable of type `int` named lastDigit that holds the last digit in `number`
- Created a variable of type `int` named firstDigit that holds the value of `number` but will be changed to hold the first digit in `number`
- Created a variable that will continue until there is only one digit in `firstDigit`
  - This means if `number` is only one digit, both `firstDigit` and `lastDigit` will be the same number
- Returned the sum of `firstDigit` and `lastDigit`

## Key Observations

- Had to change the condition in while loop due to if I continue until `firstDigit > 0 ` is false I'll end up with `firstDigit` as 0.
- Code is possible with a `for` statement as long as I put the condition as the same in the header. But it was easier to of it with an `while` statement.

## Solution.File

`CodingExercise17.java`

---

# Coding Exercise 18: Calculating The Sum Of All Even Digits

## Problem Summary:

Implement a method that returns that sum of the even digits in the number. If the number was negative, return -1 to indicate an invalid value.

## Requirements:

### 1. getEvenDigitSum(`int` number)

- Validation Check:
  - If number is negative &rarr; return -1
- Get the last digit of `number`
- Check if that digit is negative
  - Add to sum if it is
- return the sum

## Approach:

- Validation check at the top
- Create a `int` variable named sum to hold the value of even digits
- Created a for loop that loops until i (which holds the value of `number`) isn't 0
- Check if the last digit in i is even
  - Add the digit to sum if true
- Return the value of sum

## Key Observations

- Could have used a while loop, but used a for loop since the `for` statement header creates a temporary variable that can be 
mutated 
- Initialized a varliable of type `int` called lastDigit that will hold the last digit in `i`
  - In JShell you learn about initializing variables on th same line using `,` it works wonders here.
  - By creating `i` and `lastDigit` in the `for` statement header you created the variables you needed in the narrowest scope 
  possible.

## Solution.File

`CodingExercise18.java`

---

# Coding Exercise 19: Checking For A Shared Digit Between Two Numbers

## Problem Summary:

Implement a method that checks two numbers between 10 - 99 inclusively. The method needs to return whether a digit appears in both numbers.

## Requirements:

### 1. hasSharedDigit(`int` num1, `int` num2)

- Validation Check:
  - If `num1` or `num2` is less than 10 OR greater than 99 &rarr; return false
- Get the last digit of `num1`
- Check if that digit is either digit in `num2`
- If not, get the final digit in `num1` and repeat above

## Approach:

- Validation check at the top
- Created four variables of type `int` that holds each digit in `num1` and `num2` respectively
- Return the result of comparing all four variables

## Solution.File

`CodingExercise19.java`