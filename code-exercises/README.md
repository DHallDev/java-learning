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
`PositiveNegativeZero.java`

### Observations
- Could use a nested ternary operators to cut out on the `else-if` chain.
  - Concise, not readable. Do not recommend
  - Could use variables for the polarities to help with readability, but still it looks cluttered and
uses more memory for a simple check.
- Don't need to use `else` since it can only be one other number if it's not positive/negative.
  - If using `else-if` chains, use a `return` statement to exit the method early, else it will fall-through.

---

## Coding Excercise 2: Implementing A Speed Converter

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
`SpeedConverter.java`