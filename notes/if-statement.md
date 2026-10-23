# If-Statement
The **if-then** statement tells my program to execute a certain section of code **only** if a particular condition evaluates to **true**. This is
known as **conditional logic**.

**Conditional logic** uses specific statements in Java to check a condition, and execute certain code based on if that condition is 
**true** or **false**.

---

## Rules & Mechanics
- Conditions must evaluate to a **boolean** value (`true` or `false`)
- **if-then** statements does not use an `;`
- Code inside the block (`{}`) only runs if the condition is true
- Curly braces define the block of code
- `else` and `else if` extends the chain
  - `else if` allows multiple branches
  - `else` runs only when all the previous conditions (`if` & `else if`) are false 
- Logical operators (`&&`, `||`, `!`) can be used to combine/modify the conditions

---

## Why Is This Important
**If-then** statements allows my program to:
- make decisions
- react to users input
- validate data
- control flow
- branch into different outcomes
- prevent errors

Without these handy tools, every program will be very static with predetermined uses only.

---

## Structure
Taken from my `examples/If-Conditions/Hello.java`.

### 1. Basic If-Statement
    boolean isAlien = false;
    if (isAlien == false) {  
        System.out.println("It is not an alien!");  
    }

### 2. If-Else Statement
    int score = 5000;  
    if (score < 5000) {  
        System.out.println("Your score was less than 5,000");  
    } else {  
        System.out.println("Got here.");  
    }

### 3. Else-If Chain
Used when you have multiple possible outcomes. Taken from my `examples/If-Conditions/Main.java`.

    int score = 800;  
    if (score < 5000 && score > 1000) {  
        System.out.println("Your score was less than 5,000, but greater than 1,000.");  
    } else if (score < 1000) {  
        System.out.println("Your score was less than 1,000.");  
    } else {  
        System.out.println("Got here.");  
    }

### 4. Logical Operators in Conditions
Taken from my `examples/If-Conditions/Hello.java`. You can even combine multiple conditions:

#### **AND** (`&&`)
Both conditions must evaluate to true.  

    int topScore = 80;
    if (topScore < 100) {
      System.out.println("You got the high score!");
    }

    int secondTopScore = 60;
      if (topScore > secondTopScore && topScore < 100) {
        System.out.println("Greater than second top score and less than 100");
      }

#### **OR** (`||`)
At least one of the conditions must be true.  

    int topScore = 80;  
    int secondTopScore = 60;

    if ((topScore > 90) || (secondTopScore <= 90)) {  
        System.out.println("Either or both of the conditions are true");  
    }

#### **NOT** (`!`)
This operator flips the boolean value check.  

    int topScore = 100;  
    if (topScore != 100) {  
        System.out.println("You got the high score!");  
    }

---

## Common Mistakes
- Using `=` instead of `==` when trying to compare
- Forgetting parentheses around the condition
- Forgetting to put code between `{}` when trying to run multiple statements based on a certain condition
- Using non-boolean expressions
- Misplacing braces `{}`
- Over-nesting if-statements
- Using `==` to compare Strings instead of `.equals()`

---

## Summary
If-conditionals allow my programs to make decisions.  
They rely on boolean expressions and are able to control the flow of my code.  
They include:
- `if`
- `else`
- `else if`
- logical operators
- nested conditionals

---

## Side-Notes
-  To check for additional conditions, include `else if`
- `else` has no condition - it runs if every other condition was false
- `else` must be the last check
- Complex conditions can be simplified using boolean variables
- When dealing boolean variable conditions either use the variables directly or put a `!` operator in front of the variable:
  - if `(isCar)` is the same as if `(isCar == true)`
  - if `(!isCar)` is the same as if `(isCar == false)`
- The ternary operator is introduced in this lesson, but its full explanation is in `operators.md`.
