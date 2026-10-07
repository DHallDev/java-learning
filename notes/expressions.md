# Expressions

An expression in Java is basically anything that **produces a value**.  
You can find expressions EVERYWHERE!

- Assignments
- Calculations
- Comparisons
- Boolean Logic
- Method calls (see notes/method.md)

Understanding expressions is important - **every line in Java contains at least one expression*.*

---

## Why Is This Important

Every Java program is a combination of expressions and statements. They lead into:

- statements
- conditionals
- loops
- method calls
- return values
- arithmetic
- boolean logic

---

## Structure of Expressions

Many of these are found in `examples/Expressions/Main.java`

### 1. Assignment Expressions

Store a value into a variable.

    hightScore = 50;

### 2. Arithmetic Expressions

Perform math equations.

    1000 + highScore

### 3. Comparison Expressions

Evaluate to `true` or `false`.

    highScore > 25

### 4. Boolean Expressions

Combine multiple boolean values.

    (health < 25) && (highScore > 1000)

---

## Common Mistakes

- Confusing statements with expressions
- Forgetting that one line can contain multiple expressions
- Forgetting that method calls are expressions
- Forgetting that expressions must produce a value
- Forgetting that a variable reference is an expression

---

## Summary

Expressions are anything that produces a value, and They appear in **EVERY LINE**.  

## Side-Notes:

- Statements and expressions are completely different.
  - An expression becomes a **statements** onl when a `;` is added.
- A method call is an expression **if it returns a value**.
- You can even chain multiple expressions into a even larger expression.
