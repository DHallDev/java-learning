# Methods
A **method** declares executable code that cane be "invoked", passing a fixed number of values as arguments.

---

## Rules & Mechanics
- You must declare a return type (`void`, `int`, `String`, etc.) when doing the **method signature**
  - The **method signature** is the method name + parameter list
  - A `return` statement returns control to the invoker
- Can't put a named method inside another method, and it can't be outside the class code block
- Proper naming conventions should be used when creating a name for the method (camelCase, descriptive names)
- Must have `()`, even if there are no parameters
  - Parameters must go inside the `()`; method body goes inside `{}`
- Arguments must match the parameters **exactly** in type, order, and number.
- If the return type is not `void`, the method **must** return a value of that type.
- Methods must be called or "invoked" to run
- The `static` keyword means that the method belongs ot the class, not an object

You can have multiple methods with the same name, though they must have different parameters. These are
called `Overloaded Methods`.

---

## Why Is This Important
Methods allow my program to:
- Reduce code duplication
- Organize logic
- Break big problems into smaller, manageable steps
- can be executed many times with different results by passing data to them
- Makes my code readable and maintainable

---

## Example

### No Parameters method
    public static void calculateScore() {
    }  

To Invoke: 

    calculateScore();

### Method With Parameters
When you want your method to do something based on information provided by your file:

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore + ".");
        }
    } 

To Invoke:

    calculateScore(true, 800, 5, 100);

### Method With A Return Type
When you want your method to do calculations and return the result of that calculation back to the main file:

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }

        return finalScore;
    }

To Invoke:

    int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
    System.out.println("The highScore is " + highScore + ".");

---

## Common Mistakes
- Forgetting to return a value when the return type is not `void`.
- Return the wrong data type
- Mismatching argument types or order when calling a method.
- Trying to declare methods inside another method.
- Forgetting that `static` methods cannot access non-static fields without an object.

---

## Summary
Methods are reusable blocks of code that performs a specific task.  
It can take inputs (called parameters).
They can help with the following:  
- Reduce code duplication
- Organize logic
- Break big problems into smaller, manageable steps
- Pass data around my program
- Makes my code readable and maintainable

## Side-Notes
- Parameters are shown in the method declaration, and arguments will be the value that's passed to the method.
- When parameters are declared, you don't have to "redeclare" the variables inside the method.
- You can pass literal values or variable names as arguments. 
  - I should choose whichever version makes my code more readable.
- The `return` statement is usually placed right before the closing brace of the method
- While optional, the `return` can be used to terminate execution of a method early