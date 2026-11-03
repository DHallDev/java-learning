# Challenge: Digit Sum Challenge

## What Fundamental Is Being Tested:

- `while` loops
- digit extraction using the `%`
- integer division
- loop termination logic
- early returns for invalid input

## What Was The Task:

Implement a method named `sumDigits` that has a single `int` parameter. It needs to parse out each digit from the number and sum the digits up.

## Requirements/Constratints:

- Only **positive** numbers are valid
- If number is **negative**, return `-1`
- Must use a loop to process each digit

## My Approach

- Implemented a validation check early to exit method if requirements weren't met
- Made condition `number > 9` to make sure that the loop only processes numbers with more than a single digit
- Extracted the rightmost digit using `number % 10`
- Removed the rightmost digit using `number /= 10`
- Avoided creating a `lastDigit` variable since `number % 10` is universally understood 
- returned the sum plus the last digit in one line

## Concepts Demonstrate
d
- `while` loop
- Early exits using `return`
- Parsing out the right most digit using (`% 10`)
- Extracting digits using integer division (`/ 10`)

## Mistakes / Lessons Learned

- Variables modified by a method aren't permanent unless the new value is assigned back to the variable.
- Forgetting `number /= 10` causes an infinite loop since number never changes
- Integer Division always truncates, making the digit removal work in this snippet