## If-Conditionals
An if-statements allows you to take your program to the next stage by allowing it to make decisions.
It checks a boolean expression, if evaluated to true it runs the code inside the `{}`.  
If it's false, then the code is skipped.  
This is the most basic of control-flow logic.

## Rules & Mechanics
- Conditions must evaluate to a boolean value (`true` or `false`);
- Code inside the block (`{}`) only runs if the condition evaluates to true
  - Curly braces define the block of code
- `else` and `else if` are part of the same conditional family, but will be covered later
  - These allow multiple branches of logic
  - Coding examples will be added once I encounter them in the course

## Why is this important
If-conditionals allow my program to:
- make decisions
- react to users input
- validate data
- control flow
- branch into different outcomes
- prevent errors

Without these handy tools, every program will be very static with predetermined uses only.

## Examples

### Basic If-Statement
Taken from my `examples/If-Conditions/Hello.java`.
#### Structure
if (condition) {  
&emsp;// code inside block runs if condition is true  
}

#### Usage
boolean isAlien = false;  
if (isAlien == false) {  
&emsp;System.out.println("It is not an alien!");  
}

### If-Else Statement
Taken from my `examples/If-Conditions/Main.java`.
#### Structure
if (condition) {  
&emsp;// condition is true  
} else {  
&emsp;// condition is false  
}

#### Usage
int score = 5000;  
if (score < 5000) {  
&emsp;System.out.println("Your score was less than 5,000");  
} else {  
&emsp;System.out.println("Got here.");  
}

### Else-If Chain
Used when you have multiple possible outcomes.  
Taken from my `examples/If-Conditions/Main.java`.

#### Structure
if (firstCondition) {  
&emsp;// Code will run only if firstCondition is true;  
} else if (secondCondition) {  
&emsp;// Code will run only if firstCondition is true and secondCondition is false.  
&emsp;// This will be for the same for each sequential else-if statement after this one. There is no limit.  
} else {  
&emsp;// Code will run only if all the other conditions above are false.  
}  


#### Usage
int score = 800;  
if (score < 5000 && score > 1000) {  
&emsp;System.out.println("Your score was less than 5,000, but greater than 1,000.");  
} else if (score < 1000) {  
&emsp;System.out.println("Your score was less than 1,000.");  
} else {  
&emsp;System.out.println("Got here.");  
}

### Logical Operators in Conditions
You can even combine multiple Conditions:

#### **AND** (`&&`)
Both conditions on either side must evaluate to true.  

int topScore = 80;  
int secondTopScore = 60;  
if ((topScore > secondTopScore) && (topScore < 100)) {  
&emsp;System.out.println("Greater than second top score and less than 100");  
}

#### **OR** (`||`)
At least one of the conditions must be true.  

int topScore = 80;  
int secondTopScore = 60;  
if ((topScore > 90) || (secondTopScore <= 90)) {  
&emsp;System.out.println("Either or both of the conditions are true");  
}
#### **NOT** (`!`)
This operator flips the boolean value check.  

int topScore = 100;  
if (topScore != 100) {  
&emsp;System.out.println("You got the high score!");  
}



## Common Mistakes
- Using `=` instead of `==` in comparisons
- Forgetting parentheses around the condition
- Using non-boolean expressions
- Misplacing braces `{}`
- Over-nesting if-statements
- Using `==` to compare Strings instead of `.equals()`

## Summary
If-conditionals allow my programs to make decisions.  
They rely on boolean expressions and are able to control the flow of my code.  
They include:
- `if`
- `else`
- `else if`
- logical operators
- nested conditionals

## Side-Notes
- Conditions must equate to `true` or `false`
-  To check for additional conditions, include `else if`
- `else` has no condition - it runs if every other condition was false
- Complex conditions can be simplified using boolean variables
- When dealing boolean variable conditions either pass it directly or use the `!` operators:
  - if `(isCar)` is the same as if `(isCar == true)`
  - if `(!isCar)` is the same as if `(isCar == false)`
- The ternary operator is introduced in this lesson, but its full explanation is in `operators.md`.
