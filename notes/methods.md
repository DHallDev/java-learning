## Methods

###  Relevant file
Please see` examples/methods/MainChallenge.java`  

Methods are reusable blocks of code that performs a specific task. It can take inputs (called parameters),
perform logic, and can return a value.

## Rules & Mechanics
- You must declare a return type (`void`, `int`, `String`, etc.) when doing the method signature
  - A `return` statement returns control to the invoker
- Proper naming conventions should be used when creating a name for the method (camelCase, descriptive names)
- Must have `()`, even if there are no parameters
- Parameters must go inside the `()`; method body goes inside `{}`
- If the return type is not `void`, the method **must** return a value of that type.
- Methods must be called or "invoked" to run
- The `static` keyword means that the method belongs ot the class, not an object
- Methods live inside classes. You can't have a method declared in another method
- Methods only return one value
- Parameters behave like local variables inside the method.
- The **method signature** is the method name + parameter list.

## Why Is This Important
Methods allow my program to:
- Reduce code duplication
- Organize logic
- Break big problems into smaller, manageable steps
- Pass data around my program
- Makes my code readable and maintainable

## Example
### No Parameters method
    public static void calculateScore() {
    }  

To Invoke: `methodName();`

### Method With Parameters
    public static void calculateScore(int p1, String p2, {more}) {
        // Method body
    }  

To Invoke:   
    `methodName(10, Hello);`

### Method With A Return Type
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
    int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }

        return finalScore;
    }

To Invoke:
    `int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
    System.out.println("The highScore is " + highScore);`

## Common Mistakes
- Forgetting to return a value when the return type is not `void`.
- Return the wrong data type
- Mismatching argument types or order when calling a method.
- Thinking parameters and arguments are the same thing.
- Trying to declare methods inside another method.
- Forgetting parameters are local to the method.
- Assuming methods can return multiple values.
- Forgetting that `static` methods cannot access non-static fields without an object.

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
- Parameters are what's declared in the method header; arguments are the values pass to the
method when it is invoked.
- When parameters are declared, you don't have to "redeclare" the variables inside the method.
- Arguments must match the parameters **exactly** in type, order, and number.
- You can pass literal values or variable names as arguments. 
  - I should choose whichever version makes my code more readable.
- The `return` statement is usually placed right before the closing brace of the method
- A method call can be used as an expression or a standalone statement.