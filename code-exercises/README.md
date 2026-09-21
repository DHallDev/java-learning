# Coding Exercises
This folder contains all Udemy coding exercises used to reinforce concepts taught in Tim Buchalka's 
Java Masterclass.

# *PLEASE NOTE
The exercises inside Udemy don't allow you to see the test cases. If you want to see, you must use 
`System.out.println`.

---

## Coding Exercise 1: Positive, Negative, Or Zero Assessment

### Goal
Create a method to determine the polarity of a number or if the number is 0.

### Requirements:

#### checkNumber
- 1 Parameter: number
- Print `positive` if number > 0
- Print `negative` if number < 0
- Print `zero` if number = 0

### Solution.File
`CodingExercise1.java`

### Observations
- Could use a nested ternary operators to cut out on the `else-if` chain.
  - Concise, not readable. Do not recommend.
  - Could use variables for the polarities to help with readability, but still it looks cluttered and
uses more memory for a simple check.
- Don't need to use `else` since it can only be one other number if it's not positive/negative.
  - If using `else-if` chains, use a `return` statement to exit the method early, else it will fall-through.

---

## Coding Exercise 2: Implementing A Speed Converter

### Goal
Create a method that calculates kilometers per hour to miles per hour rounded. Then print out that conversion

### Requirements

#### toMilesPerHour
- 1 parameter: kilometersPerHour
- `return` a value
- If `kilometersPerHour` < 0: `return -1`
- return the conversion of kilometers to miles:
  - 1 mile per hour is 1.609 kilometers per hour
- Needs to `return` the value as a long
- Use `Math.round()`

#### printConversion
- 1 parameter: kilometersPerHour
- No `return`
- Prints the message **XX km/h = YY mi/h**
- **XX** is the `kilometersPerHour`
- **YY** is the `milesPerHour`
- If `kilometersPerHour` < 0 print `Invalid Value`

### Solution File
`CodingExercise2.java`

### Observations
- Before doing any calculations in `printConversion` we should check if `kilometersPerHour` is valid.
- Since we are returning calculations in `toMilesPerHour` we could use a ternary operator to handle the
invalid case cleanly.
- `Math.round` `returns` a long value, this means no casting needed.
- Since we call `toMilesPerHour` inside `printConversion` we have clearer calls inside `main`.
- It should be ok to use `toMilesPerHour` directly inside the `println` since it's obvious what the method
does.
  - Vice Versa: I should use variables for my test cases to make it clear what I'm testing.

---

## Coding Exercise 3: Accurate Megabytes Converter

### Goal
Write a method that takes in kilobytes and calculates the total megabytes and remaining kilobytes, 
and then prints out a message

### Requirements

#### printMegaBytesAndKiloBytes
- 1 parameter: int kiloBytes
- No `return`
- Validation check: if kiloBytes < 0 print "Invalid Value"
- Calculates total megabytes and remaining kilobytes
- Prints message: "**XX** KB = **YY** MB and **ZZ** KB"
- XX = the original value of kilobytes
- YY = the calculated megabytes
- ZZ = the remaining kilobytes
- 1 MB = 1024KB

### Solution
`CodingExercise3.java`

### Observations
- Can pass the calculations straight into the `println`, but it leaves it unclear what the calculation
represents

--- 

## Coding Exercise 4: Developing A 'Barking Dog' Program

### Goal
Write a method that determines if I should wake up. We should wake up if the dog is barking before 8 or after
22.

### Requirements

#### shouldWakeUp
- 2 parameter: boolean barking, int hourOfDay
- `return` a boolean
- Validation check: if hourOfDay < 0 or hourOfDay > 23 `return` false


### Solution
`CodingExercise4.java`

### Observations
- For the validation check we only have to check if `hourOfDay < 0`.
- Since according to a 24-hour clock it goes from 0-23, we actually just need to check in `hourOfDay < 8`
  or `hourOfDay == 23`.
- Program will automatically `return false` if the dog is not barking.
- If `hourOfDay > 23` it will also `return false` since we are checking `hourOfDay == 23`.
- Could include validation check directly to the `return` statement, causing it to be one line.
  - Decide against it due to it being harder to read.

--- 

## Coding Exercise 5: Implementing A Precise Leap Year Calculator

### Goal
Write a method that determines whether a year is a leap year

### Requirements

#### isLeapYear
- 1 parameter: int year
- `return` a boolean
- Validation check: year < 1 or year > 9999 `return false`


### Solution
`CodingExercise5.java`

### Notes
To determine if a year is a leap year:
1. If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
2. If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
3. If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
4. The year is a leap year (it has 366 days). The method isLeapYear needs to return true.
5. The year is not a leap year (it has 365 days). The method isLeapYear needs to return false.

### Observations
- The basic solution requires multiple nested if statements.
- I can cut down on number of if statements by combining checks such as `if (year % 4) && if (year % 100 == 0)`.
  - I need to make adjustments due to a year being a leap year only if it's **not** divisible by 100.
- After changing the original if statement, Intellij showed that we can simplify the `else if` chain 
even further.
  - After reviewing, I don't see the need for the `else` statement since `return year % 400 == 0` to
end the method.
  - I can simplify the entire `if` statement into a `return` statement. And unlike the above exercise, 
we aren't mixing to validation checks and logic checks together, making it clearer to read.

---

## Coding Exercise 6: Building A Decimal Comparator

### Goal
Write a method that returns true or false if two decimal numbers are the same up to three decimal places.

### Requirements

#### areEqualByThreeDecimalPlaces
- Two parameters: double firstValue, double secondValue
- `return` a boolean

### Solution
`CodingExercise6.java`

### Observations