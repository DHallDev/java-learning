## Expressions

An expression in Java is basically anything that produces a value.  
You can find expressions EVERYWHERE!
- Assignments
- Calculations
- Comparisons
- Boolean Logic
- Method calls (to be touched on later,  but they also count as expressions due to them being able to return a value)

Understanding expressions is important **every line** contains at least one expression.

## Why is this important

Every Java program is a combination of expressions and statements. They lead into:
- statements
- conditionals
- loops
- method calls
- return values
- arithmetic
- boolean logic

## Examples

Many of these are found in `examples/Expressions/Main.java`

### 1. Assignment Expressions
Store a value into a variable.  
hightScore = 50;

### 2. Arithmetic Expressions
Perform math equations.    
1000 + highScore

### 3. Comparison Expressions
Evaluate to true or false.  
highScore > 25

### 4.  Boolean Expressions
Combine multiple boolean values.  
(health < 25) && (highScore > 1000)

## Common Mistakes
- Confusing statements with expressions
- Forgetting that one line can contain multiple expressions
- Forgetting that method calls are expressions
- Forgetting that expressions must produce a value
- Forgetting that a variable reference is an expression

## Summary

Expressions are anything that produces a value.  
They appear in every line of Java code.  

## Side-Notes:
- Statements and expressions are completely different.
  - An expression is only seen as a complete statement once an `;` is added.
